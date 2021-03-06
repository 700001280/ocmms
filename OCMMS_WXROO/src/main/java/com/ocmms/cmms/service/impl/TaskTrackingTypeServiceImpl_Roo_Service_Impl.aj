// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.assistance.TaskTrackingType;
import com.ocmms.cmms.repository.TaskTrackingTypeRepository;
import com.ocmms.cmms.service.api.TaskTrackingService;
import com.ocmms.cmms.service.impl.TaskTrackingTypeServiceImpl;
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

privileged aspect TaskTrackingTypeServiceImpl_Roo_Service_Impl {
    
    declare @type: TaskTrackingTypeServiceImpl: @Service;
    
    declare @type: TaskTrackingTypeServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private TaskTrackingTypeRepository TaskTrackingTypeServiceImpl.taskTrackingTypeRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private TaskTrackingService TaskTrackingTypeServiceImpl.taskTrackingService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param taskTrackingTypeRepository
     * @param taskTrackingService
     */
    @Autowired
    public TaskTrackingTypeServiceImpl.new(TaskTrackingTypeRepository taskTrackingTypeRepository, @Lazy TaskTrackingService taskTrackingService) {
        setTaskTrackingTypeRepository(taskTrackingTypeRepository);
        setTaskTrackingService(taskTrackingService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return TaskTrackingTypeRepository
     */
    public TaskTrackingTypeRepository TaskTrackingTypeServiceImpl.getTaskTrackingTypeRepository() {
        return taskTrackingTypeRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskTrackingTypeRepository
     */
    public void TaskTrackingTypeServiceImpl.setTaskTrackingTypeRepository(TaskTrackingTypeRepository taskTrackingTypeRepository) {
        this.taskTrackingTypeRepository = taskTrackingTypeRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return TaskTrackingService
     */
    public TaskTrackingService TaskTrackingTypeServiceImpl.getTaskTrackingService() {
        return taskTrackingService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskTrackingService
     */
    public void TaskTrackingTypeServiceImpl.setTaskTrackingService(TaskTrackingService taskTrackingService) {
        this.taskTrackingService = taskTrackingService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param tasktrackingtype
     * @return Map
     */
    public Map<String, List<MessageI18n>> TaskTrackingTypeServiceImpl.validate(TaskTrackingType tasktrackingtype) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskTrackingType
     * @param taskTrackingsToAdd
     * @return TaskTrackingType
     */
    @Transactional
    public TaskTrackingType TaskTrackingTypeServiceImpl.addToTaskTrackings(TaskTrackingType taskTrackingType, Iterable<Long> taskTrackingsToAdd) {
        List<TaskTracking> taskTrackings = getTaskTrackingService().findAll(taskTrackingsToAdd);
        taskTrackingType.addToTaskTrackings(taskTrackings);
        return getTaskTrackingTypeRepository().save(taskTrackingType);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskTrackingType
     * @param taskTrackingsToRemove
     * @return TaskTrackingType
     */
    @Transactional
    public TaskTrackingType TaskTrackingTypeServiceImpl.removeFromTaskTrackings(TaskTrackingType taskTrackingType, Iterable<Long> taskTrackingsToRemove) {
        List<TaskTracking> taskTrackings = getTaskTrackingService().findAll(taskTrackingsToRemove);
        taskTrackingType.removeFromTaskTrackings(taskTrackings);
        return getTaskTrackingTypeRepository().save(taskTrackingType);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskTrackingType
     * @param taskTrackings
     * @return TaskTrackingType
     */
    @Transactional
    public TaskTrackingType TaskTrackingTypeServiceImpl.setTaskTrackings(TaskTrackingType taskTrackingType, Iterable<Long> taskTrackings) {
        List<TaskTracking> items = getTaskTrackingService().findAll(taskTrackings);
        Set<TaskTracking> currents = taskTrackingType.getTaskTrackings();
        Set<TaskTracking> toRemove = new HashSet<TaskTracking>();
        for (Iterator<TaskTracking> iterator = currents.iterator(); iterator.hasNext();) {
            TaskTracking nextTaskTracking = iterator.next();
            if (items.contains(nextTaskTracking)) {
                items.remove(nextTaskTracking);
            } else {
                toRemove.add(nextTaskTracking);
            }
        }
        taskTrackingType.removeFromTaskTrackings(toRemove);
        taskTrackingType.addToTaskTrackings(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        taskTrackingType.setVersion(taskTrackingType.getVersion() + 1);
        return getTaskTrackingTypeRepository().save(taskTrackingType);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskTrackingType
     */
    @Transactional
    public void TaskTrackingTypeServiceImpl.delete(TaskTrackingType taskTrackingType) {
        // Clear bidirectional one-to-many parent relationship with TaskTracking
        for (TaskTracking item : taskTrackingType.getTaskTrackings()) {
            item.setTaskTrackingType(null);
        }
        
        getTaskTrackingTypeRepository().delete(taskTrackingType);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<TaskTrackingType> TaskTrackingTypeServiceImpl.save(Iterable<TaskTrackingType> entities) {
        return getTaskTrackingTypeRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void TaskTrackingTypeServiceImpl.delete(Iterable<Long> ids) {
        List<TaskTrackingType> toDelete = getTaskTrackingTypeRepository().findAll(ids);
        getTaskTrackingTypeRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return TaskTrackingType
     */
    @Transactional
    public TaskTrackingType TaskTrackingTypeServiceImpl.save(TaskTrackingType entity) {
        return getTaskTrackingTypeRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return TaskTrackingType
     */
    public TaskTrackingType TaskTrackingTypeServiceImpl.findOne(Long id) {
        return getTaskTrackingTypeRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return TaskTrackingType
     */
    public TaskTrackingType TaskTrackingTypeServiceImpl.findOneForUpdate(Long id) {
        return getTaskTrackingTypeRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<TaskTrackingType> TaskTrackingTypeServiceImpl.findAll(Iterable<Long> ids) {
        return getTaskTrackingTypeRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<TaskTrackingType> TaskTrackingTypeServiceImpl.findAll() {
        return getTaskTrackingTypeRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long TaskTrackingTypeServiceImpl.count() {
        return getTaskTrackingTypeRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<TaskTrackingType> TaskTrackingTypeServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getTaskTrackingTypeRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<TaskTrackingType> TaskTrackingTypeServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getTaskTrackingTypeRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<TaskTrackingType> TaskTrackingTypeServiceImpl.getEntityType() {
        return TaskTrackingType.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> TaskTrackingTypeServiceImpl.getIdType() {
        return Long.class;
    }
    
}
