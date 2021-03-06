// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.pm.plan.PlanItem;
import com.ocmms.cmms.repository.PlanItemRepository;
import com.ocmms.cmms.service.impl.PlanItemServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PlanItemServiceImpl_Roo_Service_Impl {
    
    declare @type: PlanItemServiceImpl: @Service;
    
    declare @type: PlanItemServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PlanItemRepository PlanItemServiceImpl.planItemRepository;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param planItemRepository
     */
    @Autowired
    public PlanItemServiceImpl.new(PlanItemRepository planItemRepository) {
        setPlanItemRepository(planItemRepository);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PlanItemRepository
     */
    public PlanItemRepository PlanItemServiceImpl.getPlanItemRepository() {
        return planItemRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param planItemRepository
     */
    public void PlanItemServiceImpl.setPlanItemRepository(PlanItemRepository planItemRepository) {
        this.planItemRepository = planItemRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param planitem
     * @return Map
     */
    public Map<String, List<MessageI18n>> PlanItemServiceImpl.validate(PlanItem planitem) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param planItem
     */
    @Transactional
    public void PlanItemServiceImpl.delete(PlanItem planItem) {
        getPlanItemRepository().delete(planItem);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<PlanItem> PlanItemServiceImpl.save(Iterable<PlanItem> entities) {
        return getPlanItemRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void PlanItemServiceImpl.delete(Iterable<Long> ids) {
        List<PlanItem> toDelete = getPlanItemRepository().findAll(ids);
        getPlanItemRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PlanItem
     */
    @Transactional
    public PlanItem PlanItemServiceImpl.save(PlanItem entity) {
        return getPlanItemRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PlanItem
     */
    public PlanItem PlanItemServiceImpl.findOne(Long id) {
        return getPlanItemRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PlanItem
     */
    public PlanItem PlanItemServiceImpl.findOneForUpdate(Long id) {
        return getPlanItemRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<PlanItem> PlanItemServiceImpl.findAll(Iterable<Long> ids) {
        return getPlanItemRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<PlanItem> PlanItemServiceImpl.findAll() {
        return getPlanItemRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long PlanItemServiceImpl.count() {
        return getPlanItemRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PlanItem> PlanItemServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getPlanItemRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PlanItem> PlanItemServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getPlanItemRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<PlanItem> PlanItemServiceImpl.getEntityType() {
        return PlanItem.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> PlanItemServiceImpl.getIdType() {
        return Long.class;
    }
    
}
