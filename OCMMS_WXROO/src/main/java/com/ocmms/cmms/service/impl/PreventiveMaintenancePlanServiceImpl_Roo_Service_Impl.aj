// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;
import com.ocmms.cmms.repository.PreventiveMaintenancePlanRepository;
import com.ocmms.cmms.service.impl.PreventiveMaintenancePlanServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PreventiveMaintenancePlanServiceImpl_Roo_Service_Impl {
    
    declare @type: PreventiveMaintenancePlanServiceImpl: @Service;
    
    declare @type: PreventiveMaintenancePlanServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PreventiveMaintenancePlanRepository PreventiveMaintenancePlanServiceImpl.preventiveMaintenancePlanRepository;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param preventiveMaintenancePlanRepository
     */
    @Autowired
    public PreventiveMaintenancePlanServiceImpl.new(PreventiveMaintenancePlanRepository preventiveMaintenancePlanRepository) {
        setPreventiveMaintenancePlanRepository(preventiveMaintenancePlanRepository);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PreventiveMaintenancePlanRepository
     */
    public PreventiveMaintenancePlanRepository PreventiveMaintenancePlanServiceImpl.getPreventiveMaintenancePlanRepository() {
        return preventiveMaintenancePlanRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenancePlanRepository
     */
    public void PreventiveMaintenancePlanServiceImpl.setPreventiveMaintenancePlanRepository(PreventiveMaintenancePlanRepository preventiveMaintenancePlanRepository) {
        this.preventiveMaintenancePlanRepository = preventiveMaintenancePlanRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventivemaintenanceplan
     * @return Map
     */
    public Map<String, List<MessageI18n>> PreventiveMaintenancePlanServiceImpl.validate(PreventiveMaintenancePlan preventivemaintenanceplan) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenancePlan
     */
    @Transactional
    public void PreventiveMaintenancePlanServiceImpl.delete(PreventiveMaintenancePlan preventiveMaintenancePlan) {
        getPreventiveMaintenancePlanRepository().delete(preventiveMaintenancePlan);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<PreventiveMaintenancePlan> PreventiveMaintenancePlanServiceImpl.save(Iterable<PreventiveMaintenancePlan> entities) {
        return getPreventiveMaintenancePlanRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void PreventiveMaintenancePlanServiceImpl.delete(Iterable<Long> ids) {
        List<PreventiveMaintenancePlan> toDelete = getPreventiveMaintenancePlanRepository().findAll(ids);
        getPreventiveMaintenancePlanRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PreventiveMaintenancePlan
     */
    @Transactional
    public PreventiveMaintenancePlan PreventiveMaintenancePlanServiceImpl.save(PreventiveMaintenancePlan entity) {
        return getPreventiveMaintenancePlanRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PreventiveMaintenancePlan
     */
    public PreventiveMaintenancePlan PreventiveMaintenancePlanServiceImpl.findOne(Long id) {
        return getPreventiveMaintenancePlanRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PreventiveMaintenancePlan
     */
    public PreventiveMaintenancePlan PreventiveMaintenancePlanServiceImpl.findOneForUpdate(Long id) {
        return getPreventiveMaintenancePlanRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<PreventiveMaintenancePlan> PreventiveMaintenancePlanServiceImpl.findAll(Iterable<Long> ids) {
        return getPreventiveMaintenancePlanRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<PreventiveMaintenancePlan> PreventiveMaintenancePlanServiceImpl.findAll() {
        return getPreventiveMaintenancePlanRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long PreventiveMaintenancePlanServiceImpl.count() {
        return getPreventiveMaintenancePlanRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PreventiveMaintenancePlan> PreventiveMaintenancePlanServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getPreventiveMaintenancePlanRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PreventiveMaintenancePlan> PreventiveMaintenancePlanServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getPreventiveMaintenancePlanRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<PreventiveMaintenancePlan> PreventiveMaintenancePlanServiceImpl.getEntityType() {
        return PreventiveMaintenancePlan.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> PreventiveMaintenancePlanServiceImpl.getIdType() {
        return Long.class;
    }
    
}
