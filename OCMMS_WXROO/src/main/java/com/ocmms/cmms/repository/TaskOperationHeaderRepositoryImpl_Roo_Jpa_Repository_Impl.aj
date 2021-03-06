// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.QTaskOperationHeader;
import com.ocmms.cmms.model.pm.task.TaskOperationHeader;
import com.ocmms.cmms.repository.TaskOperationHeaderRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TaskOperationHeaderRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: TaskOperationHeaderRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.TASK_HEADER_TEXT = "taskHeaderText";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.TASK_OPERATION_HEADER_CODE = "taskOperationHeaderCode";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.OPERATION_NUMBER = "operationNumber";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.OPERATION_SHORT_TEXT = "operationShortText";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.OPERATION_WORK_CENTER = "operationWorkCenter";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.ACTIVITY_TYPE = "activityType";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.CONTROLKEY = "controlkey";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.ORGANIZATION = "organization";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.SYSTEM_CONDITION = "systemCondition";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.OPERATION_LABOR = "operationLabor";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.UNIT_FOR_WORK = "unitForWork";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.NO_OF_REQUIRED_CAPACITY = "noOfRequiredCapacity";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeaderRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<TaskOperationHeader> TaskOperationHeaderRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QTaskOperationHeader taskOperationHeader = QTaskOperationHeader.taskOperationHeader;
        
        JPQLQuery<TaskOperationHeader> query = from(taskOperationHeader);
        
        Path<?>[] paths = new Path<?>[] {taskOperationHeader.taskHeaderText,taskOperationHeader.taskOperationHeaderCode,taskOperationHeader.operationNumber,taskOperationHeader.operationShortText,taskOperationHeader.operationWorkCenter,taskOperationHeader.activityType,taskOperationHeader.controlkey,taskOperationHeader.organization,taskOperationHeader.systemCondition,taskOperationHeader.operationLabor,taskOperationHeader.unitForWork,taskOperationHeader.noOfRequiredCapacity,taskOperationHeader.recordStatus,taskOperationHeader.createdDate,taskOperationHeader.createdBy,taskOperationHeader.lastModifiedDate,taskOperationHeader.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(TASK_HEADER_TEXT, taskOperationHeader.taskHeaderText)
			.map(TASK_OPERATION_HEADER_CODE, taskOperationHeader.taskOperationHeaderCode)
			.map(OPERATION_NUMBER, taskOperationHeader.operationNumber)
			.map(OPERATION_SHORT_TEXT, taskOperationHeader.operationShortText)
			.map(OPERATION_WORK_CENTER, taskOperationHeader.operationWorkCenter)
			.map(ACTIVITY_TYPE, taskOperationHeader.activityType)
			.map(CONTROLKEY, taskOperationHeader.controlkey)
			.map(ORGANIZATION, taskOperationHeader.organization)
			.map(SYSTEM_CONDITION, taskOperationHeader.systemCondition)
			.map(OPERATION_LABOR, taskOperationHeader.operationLabor)
			.map(UNIT_FOR_WORK, taskOperationHeader.unitForWork)
			.map(NO_OF_REQUIRED_CAPACITY, taskOperationHeader.noOfRequiredCapacity)
			.map(RECORD_STATUS, taskOperationHeader.recordStatus)
			.map(CREATED_DATE, taskOperationHeader.createdDate)
			.map(CREATED_BY, taskOperationHeader.createdBy)
			.map(LAST_MODIFIED_DATE, taskOperationHeader.lastModifiedDate)
			.map(LAST_MODIFIED_BY, taskOperationHeader.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, taskOperationHeader);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<TaskOperationHeader> TaskOperationHeaderRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QTaskOperationHeader taskOperationHeader = QTaskOperationHeader.taskOperationHeader;
        
        JPQLQuery<TaskOperationHeader> query = from(taskOperationHeader);
        
        Path<?>[] paths = new Path<?>[] {taskOperationHeader.taskHeaderText,taskOperationHeader.taskOperationHeaderCode,taskOperationHeader.operationNumber,taskOperationHeader.operationShortText,taskOperationHeader.operationWorkCenter,taskOperationHeader.activityType,taskOperationHeader.controlkey,taskOperationHeader.organization,taskOperationHeader.systemCondition,taskOperationHeader.operationLabor,taskOperationHeader.unitForWork,taskOperationHeader.noOfRequiredCapacity,taskOperationHeader.recordStatus,taskOperationHeader.createdDate,taskOperationHeader.createdBy,taskOperationHeader.lastModifiedDate,taskOperationHeader.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(taskOperationHeader.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(TASK_HEADER_TEXT, taskOperationHeader.taskHeaderText)
			.map(TASK_OPERATION_HEADER_CODE, taskOperationHeader.taskOperationHeaderCode)
			.map(OPERATION_NUMBER, taskOperationHeader.operationNumber)
			.map(OPERATION_SHORT_TEXT, taskOperationHeader.operationShortText)
			.map(OPERATION_WORK_CENTER, taskOperationHeader.operationWorkCenter)
			.map(ACTIVITY_TYPE, taskOperationHeader.activityType)
			.map(CONTROLKEY, taskOperationHeader.controlkey)
			.map(ORGANIZATION, taskOperationHeader.organization)
			.map(SYSTEM_CONDITION, taskOperationHeader.systemCondition)
			.map(OPERATION_LABOR, taskOperationHeader.operationLabor)
			.map(UNIT_FOR_WORK, taskOperationHeader.unitForWork)
			.map(NO_OF_REQUIRED_CAPACITY, taskOperationHeader.noOfRequiredCapacity)
			.map(RECORD_STATUS, taskOperationHeader.recordStatus)
			.map(CREATED_DATE, taskOperationHeader.createdDate)
			.map(CREATED_BY, taskOperationHeader.createdBy)
			.map(LAST_MODIFIED_DATE, taskOperationHeader.lastModifiedDate)
			.map(LAST_MODIFIED_BY, taskOperationHeader.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, taskOperationHeader);
    }
    
}
