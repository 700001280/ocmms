// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.repository.PreventiveMaintenanceContentRepository;
import com.ocmms.cmms.service.api.DocumentService;
import com.ocmms.cmms.service.api.ImageDocumentService;
import com.ocmms.cmms.service.impl.PreventiveMaintenanceContentServiceImpl;
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

privileged aspect PreventiveMaintenanceContentServiceImpl_Roo_Service_Impl {
    
    declare @type: PreventiveMaintenanceContentServiceImpl: @Service;
    
    declare @type: PreventiveMaintenanceContentServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PreventiveMaintenanceContentRepository PreventiveMaintenanceContentServiceImpl.preventiveMaintenanceContentRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private DocumentService PreventiveMaintenanceContentServiceImpl.documentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ImageDocumentService PreventiveMaintenanceContentServiceImpl.imageDocumentService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param preventiveMaintenanceContentRepository
     * @param documentService
     * @param imageDocumentService
     */
    @Autowired
    public PreventiveMaintenanceContentServiceImpl.new(PreventiveMaintenanceContentRepository preventiveMaintenanceContentRepository, @Lazy DocumentService documentService, @Lazy ImageDocumentService imageDocumentService) {
        setPreventiveMaintenanceContentRepository(preventiveMaintenanceContentRepository);
        setDocumentService(documentService);
        setImageDocumentService(imageDocumentService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PreventiveMaintenanceContentRepository
     */
    public PreventiveMaintenanceContentRepository PreventiveMaintenanceContentServiceImpl.getPreventiveMaintenanceContentRepository() {
        return preventiveMaintenanceContentRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContentRepository
     */
    public void PreventiveMaintenanceContentServiceImpl.setPreventiveMaintenanceContentRepository(PreventiveMaintenanceContentRepository preventiveMaintenanceContentRepository) {
        this.preventiveMaintenanceContentRepository = preventiveMaintenanceContentRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return DocumentService
     */
    public DocumentService PreventiveMaintenanceContentServiceImpl.getDocumentService() {
        return documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentService
     */
    public void PreventiveMaintenanceContentServiceImpl.setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ImageDocumentService
     */
    public ImageDocumentService PreventiveMaintenanceContentServiceImpl.getImageDocumentService() {
        return imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imageDocumentService
     */
    public void PreventiveMaintenanceContentServiceImpl.setImageDocumentService(ImageDocumentService imageDocumentService) {
        this.imageDocumentService = imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventivemaintenancecontent
     * @return Map
     */
    public Map<String, List<MessageI18n>> PreventiveMaintenanceContentServiceImpl.validate(PreventiveMaintenanceContent preventivemaintenancecontent) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContent
     * @param documentsToAdd
     * @return PreventiveMaintenanceContent
     */
    @Transactional
    public PreventiveMaintenanceContent PreventiveMaintenanceContentServiceImpl.addToDocuments(PreventiveMaintenanceContent preventiveMaintenanceContent, Iterable<Long> documentsToAdd) {
        List<Document> documents = getDocumentService().findAll(documentsToAdd);
        preventiveMaintenanceContent.addToDocuments(documents);
        return getPreventiveMaintenanceContentRepository().save(preventiveMaintenanceContent);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContent
     * @param imagesToAdd
     * @return PreventiveMaintenanceContent
     */
    @Transactional
    public PreventiveMaintenanceContent PreventiveMaintenanceContentServiceImpl.addToImages(PreventiveMaintenanceContent preventiveMaintenanceContent, Iterable<Long> imagesToAdd) {
        List<ImageDocument> images = getImageDocumentService().findAll(imagesToAdd);
        preventiveMaintenanceContent.addToImages(images);
        return getPreventiveMaintenanceContentRepository().save(preventiveMaintenanceContent);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContent
     * @param documentsToRemove
     * @return PreventiveMaintenanceContent
     */
    @Transactional
    public PreventiveMaintenanceContent PreventiveMaintenanceContentServiceImpl.removeFromDocuments(PreventiveMaintenanceContent preventiveMaintenanceContent, Iterable<Long> documentsToRemove) {
        List<Document> documents = getDocumentService().findAll(documentsToRemove);
        preventiveMaintenanceContent.removeFromDocuments(documents);
        return getPreventiveMaintenanceContentRepository().save(preventiveMaintenanceContent);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContent
     * @param imagesToRemove
     * @return PreventiveMaintenanceContent
     */
    @Transactional
    public PreventiveMaintenanceContent PreventiveMaintenanceContentServiceImpl.removeFromImages(PreventiveMaintenanceContent preventiveMaintenanceContent, Iterable<Long> imagesToRemove) {
        List<ImageDocument> images = getImageDocumentService().findAll(imagesToRemove);
        preventiveMaintenanceContent.removeFromImages(images);
        return getPreventiveMaintenanceContentRepository().save(preventiveMaintenanceContent);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContent
     * @param documents
     * @return PreventiveMaintenanceContent
     */
    @Transactional
    public PreventiveMaintenanceContent PreventiveMaintenanceContentServiceImpl.setDocuments(PreventiveMaintenanceContent preventiveMaintenanceContent, Iterable<Long> documents) {
        List<Document> items = getDocumentService().findAll(documents);
        Set<Document> currents = preventiveMaintenanceContent.getDocuments();
        Set<Document> toRemove = new HashSet<Document>();
        for (Iterator<Document> iterator = currents.iterator(); iterator.hasNext();) {
            Document nextDocument = iterator.next();
            if (items.contains(nextDocument)) {
                items.remove(nextDocument);
            } else {
                toRemove.add(nextDocument);
            }
        }
        preventiveMaintenanceContent.removeFromDocuments(toRemove);
        preventiveMaintenanceContent.addToDocuments(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        preventiveMaintenanceContent.setVersion(preventiveMaintenanceContent.getVersion() + 1);
        return getPreventiveMaintenanceContentRepository().save(preventiveMaintenanceContent);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContent
     * @param images
     * @return PreventiveMaintenanceContent
     */
    @Transactional
    public PreventiveMaintenanceContent PreventiveMaintenanceContentServiceImpl.setImages(PreventiveMaintenanceContent preventiveMaintenanceContent, Iterable<Long> images) {
        List<ImageDocument> items = getImageDocumentService().findAll(images);
        Set<ImageDocument> currents = preventiveMaintenanceContent.getImages();
        Set<ImageDocument> toRemove = new HashSet<ImageDocument>();
        for (Iterator<ImageDocument> iterator = currents.iterator(); iterator.hasNext();) {
            ImageDocument nextImageDocument = iterator.next();
            if (items.contains(nextImageDocument)) {
                items.remove(nextImageDocument);
            } else {
                toRemove.add(nextImageDocument);
            }
        }
        preventiveMaintenanceContent.removeFromImages(toRemove);
        preventiveMaintenanceContent.addToImages(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        preventiveMaintenanceContent.setVersion(preventiveMaintenanceContent.getVersion() + 1);
        return getPreventiveMaintenanceContentRepository().save(preventiveMaintenanceContent);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContent
     */
    @Transactional
    public void PreventiveMaintenanceContentServiceImpl.delete(PreventiveMaintenanceContent preventiveMaintenanceContent) {
        // Clear bidirectional many-to-one child relationship with PreventiveMaintenanceStandard
        if (preventiveMaintenanceContent.getPreventiveMaintenanceStandard() != null) {
            preventiveMaintenanceContent.getPreventiveMaintenanceStandard().getPreventiveMaintenanceContents().remove(preventiveMaintenanceContent);
        }
        
        // Clear bidirectional one-to-many parent relationship with Document
        for (Document item : preventiveMaintenanceContent.getDocuments()) {
            item.setPreventiveMaintenanceContent(null);
        }
        
        // Clear bidirectional one-to-many parent relationship with ImageDocument
        for (ImageDocument item : preventiveMaintenanceContent.getImages()) {
            item.setPreventiveMaintenanceContent(null);
        }
        
        getPreventiveMaintenanceContentRepository().delete(preventiveMaintenanceContent);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<PreventiveMaintenanceContent> PreventiveMaintenanceContentServiceImpl.save(Iterable<PreventiveMaintenanceContent> entities) {
        return getPreventiveMaintenanceContentRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void PreventiveMaintenanceContentServiceImpl.delete(Iterable<Long> ids) {
        List<PreventiveMaintenanceContent> toDelete = getPreventiveMaintenanceContentRepository().findAll(ids);
        getPreventiveMaintenanceContentRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PreventiveMaintenanceContent
     */
    @Transactional
    public PreventiveMaintenanceContent PreventiveMaintenanceContentServiceImpl.save(PreventiveMaintenanceContent entity) {
        return getPreventiveMaintenanceContentRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PreventiveMaintenanceContent
     */
    public PreventiveMaintenanceContent PreventiveMaintenanceContentServiceImpl.findOne(Long id) {
        return getPreventiveMaintenanceContentRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PreventiveMaintenanceContent
     */
    public PreventiveMaintenanceContent PreventiveMaintenanceContentServiceImpl.findOneForUpdate(Long id) {
        return getPreventiveMaintenanceContentRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<PreventiveMaintenanceContent> PreventiveMaintenanceContentServiceImpl.findAll(Iterable<Long> ids) {
        return getPreventiveMaintenanceContentRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<PreventiveMaintenanceContent> PreventiveMaintenanceContentServiceImpl.findAll() {
        return getPreventiveMaintenanceContentRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long PreventiveMaintenanceContentServiceImpl.count() {
        return getPreventiveMaintenanceContentRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PreventiveMaintenanceContent> PreventiveMaintenanceContentServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getPreventiveMaintenanceContentRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PreventiveMaintenanceContent> PreventiveMaintenanceContentServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getPreventiveMaintenanceContentRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceStandard
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PreventiveMaintenanceContent> PreventiveMaintenanceContentServiceImpl.findByPreventiveMaintenanceStandard(PreventiveMaintenanceStandard preventiveMaintenanceStandard, GlobalSearch globalSearch, Pageable pageable) {
        return getPreventiveMaintenanceContentRepository().findByPreventiveMaintenanceStandard(preventiveMaintenanceStandard, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceStandard
     * @return Long
     */
    public long PreventiveMaintenanceContentServiceImpl.countByPreventiveMaintenanceStandard(PreventiveMaintenanceStandard preventiveMaintenanceStandard) {
        return getPreventiveMaintenanceContentRepository().countByPreventiveMaintenanceStandard(preventiveMaintenanceStandard);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<PreventiveMaintenanceContent> PreventiveMaintenanceContentServiceImpl.getEntityType() {
        return PreventiveMaintenanceContent.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> PreventiveMaintenanceContentServiceImpl.getIdType() {
        return Long.class;
    }
    
}
