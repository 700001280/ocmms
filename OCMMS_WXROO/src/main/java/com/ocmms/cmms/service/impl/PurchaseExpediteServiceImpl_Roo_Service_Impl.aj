// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import com.ocmms.cmms.repository.PurchaseExpediteRepository;
import com.ocmms.cmms.service.api.DocumentService;
import com.ocmms.cmms.service.api.ImageDocumentService;
import com.ocmms.cmms.service.impl.PurchaseExpediteServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PurchaseExpediteServiceImpl_Roo_Service_Impl {
    
    declare @type: PurchaseExpediteServiceImpl: @Service;
    
    declare @type: PurchaseExpediteServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PurchaseExpediteRepository PurchaseExpediteServiceImpl.purchaseExpediteRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private DocumentService PurchaseExpediteServiceImpl.documentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ImageDocumentService PurchaseExpediteServiceImpl.imageDocumentService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param purchaseExpediteRepository
     * @param documentService
     * @param imageDocumentService
     */
    @Autowired
    public PurchaseExpediteServiceImpl.new(PurchaseExpediteRepository purchaseExpediteRepository, @Lazy DocumentService documentService, @Lazy ImageDocumentService imageDocumentService) {
        setPurchaseExpediteRepository(purchaseExpediteRepository);
        setDocumentService(documentService);
        setImageDocumentService(imageDocumentService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PurchaseExpediteRepository
     */
    public PurchaseExpediteRepository PurchaseExpediteServiceImpl.getPurchaseExpediteRepository() {
        return purchaseExpediteRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseExpediteRepository
     */
    public void PurchaseExpediteServiceImpl.setPurchaseExpediteRepository(PurchaseExpediteRepository purchaseExpediteRepository) {
        this.purchaseExpediteRepository = purchaseExpediteRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return DocumentService
     */
    public DocumentService PurchaseExpediteServiceImpl.getDocumentService() {
        return documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentService
     */
    public void PurchaseExpediteServiceImpl.setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ImageDocumentService
     */
    public ImageDocumentService PurchaseExpediteServiceImpl.getImageDocumentService() {
        return imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imageDocumentService
     */
    public void PurchaseExpediteServiceImpl.setImageDocumentService(ImageDocumentService imageDocumentService) {
        this.imageDocumentService = imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseexpedite
     * @return Map
     */
    public Map<String, List<MessageI18n>> PurchaseExpediteServiceImpl.validate(PurchaseExpedite purchaseexpedite) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseExpedite
     * @param documentsToAdd
     * @return PurchaseExpedite
     */
    @Transactional
    public PurchaseExpedite PurchaseExpediteServiceImpl.addToDocuments(PurchaseExpedite purchaseExpedite, Iterable<Long> documentsToAdd) {
        List<Document> documents = getDocumentService().findAll(documentsToAdd);
        purchaseExpedite.addToDocuments(documents);
        return getPurchaseExpediteRepository().save(purchaseExpedite);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseExpedite
     * @param imagesToAdd
     * @return PurchaseExpedite
     */
    @Transactional
    public PurchaseExpedite PurchaseExpediteServiceImpl.addToImages(PurchaseExpedite purchaseExpedite, Iterable<Long> imagesToAdd) {
        List<ImageDocument> images = getImageDocumentService().findAll(imagesToAdd);
        purchaseExpedite.addToImages(images);
        return getPurchaseExpediteRepository().save(purchaseExpedite);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseExpedite
     * @param documentsToRemove
     * @return PurchaseExpedite
     */
    @Transactional
    public PurchaseExpedite PurchaseExpediteServiceImpl.removeFromDocuments(PurchaseExpedite purchaseExpedite, Iterable<Long> documentsToRemove) {
        List<Document> documents = getDocumentService().findAll(documentsToRemove);
        purchaseExpedite.removeFromDocuments(documents);
        return getPurchaseExpediteRepository().save(purchaseExpedite);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseExpedite
     * @param imagesToRemove
     * @return PurchaseExpedite
     */
    @Transactional
    public PurchaseExpedite PurchaseExpediteServiceImpl.removeFromImages(PurchaseExpedite purchaseExpedite, Iterable<Long> imagesToRemove) {
        List<ImageDocument> images = getImageDocumentService().findAll(imagesToRemove);
        purchaseExpedite.removeFromImages(images);
        return getPurchaseExpediteRepository().save(purchaseExpedite);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseExpedite
     * @param documents
     * @return PurchaseExpedite
     */
    @Transactional
    public PurchaseExpedite PurchaseExpediteServiceImpl.setDocuments(PurchaseExpedite purchaseExpedite, Iterable<Long> documents) {
        List<Document> items = getDocumentService().findAll(documents);
        Set<Document> currents = purchaseExpedite.getDocuments();
        Set<Document> toRemove = new HashSet<Document>();
        for (Iterator<Document> iterator = currents.iterator(); iterator.hasNext();) {
            Document nextDocument = iterator.next();
            if (items.contains(nextDocument)) {
                items.remove(nextDocument);
            } else {
                toRemove.add(nextDocument);
            }
        }
        purchaseExpedite.removeFromDocuments(toRemove);
        purchaseExpedite.addToDocuments(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        purchaseExpedite.setVersion(purchaseExpedite.getVersion() + 1);
        return getPurchaseExpediteRepository().save(purchaseExpedite);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseExpedite
     * @param images
     * @return PurchaseExpedite
     */
    @Transactional
    public PurchaseExpedite PurchaseExpediteServiceImpl.setImages(PurchaseExpedite purchaseExpedite, Iterable<Long> images) {
        List<ImageDocument> items = getImageDocumentService().findAll(images);
        Set<ImageDocument> currents = purchaseExpedite.getImages();
        Set<ImageDocument> toRemove = new HashSet<ImageDocument>();
        for (Iterator<ImageDocument> iterator = currents.iterator(); iterator.hasNext();) {
            ImageDocument nextImageDocument = iterator.next();
            if (items.contains(nextImageDocument)) {
                items.remove(nextImageDocument);
            } else {
                toRemove.add(nextImageDocument);
            }
        }
        purchaseExpedite.removeFromImages(toRemove);
        purchaseExpedite.addToImages(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        purchaseExpedite.setVersion(purchaseExpedite.getVersion() + 1);
        return getPurchaseExpediteRepository().save(purchaseExpedite);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseExpedite
     */
    @Transactional
    public void PurchaseExpediteServiceImpl.delete(PurchaseExpedite purchaseExpedite) {
        // Clear bidirectional many-to-one child relationship with ProcurementOrder
        if (purchaseExpedite.getProcurementOrder() != null) {
            purchaseExpedite.getProcurementOrder().getPurchaseExpedites().remove(purchaseExpedite);
        }
        
        // Clear bidirectional one-to-many parent relationship with Document
        for (Document item : purchaseExpedite.getDocuments()) {
            item.setPurchaseExpedite(null);
        }
        
        // Clear bidirectional one-to-many parent relationship with ImageDocument
        for (ImageDocument item : purchaseExpedite.getImages()) {
            item.setPurchaseExpedite(null);
        }
        
        getPurchaseExpediteRepository().delete(purchaseExpedite);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<PurchaseExpedite> PurchaseExpediteServiceImpl.save(Iterable<PurchaseExpedite> entities) {
        return getPurchaseExpediteRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void PurchaseExpediteServiceImpl.delete(Iterable<Long> ids) {
        List<PurchaseExpedite> toDelete = getPurchaseExpediteRepository().findAll(ids);
        getPurchaseExpediteRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PurchaseExpedite
     */
    @Transactional
    public PurchaseExpedite PurchaseExpediteServiceImpl.save(PurchaseExpedite entity) {
        return getPurchaseExpediteRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PurchaseExpedite
     */
    public PurchaseExpedite PurchaseExpediteServiceImpl.findOne(Long id) {
        return getPurchaseExpediteRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PurchaseExpedite
     */
    public PurchaseExpedite PurchaseExpediteServiceImpl.findOneForUpdate(Long id) {
        return getPurchaseExpediteRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<PurchaseExpedite> PurchaseExpediteServiceImpl.findAll(Iterable<Long> ids) {
        return getPurchaseExpediteRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<PurchaseExpedite> PurchaseExpediteServiceImpl.findAll() {
        return getPurchaseExpediteRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long PurchaseExpediteServiceImpl.count() {
        return getPurchaseExpediteRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PurchaseExpedite> PurchaseExpediteServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getPurchaseExpediteRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PurchaseExpedite> PurchaseExpediteServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getPurchaseExpediteRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PurchaseExpedite> PurchaseExpediteServiceImpl.findByProcurementOrder(ProcurementOrder procurementOrder, GlobalSearch globalSearch, Pageable pageable) {
        return getPurchaseExpediteRepository().findByProcurementOrder(procurementOrder, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @return Long
     */
    public long PurchaseExpediteServiceImpl.countByProcurementOrder(ProcurementOrder procurementOrder) {
        return getPurchaseExpediteRepository().countByProcurementOrder(procurementOrder);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<PurchaseExpedite> PurchaseExpediteServiceImpl.getEntityType() {
        return PurchaseExpedite.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> PurchaseExpediteServiceImpl.getIdType() {
        return Long.class;
    }
    
}
