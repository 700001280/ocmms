// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.loto.LotoIssueReport;
import com.ocmms.cmms.repository.LotoIssueReportRepository;
import com.ocmms.cmms.service.api.DocumentService;
import com.ocmms.cmms.service.api.ImageDocumentService;
import com.ocmms.cmms.service.impl.LotoIssueReportServiceImpl;
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

privileged aspect LotoIssueReportServiceImpl_Roo_Service_Impl {
    
    declare @type: LotoIssueReportServiceImpl: @Service;
    
    declare @type: LotoIssueReportServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private LotoIssueReportRepository LotoIssueReportServiceImpl.lotoIssueReportRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private DocumentService LotoIssueReportServiceImpl.documentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ImageDocumentService LotoIssueReportServiceImpl.imageDocumentService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param lotoIssueReportRepository
     * @param documentService
     * @param imageDocumentService
     */
    @Autowired
    public LotoIssueReportServiceImpl.new(LotoIssueReportRepository lotoIssueReportRepository, @Lazy DocumentService documentService, @Lazy ImageDocumentService imageDocumentService) {
        setLotoIssueReportRepository(lotoIssueReportRepository);
        setDocumentService(documentService);
        setImageDocumentService(imageDocumentService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return LotoIssueReportRepository
     */
    public LotoIssueReportRepository LotoIssueReportServiceImpl.getLotoIssueReportRepository() {
        return lotoIssueReportRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReportRepository
     */
    public void LotoIssueReportServiceImpl.setLotoIssueReportRepository(LotoIssueReportRepository lotoIssueReportRepository) {
        this.lotoIssueReportRepository = lotoIssueReportRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return DocumentService
     */
    public DocumentService LotoIssueReportServiceImpl.getDocumentService() {
        return documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentService
     */
    public void LotoIssueReportServiceImpl.setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ImageDocumentService
     */
    public ImageDocumentService LotoIssueReportServiceImpl.getImageDocumentService() {
        return imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imageDocumentService
     */
    public void LotoIssueReportServiceImpl.setImageDocumentService(ImageDocumentService imageDocumentService) {
        this.imageDocumentService = imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoissuereport
     * @return Map
     */
    public Map<String, List<MessageI18n>> LotoIssueReportServiceImpl.validate(LotoIssueReport lotoissuereport) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReport
     * @param documentsToAdd
     * @return LotoIssueReport
     */
    @Transactional
    public LotoIssueReport LotoIssueReportServiceImpl.addToDocuments(LotoIssueReport lotoIssueReport, Iterable<Long> documentsToAdd) {
        List<Document> documents = getDocumentService().findAll(documentsToAdd);
        lotoIssueReport.addToDocuments(documents);
        return getLotoIssueReportRepository().save(lotoIssueReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReport
     * @param imagesToAdd
     * @return LotoIssueReport
     */
    @Transactional
    public LotoIssueReport LotoIssueReportServiceImpl.addToImages(LotoIssueReport lotoIssueReport, Iterable<Long> imagesToAdd) {
        List<ImageDocument> images = getImageDocumentService().findAll(imagesToAdd);
        lotoIssueReport.addToImages(images);
        return getLotoIssueReportRepository().save(lotoIssueReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReport
     * @param documentsToRemove
     * @return LotoIssueReport
     */
    @Transactional
    public LotoIssueReport LotoIssueReportServiceImpl.removeFromDocuments(LotoIssueReport lotoIssueReport, Iterable<Long> documentsToRemove) {
        List<Document> documents = getDocumentService().findAll(documentsToRemove);
        lotoIssueReport.removeFromDocuments(documents);
        return getLotoIssueReportRepository().save(lotoIssueReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReport
     * @param imagesToRemove
     * @return LotoIssueReport
     */
    @Transactional
    public LotoIssueReport LotoIssueReportServiceImpl.removeFromImages(LotoIssueReport lotoIssueReport, Iterable<Long> imagesToRemove) {
        List<ImageDocument> images = getImageDocumentService().findAll(imagesToRemove);
        lotoIssueReport.removeFromImages(images);
        return getLotoIssueReportRepository().save(lotoIssueReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReport
     * @param documents
     * @return LotoIssueReport
     */
    @Transactional
    public LotoIssueReport LotoIssueReportServiceImpl.setDocuments(LotoIssueReport lotoIssueReport, Iterable<Long> documents) {
        List<Document> items = getDocumentService().findAll(documents);
        Set<Document> currents = lotoIssueReport.getDocuments();
        Set<Document> toRemove = new HashSet<Document>();
        for (Iterator<Document> iterator = currents.iterator(); iterator.hasNext();) {
            Document nextDocument = iterator.next();
            if (items.contains(nextDocument)) {
                items.remove(nextDocument);
            } else {
                toRemove.add(nextDocument);
            }
        }
        lotoIssueReport.removeFromDocuments(toRemove);
        lotoIssueReport.addToDocuments(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        lotoIssueReport.setVersion(lotoIssueReport.getVersion() + 1);
        return getLotoIssueReportRepository().save(lotoIssueReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReport
     * @param images
     * @return LotoIssueReport
     */
    @Transactional
    public LotoIssueReport LotoIssueReportServiceImpl.setImages(LotoIssueReport lotoIssueReport, Iterable<Long> images) {
        List<ImageDocument> items = getImageDocumentService().findAll(images);
        Set<ImageDocument> currents = lotoIssueReport.getImages();
        Set<ImageDocument> toRemove = new HashSet<ImageDocument>();
        for (Iterator<ImageDocument> iterator = currents.iterator(); iterator.hasNext();) {
            ImageDocument nextImageDocument = iterator.next();
            if (items.contains(nextImageDocument)) {
                items.remove(nextImageDocument);
            } else {
                toRemove.add(nextImageDocument);
            }
        }
        lotoIssueReport.removeFromImages(toRemove);
        lotoIssueReport.addToImages(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        lotoIssueReport.setVersion(lotoIssueReport.getVersion() + 1);
        return getLotoIssueReportRepository().save(lotoIssueReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReport
     */
    @Transactional
    public void LotoIssueReportServiceImpl.delete(LotoIssueReport lotoIssueReport) {
        // Clear bidirectional many-to-one child relationship with LotoInfo
        if (lotoIssueReport.getLotoInfo() != null) {
            lotoIssueReport.getLotoInfo().getLotoIssueReports().remove(lotoIssueReport);
        }
        
        // Clear bidirectional one-to-many parent relationship with Document
        for (Document item : lotoIssueReport.getDocuments()) {
            item.setLotoIssueReport(null);
        }
        
        // Clear bidirectional one-to-many parent relationship with ImageDocument
        for (ImageDocument item : lotoIssueReport.getImages()) {
            item.setLotoIssueReport(null);
        }
        
        getLotoIssueReportRepository().delete(lotoIssueReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<LotoIssueReport> LotoIssueReportServiceImpl.save(Iterable<LotoIssueReport> entities) {
        return getLotoIssueReportRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void LotoIssueReportServiceImpl.delete(Iterable<Long> ids) {
        List<LotoIssueReport> toDelete = getLotoIssueReportRepository().findAll(ids);
        getLotoIssueReportRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return LotoIssueReport
     */
    @Transactional
    public LotoIssueReport LotoIssueReportServiceImpl.save(LotoIssueReport entity) {
        return getLotoIssueReportRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return LotoIssueReport
     */
    public LotoIssueReport LotoIssueReportServiceImpl.findOne(Long id) {
        return getLotoIssueReportRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return LotoIssueReport
     */
    public LotoIssueReport LotoIssueReportServiceImpl.findOneForUpdate(Long id) {
        return getLotoIssueReportRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<LotoIssueReport> LotoIssueReportServiceImpl.findAll(Iterable<Long> ids) {
        return getLotoIssueReportRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<LotoIssueReport> LotoIssueReportServiceImpl.findAll() {
        return getLotoIssueReportRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long LotoIssueReportServiceImpl.count() {
        return getLotoIssueReportRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<LotoIssueReport> LotoIssueReportServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getLotoIssueReportRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<LotoIssueReport> LotoIssueReportServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getLotoIssueReportRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoInfo
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<LotoIssueReport> LotoIssueReportServiceImpl.findByLotoInfo(LotoInfo lotoInfo, GlobalSearch globalSearch, Pageable pageable) {
        return getLotoIssueReportRepository().findByLotoInfo(lotoInfo, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoInfo
     * @return Long
     */
    public long LotoIssueReportServiceImpl.countByLotoInfo(LotoInfo lotoInfo) {
        return getLotoIssueReportRepository().countByLotoInfo(lotoInfo);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<LotoIssueReport> LotoIssueReportServiceImpl.getEntityType() {
        return LotoIssueReport.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> LotoIssueReportServiceImpl.getIdType() {
        return Long.class;
    }
    
}
