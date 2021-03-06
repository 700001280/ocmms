// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.QTaskTrackingPriority;
import com.ocmms.cmms.model.assistance.TaskTrackingPriority;
import com.ocmms.cmms.repository.TaskTrackingPriorityRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TaskTrackingPriorityRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: TaskTrackingPriorityRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskTrackingPriorityRepositoryImpl.PRIORITY = "priority";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskTrackingPriorityRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskTrackingPriorityRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskTrackingPriorityRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskTrackingPriorityRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskTrackingPriorityRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskTrackingPriorityRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<TaskTrackingPriority> TaskTrackingPriorityRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QTaskTrackingPriority taskTrackingPriority = QTaskTrackingPriority.taskTrackingPriority;
        
        JPQLQuery<TaskTrackingPriority> query = from(taskTrackingPriority);
        
        Path<?>[] paths = new Path<?>[] {taskTrackingPriority.priority,taskTrackingPriority.description,taskTrackingPriority.recordStatus,taskTrackingPriority.createdDate,taskTrackingPriority.createdBy,taskTrackingPriority.lastModifiedDate,taskTrackingPriority.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(PRIORITY, taskTrackingPriority.priority)
			.map(DESCRIPTION, taskTrackingPriority.description)
			.map(RECORD_STATUS, taskTrackingPriority.recordStatus)
			.map(CREATED_DATE, taskTrackingPriority.createdDate)
			.map(CREATED_BY, taskTrackingPriority.createdBy)
			.map(LAST_MODIFIED_DATE, taskTrackingPriority.lastModifiedDate)
			.map(LAST_MODIFIED_BY, taskTrackingPriority.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, taskTrackingPriority);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<TaskTrackingPriority> TaskTrackingPriorityRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QTaskTrackingPriority taskTrackingPriority = QTaskTrackingPriority.taskTrackingPriority;
        
        JPQLQuery<TaskTrackingPriority> query = from(taskTrackingPriority);
        
        Path<?>[] paths = new Path<?>[] {taskTrackingPriority.priority,taskTrackingPriority.description,taskTrackingPriority.recordStatus,taskTrackingPriority.createdDate,taskTrackingPriority.createdBy,taskTrackingPriority.lastModifiedDate,taskTrackingPriority.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(taskTrackingPriority.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(PRIORITY, taskTrackingPriority.priority)
			.map(DESCRIPTION, taskTrackingPriority.description)
			.map(RECORD_STATUS, taskTrackingPriority.recordStatus)
			.map(CREATED_DATE, taskTrackingPriority.createdDate)
			.map(CREATED_BY, taskTrackingPriority.createdBy)
			.map(LAST_MODIFIED_DATE, taskTrackingPriority.lastModifiedDate)
			.map(LAST_MODIFIED_BY, taskTrackingPriority.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, taskTrackingPriority);
    }
    
}
