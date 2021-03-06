// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.pm.routine.PelletizerMaintenanceRecord;
import com.ocmms.cmms.repository.PelletizerMaintenanceRecordRepository;
import com.ocmms.cmms.service.impl.PelletizerMaintenanceRecordServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PelletizerMaintenanceRecordServiceImpl_Roo_Service_Impl {
    
    declare @type: PelletizerMaintenanceRecordServiceImpl: @Service;
    
    declare @type: PelletizerMaintenanceRecordServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PelletizerMaintenanceRecordRepository PelletizerMaintenanceRecordServiceImpl.pelletizerMaintenanceRecordRepository;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param pelletizerMaintenanceRecordRepository
     */
    @Autowired
    public PelletizerMaintenanceRecordServiceImpl.new(PelletizerMaintenanceRecordRepository pelletizerMaintenanceRecordRepository) {
        setPelletizerMaintenanceRecordRepository(pelletizerMaintenanceRecordRepository);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PelletizerMaintenanceRecordRepository
     */
    public PelletizerMaintenanceRecordRepository PelletizerMaintenanceRecordServiceImpl.getPelletizerMaintenanceRecordRepository() {
        return pelletizerMaintenanceRecordRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizerMaintenanceRecordRepository
     */
    public void PelletizerMaintenanceRecordServiceImpl.setPelletizerMaintenanceRecordRepository(PelletizerMaintenanceRecordRepository pelletizerMaintenanceRecordRepository) {
        this.pelletizerMaintenanceRecordRepository = pelletizerMaintenanceRecordRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizermaintenancerecord
     * @return Map
     */
    public Map<String, List<MessageI18n>> PelletizerMaintenanceRecordServiceImpl.validate(PelletizerMaintenanceRecord pelletizermaintenancerecord) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizerMaintenanceRecord
     */
    @Transactional
    public void PelletizerMaintenanceRecordServiceImpl.delete(PelletizerMaintenanceRecord pelletizerMaintenanceRecord) {
        getPelletizerMaintenanceRecordRepository().delete(pelletizerMaintenanceRecord);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<PelletizerMaintenanceRecord> PelletizerMaintenanceRecordServiceImpl.save(Iterable<PelletizerMaintenanceRecord> entities) {
        return getPelletizerMaintenanceRecordRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void PelletizerMaintenanceRecordServiceImpl.delete(Iterable<Long> ids) {
        List<PelletizerMaintenanceRecord> toDelete = getPelletizerMaintenanceRecordRepository().findAll(ids);
        getPelletizerMaintenanceRecordRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PelletizerMaintenanceRecord
     */
    @Transactional
    public PelletizerMaintenanceRecord PelletizerMaintenanceRecordServiceImpl.save(PelletizerMaintenanceRecord entity) {
        return getPelletizerMaintenanceRecordRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PelletizerMaintenanceRecord
     */
    public PelletizerMaintenanceRecord PelletizerMaintenanceRecordServiceImpl.findOne(Long id) {
        return getPelletizerMaintenanceRecordRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PelletizerMaintenanceRecord
     */
    public PelletizerMaintenanceRecord PelletizerMaintenanceRecordServiceImpl.findOneForUpdate(Long id) {
        return getPelletizerMaintenanceRecordRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<PelletizerMaintenanceRecord> PelletizerMaintenanceRecordServiceImpl.findAll(Iterable<Long> ids) {
        return getPelletizerMaintenanceRecordRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<PelletizerMaintenanceRecord> PelletizerMaintenanceRecordServiceImpl.findAll() {
        return getPelletizerMaintenanceRecordRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long PelletizerMaintenanceRecordServiceImpl.count() {
        return getPelletizerMaintenanceRecordRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PelletizerMaintenanceRecord> PelletizerMaintenanceRecordServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getPelletizerMaintenanceRecordRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PelletizerMaintenanceRecord> PelletizerMaintenanceRecordServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getPelletizerMaintenanceRecordRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<PelletizerMaintenanceRecord> PelletizerMaintenanceRecordServiceImpl.getEntityType() {
        return PelletizerMaintenanceRecord.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> PelletizerMaintenanceRecordServiceImpl.getIdType() {
        return Long.class;
    }
    
}
