// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.mm.storage.PartScrappingOutstockDetail;
import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;
import com.ocmms.cmms.repository.PartScrappingOutstockDetailRepository;
import com.ocmms.cmms.service.impl.PartScrappingOutstockDetailServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PartScrappingOutstockDetailServiceImpl_Roo_Service_Impl {
    
    declare @type: PartScrappingOutstockDetailServiceImpl: @Service;
    
    declare @type: PartScrappingOutstockDetailServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PartScrappingOutstockDetailRepository PartScrappingOutstockDetailServiceImpl.partScrappingOutstockDetailRepository;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param partScrappingOutstockDetailRepository
     */
    @Autowired
    public PartScrappingOutstockDetailServiceImpl.new(PartScrappingOutstockDetailRepository partScrappingOutstockDetailRepository) {
        setPartScrappingOutstockDetailRepository(partScrappingOutstockDetailRepository);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PartScrappingOutstockDetailRepository
     */
    public PartScrappingOutstockDetailRepository PartScrappingOutstockDetailServiceImpl.getPartScrappingOutstockDetailRepository() {
        return partScrappingOutstockDetailRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partScrappingOutstockDetailRepository
     */
    public void PartScrappingOutstockDetailServiceImpl.setPartScrappingOutstockDetailRepository(PartScrappingOutstockDetailRepository partScrappingOutstockDetailRepository) {
        this.partScrappingOutstockDetailRepository = partScrappingOutstockDetailRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partscrappingoutstockdetail
     * @return Map
     */
    public Map<String, List<MessageI18n>> PartScrappingOutstockDetailServiceImpl.validate(PartScrappingOutstockDetail partscrappingoutstockdetail) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partScrappingOutstockDetail
     */
    @Transactional
    public void PartScrappingOutstockDetailServiceImpl.delete(PartScrappingOutstockDetail partScrappingOutstockDetail) {
        // Clear bidirectional many-to-one child relationship with PartScrappingRecord
        if (partScrappingOutstockDetail.getPartScrappingRecord() != null) {
            partScrappingOutstockDetail.getPartScrappingRecord().getPartScrappingOutstockDetails().remove(partScrappingOutstockDetail);
        }
        
        getPartScrappingOutstockDetailRepository().delete(partScrappingOutstockDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<PartScrappingOutstockDetail> PartScrappingOutstockDetailServiceImpl.save(Iterable<PartScrappingOutstockDetail> entities) {
        return getPartScrappingOutstockDetailRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void PartScrappingOutstockDetailServiceImpl.delete(Iterable<Long> ids) {
        List<PartScrappingOutstockDetail> toDelete = getPartScrappingOutstockDetailRepository().findAll(ids);
        getPartScrappingOutstockDetailRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PartScrappingOutstockDetail
     */
    @Transactional
    public PartScrappingOutstockDetail PartScrappingOutstockDetailServiceImpl.save(PartScrappingOutstockDetail entity) {
        return getPartScrappingOutstockDetailRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PartScrappingOutstockDetail
     */
    public PartScrappingOutstockDetail PartScrappingOutstockDetailServiceImpl.findOne(Long id) {
        return getPartScrappingOutstockDetailRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PartScrappingOutstockDetail
     */
    public PartScrappingOutstockDetail PartScrappingOutstockDetailServiceImpl.findOneForUpdate(Long id) {
        return getPartScrappingOutstockDetailRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<PartScrappingOutstockDetail> PartScrappingOutstockDetailServiceImpl.findAll(Iterable<Long> ids) {
        return getPartScrappingOutstockDetailRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<PartScrappingOutstockDetail> PartScrappingOutstockDetailServiceImpl.findAll() {
        return getPartScrappingOutstockDetailRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long PartScrappingOutstockDetailServiceImpl.count() {
        return getPartScrappingOutstockDetailRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PartScrappingOutstockDetail> PartScrappingOutstockDetailServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getPartScrappingOutstockDetailRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PartScrappingOutstockDetail> PartScrappingOutstockDetailServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getPartScrappingOutstockDetailRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partScrappingRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PartScrappingOutstockDetail> PartScrappingOutstockDetailServiceImpl.findByPartScrappingRecord(PartScrappingRecord partScrappingRecord, GlobalSearch globalSearch, Pageable pageable) {
        return getPartScrappingOutstockDetailRepository().findByPartScrappingRecord(partScrappingRecord, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partScrappingRecord
     * @return Long
     */
    public long PartScrappingOutstockDetailServiceImpl.countByPartScrappingRecord(PartScrappingRecord partScrappingRecord) {
        return getPartScrappingOutstockDetailRepository().countByPartScrappingRecord(partScrappingRecord);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<PartScrappingOutstockDetail> PartScrappingOutstockDetailServiceImpl.getEntityType() {
        return PartScrappingOutstockDetail.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> PartScrappingOutstockDetailServiceImpl.getIdType() {
        return Long.class;
    }
    
}
