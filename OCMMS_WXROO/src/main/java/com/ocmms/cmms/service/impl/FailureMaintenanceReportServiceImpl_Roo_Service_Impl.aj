// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;
import com.ocmms.cmms.repository.FailureMaintenanceReportRepository;
import com.ocmms.cmms.service.api.DocumentService;
import com.ocmms.cmms.service.api.ImageDocumentService;
import com.ocmms.cmms.service.impl.FailureMaintenanceReportServiceImpl;
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

privileged aspect FailureMaintenanceReportServiceImpl_Roo_Service_Impl {
    
    declare @type: FailureMaintenanceReportServiceImpl: @Service;
    
    declare @type: FailureMaintenanceReportServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private FailureMaintenanceReportRepository FailureMaintenanceReportServiceImpl.failureMaintenanceReportRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private DocumentService FailureMaintenanceReportServiceImpl.documentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ImageDocumentService FailureMaintenanceReportServiceImpl.imageDocumentService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param failureMaintenanceReportRepository
     * @param documentService
     * @param imageDocumentService
     */
    @Autowired
    public FailureMaintenanceReportServiceImpl.new(FailureMaintenanceReportRepository failureMaintenanceReportRepository, @Lazy DocumentService documentService, @Lazy ImageDocumentService imageDocumentService) {
        setFailureMaintenanceReportRepository(failureMaintenanceReportRepository);
        setDocumentService(documentService);
        setImageDocumentService(imageDocumentService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return FailureMaintenanceReportRepository
     */
    public FailureMaintenanceReportRepository FailureMaintenanceReportServiceImpl.getFailureMaintenanceReportRepository() {
        return failureMaintenanceReportRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReportRepository
     */
    public void FailureMaintenanceReportServiceImpl.setFailureMaintenanceReportRepository(FailureMaintenanceReportRepository failureMaintenanceReportRepository) {
        this.failureMaintenanceReportRepository = failureMaintenanceReportRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return DocumentService
     */
    public DocumentService FailureMaintenanceReportServiceImpl.getDocumentService() {
        return documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentService
     */
    public void FailureMaintenanceReportServiceImpl.setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ImageDocumentService
     */
    public ImageDocumentService FailureMaintenanceReportServiceImpl.getImageDocumentService() {
        return imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imageDocumentService
     */
    public void FailureMaintenanceReportServiceImpl.setImageDocumentService(ImageDocumentService imageDocumentService) {
        this.imageDocumentService = imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failuremaintenancereport
     * @return Map
     */
    public Map<String, List<MessageI18n>> FailureMaintenanceReportServiceImpl.validate(FailureMaintenanceReport failuremaintenancereport) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @param documentsToAdd
     * @return FailureMaintenanceReport
     */
    @Transactional
    public FailureMaintenanceReport FailureMaintenanceReportServiceImpl.addToDocuments(FailureMaintenanceReport failureMaintenanceReport, Iterable<Long> documentsToAdd) {
        List<Document> documents = getDocumentService().findAll(documentsToAdd);
        failureMaintenanceReport.addToDocuments(documents);
        return getFailureMaintenanceReportRepository().save(failureMaintenanceReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @param imagesToAdd
     * @return FailureMaintenanceReport
     */
    @Transactional
    public FailureMaintenanceReport FailureMaintenanceReportServiceImpl.addToImages(FailureMaintenanceReport failureMaintenanceReport, Iterable<Long> imagesToAdd) {
        List<ImageDocument> images = getImageDocumentService().findAll(imagesToAdd);
        failureMaintenanceReport.addToImages(images);
        return getFailureMaintenanceReportRepository().save(failureMaintenanceReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @param documentsToRemove
     * @return FailureMaintenanceReport
     */
    @Transactional
    public FailureMaintenanceReport FailureMaintenanceReportServiceImpl.removeFromDocuments(FailureMaintenanceReport failureMaintenanceReport, Iterable<Long> documentsToRemove) {
        List<Document> documents = getDocumentService().findAll(documentsToRemove);
        failureMaintenanceReport.removeFromDocuments(documents);
        return getFailureMaintenanceReportRepository().save(failureMaintenanceReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @param imagesToRemove
     * @return FailureMaintenanceReport
     */
    @Transactional
    public FailureMaintenanceReport FailureMaintenanceReportServiceImpl.removeFromImages(FailureMaintenanceReport failureMaintenanceReport, Iterable<Long> imagesToRemove) {
        List<ImageDocument> images = getImageDocumentService().findAll(imagesToRemove);
        failureMaintenanceReport.removeFromImages(images);
        return getFailureMaintenanceReportRepository().save(failureMaintenanceReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @param documents
     * @return FailureMaintenanceReport
     */
    @Transactional
    public FailureMaintenanceReport FailureMaintenanceReportServiceImpl.setDocuments(FailureMaintenanceReport failureMaintenanceReport, Iterable<Long> documents) {
        List<Document> items = getDocumentService().findAll(documents);
        Set<Document> currents = failureMaintenanceReport.getDocuments();
        Set<Document> toRemove = new HashSet<Document>();
        for (Iterator<Document> iterator = currents.iterator(); iterator.hasNext();) {
            Document nextDocument = iterator.next();
            if (items.contains(nextDocument)) {
                items.remove(nextDocument);
            } else {
                toRemove.add(nextDocument);
            }
        }
        failureMaintenanceReport.removeFromDocuments(toRemove);
        failureMaintenanceReport.addToDocuments(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        failureMaintenanceReport.setVersion(failureMaintenanceReport.getVersion() + 1);
        return getFailureMaintenanceReportRepository().save(failureMaintenanceReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @param images
     * @return FailureMaintenanceReport
     */
    @Transactional
    public FailureMaintenanceReport FailureMaintenanceReportServiceImpl.setImages(FailureMaintenanceReport failureMaintenanceReport, Iterable<Long> images) {
        List<ImageDocument> items = getImageDocumentService().findAll(images);
        Set<ImageDocument> currents = failureMaintenanceReport.getImages();
        Set<ImageDocument> toRemove = new HashSet<ImageDocument>();
        for (Iterator<ImageDocument> iterator = currents.iterator(); iterator.hasNext();) {
            ImageDocument nextImageDocument = iterator.next();
            if (items.contains(nextImageDocument)) {
                items.remove(nextImageDocument);
            } else {
                toRemove.add(nextImageDocument);
            }
        }
        failureMaintenanceReport.removeFromImages(toRemove);
        failureMaintenanceReport.addToImages(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        failureMaintenanceReport.setVersion(failureMaintenanceReport.getVersion() + 1);
        return getFailureMaintenanceReportRepository().save(failureMaintenanceReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     */
    @Transactional
    public void FailureMaintenanceReportServiceImpl.delete(FailureMaintenanceReport failureMaintenanceReport) {
        // Clear bidirectional one-to-many parent relationship with Document
        for (Document item : failureMaintenanceReport.getDocuments()) {
            item.setFailureMaintenanceReport(null);
        }
        
        // Clear bidirectional one-to-many parent relationship with ImageDocument
        for (ImageDocument item : failureMaintenanceReport.getImages()) {
            item.setFailureMaintenanceReport(null);
        }
        
        getFailureMaintenanceReportRepository().delete(failureMaintenanceReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<FailureMaintenanceReport> FailureMaintenanceReportServiceImpl.save(Iterable<FailureMaintenanceReport> entities) {
        return getFailureMaintenanceReportRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void FailureMaintenanceReportServiceImpl.delete(Iterable<Long> ids) {
        List<FailureMaintenanceReport> toDelete = getFailureMaintenanceReportRepository().findAll(ids);
        getFailureMaintenanceReportRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return FailureMaintenanceReport
     */
    @Transactional
    public FailureMaintenanceReport FailureMaintenanceReportServiceImpl.save(FailureMaintenanceReport entity) {
        return getFailureMaintenanceReportRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return FailureMaintenanceReport
     */
    public FailureMaintenanceReport FailureMaintenanceReportServiceImpl.findOne(Long id) {
        return getFailureMaintenanceReportRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return FailureMaintenanceReport
     */
    public FailureMaintenanceReport FailureMaintenanceReportServiceImpl.findOneForUpdate(Long id) {
        return getFailureMaintenanceReportRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<FailureMaintenanceReport> FailureMaintenanceReportServiceImpl.findAll(Iterable<Long> ids) {
        return getFailureMaintenanceReportRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<FailureMaintenanceReport> FailureMaintenanceReportServiceImpl.findAll() {
        return getFailureMaintenanceReportRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long FailureMaintenanceReportServiceImpl.count() {
        return getFailureMaintenanceReportRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<FailureMaintenanceReport> FailureMaintenanceReportServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getFailureMaintenanceReportRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<FailureMaintenanceReport> FailureMaintenanceReportServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getFailureMaintenanceReportRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<FailureMaintenanceReport> FailureMaintenanceReportServiceImpl.getEntityType() {
        return FailureMaintenanceReport.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> FailureMaintenanceReportServiceImpl.getIdType() {
        return Long.class;
    }
    
}
