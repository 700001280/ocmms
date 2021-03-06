// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.QWorkLog;
import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.assistance.WorkLogType;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.repository.WorkLogRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

privileged aspect WorkLogRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: WorkLogRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.LOG_DATE = "logDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.WORK_LOG_TYPE = "workLogType";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.ASSIGN = "assign";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.REMARK = "remark";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.LOGGER = "logger";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkLogRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<WorkLog> WorkLogRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QWorkLog workLog = QWorkLog.workLog;
        
        JPQLQuery<WorkLog> query = from(workLog);
        
        Path<?>[] paths = new Path<?>[] {workLog.description,workLog.logDate,workLog.workLogType,workLog.assign,workLog.remark,workLog.logger,workLog.recordStatus,workLog.createdDate,workLog.createdBy,workLog.lastModifiedDate,workLog.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DESCRIPTION, workLog.description)
			.map(LOG_DATE, workLog.logDate)
			.map(WORK_LOG_TYPE, workLog.workLogType)
			.map(ASSIGN, workLog.assign)
			.map(REMARK, workLog.remark)
			.map(LOGGER, workLog.logger)
			.map(RECORD_STATUS, workLog.recordStatus)
			.map(CREATED_DATE, workLog.createdDate)
			.map(CREATED_BY, workLog.createdBy)
			.map(LAST_MODIFIED_DATE, workLog.lastModifiedDate)
			.map(LAST_MODIFIED_BY, workLog.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, workLog);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<WorkLog> WorkLogRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QWorkLog workLog = QWorkLog.workLog;
        
        JPQLQuery<WorkLog> query = from(workLog);
        
        Path<?>[] paths = new Path<?>[] {workLog.description,workLog.logDate,workLog.workLogType,workLog.assign,workLog.remark,workLog.logger,workLog.recordStatus,workLog.createdDate,workLog.createdBy,workLog.lastModifiedDate,workLog.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(workLog.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DESCRIPTION, workLog.description)
			.map(LOG_DATE, workLog.logDate)
			.map(WORK_LOG_TYPE, workLog.workLogType)
			.map(ASSIGN, workLog.assign)
			.map(REMARK, workLog.remark)
			.map(LOGGER, workLog.logger)
			.map(RECORD_STATUS, workLog.recordStatus)
			.map(CREATED_DATE, workLog.createdDate)
			.map(CREATED_BY, workLog.createdBy)
			.map(LAST_MODIFIED_DATE, workLog.lastModifiedDate)
			.map(LAST_MODIFIED_BY, workLog.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, workLog);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param logger
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<WorkLog> WorkLogRepositoryImpl.findByLogger(Employee logger, GlobalSearch globalSearch, Pageable pageable) {
        
        QWorkLog workLog = QWorkLog.workLog;
        
        JPQLQuery<WorkLog> query = from(workLog);
        
        Assert.notNull(logger, "logger is required");
        
        query.where(workLog.logger.eq(logger));
        Path<?>[] paths = new Path<?>[] {workLog.description,workLog.logDate,workLog.workLogType,workLog.assign,workLog.remark,workLog.logger,workLog.recordStatus,workLog.createdDate,workLog.createdBy,workLog.lastModifiedDate,workLog.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DESCRIPTION, workLog.description)
			.map(LOG_DATE, workLog.logDate)
			.map(WORK_LOG_TYPE, workLog.workLogType)
			.map(ASSIGN, workLog.assign)
			.map(REMARK, workLog.remark)
			.map(LOGGER, workLog.logger)
			.map(RECORD_STATUS, workLog.recordStatus)
			.map(CREATED_DATE, workLog.createdDate)
			.map(CREATED_BY, workLog.createdBy)
			.map(LAST_MODIFIED_DATE, workLog.lastModifiedDate)
			.map(LAST_MODIFIED_BY, workLog.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, workLog);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLogType
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<WorkLog> WorkLogRepositoryImpl.findByWorkLogType(WorkLogType workLogType, GlobalSearch globalSearch, Pageable pageable) {
        
        QWorkLog workLog = QWorkLog.workLog;
        
        JPQLQuery<WorkLog> query = from(workLog);
        
        Assert.notNull(workLogType, "workLogType is required");
        
        query.where(workLog.workLogType.eq(workLogType));
        Path<?>[] paths = new Path<?>[] {workLog.description,workLog.logDate,workLog.workLogType,workLog.assign,workLog.remark,workLog.logger,workLog.recordStatus,workLog.createdDate,workLog.createdBy,workLog.lastModifiedDate,workLog.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DESCRIPTION, workLog.description)
			.map(LOG_DATE, workLog.logDate)
			.map(WORK_LOG_TYPE, workLog.workLogType)
			.map(ASSIGN, workLog.assign)
			.map(REMARK, workLog.remark)
			.map(LOGGER, workLog.logger)
			.map(RECORD_STATUS, workLog.recordStatus)
			.map(CREATED_DATE, workLog.createdDate)
			.map(CREATED_BY, workLog.createdBy)
			.map(LAST_MODIFIED_DATE, workLog.lastModifiedDate)
			.map(LAST_MODIFIED_BY, workLog.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, workLog);
    }
    
}
