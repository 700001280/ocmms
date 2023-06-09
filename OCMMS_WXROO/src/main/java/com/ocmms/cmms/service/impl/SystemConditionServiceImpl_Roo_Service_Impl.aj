// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.ocmms.cmms.repository.SystemConditionRepository;
import com.ocmms.cmms.service.api.WorkOrderHeaderService;
import com.ocmms.cmms.service.impl.SystemConditionServiceImpl;
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

privileged aspect SystemConditionServiceImpl_Roo_Service_Impl {
    
    declare @type: SystemConditionServiceImpl: @Service;
    
    declare @type: SystemConditionServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private SystemConditionRepository SystemConditionServiceImpl.systemConditionRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private WorkOrderHeaderService SystemConditionServiceImpl.workOrderHeaderService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param systemConditionRepository
     * @param workOrderHeaderService
     */
    @Autowired
    public SystemConditionServiceImpl.new(SystemConditionRepository systemConditionRepository, @Lazy WorkOrderHeaderService workOrderHeaderService) {
        setSystemConditionRepository(systemConditionRepository);
        setWorkOrderHeaderService(workOrderHeaderService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return SystemConditionRepository
     */
    public SystemConditionRepository SystemConditionServiceImpl.getSystemConditionRepository() {
        return systemConditionRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemConditionRepository
     */
    public void SystemConditionServiceImpl.setSystemConditionRepository(SystemConditionRepository systemConditionRepository) {
        this.systemConditionRepository = systemConditionRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderHeaderService
     */
    public WorkOrderHeaderService SystemConditionServiceImpl.getWorkOrderHeaderService() {
        return workOrderHeaderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeaderService
     */
    public void SystemConditionServiceImpl.setWorkOrderHeaderService(WorkOrderHeaderService workOrderHeaderService) {
        this.workOrderHeaderService = workOrderHeaderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemcondition
     * @return Map
     */
    public Map<String, List<MessageI18n>> SystemConditionServiceImpl.validate(SystemCondition systemcondition) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemCondition
     * @param workorderHeadersToAdd
     * @return SystemCondition
     */
    @Transactional
    public SystemCondition SystemConditionServiceImpl.addToWorkorderHeaders(SystemCondition systemCondition, Iterable<Long> workorderHeadersToAdd) {
        List<WorkOrderHeader> workorderHeaders = getWorkOrderHeaderService().findAll(workorderHeadersToAdd);
        systemCondition.addToWorkorderHeaders(workorderHeaders);
        return getSystemConditionRepository().save(systemCondition);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemCondition
     * @param workorderHeadersToRemove
     * @return SystemCondition
     */
    @Transactional
    public SystemCondition SystemConditionServiceImpl.removeFromWorkorderHeaders(SystemCondition systemCondition, Iterable<Long> workorderHeadersToRemove) {
        List<WorkOrderHeader> workorderHeaders = getWorkOrderHeaderService().findAll(workorderHeadersToRemove);
        systemCondition.removeFromWorkorderHeaders(workorderHeaders);
        return getSystemConditionRepository().save(systemCondition);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemCondition
     * @param workorderHeaders
     * @return SystemCondition
     */
    @Transactional
    public SystemCondition SystemConditionServiceImpl.setWorkorderHeaders(SystemCondition systemCondition, Iterable<Long> workorderHeaders) {
        List<WorkOrderHeader> items = getWorkOrderHeaderService().findAll(workorderHeaders);
        Set<WorkOrderHeader> currents = systemCondition.getWorkorderHeaders();
        Set<WorkOrderHeader> toRemove = new HashSet<WorkOrderHeader>();
        for (Iterator<WorkOrderHeader> iterator = currents.iterator(); iterator.hasNext();) {
            WorkOrderHeader nextWorkOrderHeader = iterator.next();
            if (items.contains(nextWorkOrderHeader)) {
                items.remove(nextWorkOrderHeader);
            } else {
                toRemove.add(nextWorkOrderHeader);
            }
        }
        systemCondition.removeFromWorkorderHeaders(toRemove);
        systemCondition.addToWorkorderHeaders(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        systemCondition.setVersion(systemCondition.getVersion() + 1);
        return getSystemConditionRepository().save(systemCondition);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemCondition
     */
    @Transactional
    public void SystemConditionServiceImpl.delete(SystemCondition systemCondition) {
        // Clear bidirectional one-to-many parent relationship with WorkOrderHeader
        for (WorkOrderHeader item : systemCondition.getWorkorderHeaders()) {
            item.setSystemCondition(null);
        }
        
        getSystemConditionRepository().delete(systemCondition);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<SystemCondition> SystemConditionServiceImpl.save(Iterable<SystemCondition> entities) {
        return getSystemConditionRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void SystemConditionServiceImpl.delete(Iterable<Long> ids) {
        List<SystemCondition> toDelete = getSystemConditionRepository().findAll(ids);
        getSystemConditionRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return SystemCondition
     */
    @Transactional
    public SystemCondition SystemConditionServiceImpl.save(SystemCondition entity) {
        return getSystemConditionRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return SystemCondition
     */
    public SystemCondition SystemConditionServiceImpl.findOne(Long id) {
        return getSystemConditionRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return SystemCondition
     */
    public SystemCondition SystemConditionServiceImpl.findOneForUpdate(Long id) {
        return getSystemConditionRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<SystemCondition> SystemConditionServiceImpl.findAll(Iterable<Long> ids) {
        return getSystemConditionRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<SystemCondition> SystemConditionServiceImpl.findAll() {
        return getSystemConditionRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long SystemConditionServiceImpl.count() {
        return getSystemConditionRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<SystemCondition> SystemConditionServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getSystemConditionRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<SystemCondition> SystemConditionServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getSystemConditionRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<SystemCondition> SystemConditionServiceImpl.getEntityType() {
        return SystemCondition.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> SystemConditionServiceImpl.getIdType() {
        return Long.class;
    }
    
}
