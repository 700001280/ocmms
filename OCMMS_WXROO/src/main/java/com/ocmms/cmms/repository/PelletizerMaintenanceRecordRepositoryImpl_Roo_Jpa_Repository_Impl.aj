// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.QPelletizerMaintenanceRecord;
import com.ocmms.cmms.repository.PelletizerMaintenanceRecordRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PelletizerMaintenanceRecordRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: PelletizerMaintenanceRecordRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.MAINT_START_DATE = "maintStartDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.MAINT_END_DATE = "maintEndDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.DOWNTIME = "downtime";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.SHUTDOWN = "shutdown";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.INTERIM = "interim";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.MAINTAINER = "maintainer";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.EQUIPMENT = "equipment";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.ONLINE_RUN_TIME = "onlineRunTime";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PelletizerMaintenanceRecordRepositoryImpl.OFFLINE_RUN_TIME = "offlineRunTime";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PelletizerMaintenanceRecord> PelletizerMaintenanceRecordRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QPelletizerMaintenanceRecord pelletizerMaintenanceRecord = QPelletizerMaintenanceRecord.pelletizerMaintenanceRecord;
        
        JPQLQuery<PelletizerMaintenanceRecord> query = from(pelletizerMaintenanceRecord);
        
        Path<?>[] paths = new Path<?>[] {pelletizerMaintenanceRecord.maintStartDate,pelletizerMaintenanceRecord.maintEndDate,pelletizerMaintenanceRecord.description,pelletizerMaintenanceRecord.downtime,pelletizerMaintenanceRecord.shutdown,pelletizerMaintenanceRecord.interim,pelletizerMaintenanceRecord.maintainer,pelletizerMaintenanceRecord.equipment,pelletizerMaintenanceRecord.recordStatus,pelletizerMaintenanceRecord.createdDate,pelletizerMaintenanceRecord.createdBy,pelletizerMaintenanceRecord.lastModifiedDate,pelletizerMaintenanceRecord.lastModifiedBy,pelletizerMaintenanceRecord.onlineRunTime,pelletizerMaintenanceRecord.offlineRunTime};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(MAINT_START_DATE, pelletizerMaintenanceRecord.maintStartDate)
			.map(MAINT_END_DATE, pelletizerMaintenanceRecord.maintEndDate)
			.map(DESCRIPTION, pelletizerMaintenanceRecord.description)
			.map(DOWNTIME, pelletizerMaintenanceRecord.downtime)
			.map(SHUTDOWN, pelletizerMaintenanceRecord.shutdown)
			.map(INTERIM, pelletizerMaintenanceRecord.interim)
			.map(MAINTAINER, pelletizerMaintenanceRecord.maintainer)
			.map(EQUIPMENT, pelletizerMaintenanceRecord.equipment)
			.map(RECORD_STATUS, pelletizerMaintenanceRecord.recordStatus)
			.map(CREATED_DATE, pelletizerMaintenanceRecord.createdDate)
			.map(CREATED_BY, pelletizerMaintenanceRecord.createdBy)
			.map(LAST_MODIFIED_DATE, pelletizerMaintenanceRecord.lastModifiedDate)
			.map(LAST_MODIFIED_BY, pelletizerMaintenanceRecord.lastModifiedBy)
			.map(ONLINE_RUN_TIME, pelletizerMaintenanceRecord.onlineRunTime)
			.map(OFFLINE_RUN_TIME, pelletizerMaintenanceRecord.offlineRunTime);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, pelletizerMaintenanceRecord);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PelletizerMaintenanceRecord> PelletizerMaintenanceRecordRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QPelletizerMaintenanceRecord pelletizerMaintenanceRecord = QPelletizerMaintenanceRecord.pelletizerMaintenanceRecord;
        
        JPQLQuery<PelletizerMaintenanceRecord> query = from(pelletizerMaintenanceRecord);
        
        Path<?>[] paths = new Path<?>[] {pelletizerMaintenanceRecord.maintStartDate,pelletizerMaintenanceRecord.maintEndDate,pelletizerMaintenanceRecord.description,pelletizerMaintenanceRecord.downtime,pelletizerMaintenanceRecord.shutdown,pelletizerMaintenanceRecord.interim,pelletizerMaintenanceRecord.maintainer,pelletizerMaintenanceRecord.equipment,pelletizerMaintenanceRecord.recordStatus,pelletizerMaintenanceRecord.createdDate,pelletizerMaintenanceRecord.createdBy,pelletizerMaintenanceRecord.lastModifiedDate,pelletizerMaintenanceRecord.lastModifiedBy,pelletizerMaintenanceRecord.onlineRunTime,pelletizerMaintenanceRecord.offlineRunTime};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(pelletizerMaintenanceRecord.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(MAINT_START_DATE, pelletizerMaintenanceRecord.maintStartDate)
			.map(MAINT_END_DATE, pelletizerMaintenanceRecord.maintEndDate)
			.map(DESCRIPTION, pelletizerMaintenanceRecord.description)
			.map(DOWNTIME, pelletizerMaintenanceRecord.downtime)
			.map(SHUTDOWN, pelletizerMaintenanceRecord.shutdown)
			.map(INTERIM, pelletizerMaintenanceRecord.interim)
			.map(MAINTAINER, pelletizerMaintenanceRecord.maintainer)
			.map(EQUIPMENT, pelletizerMaintenanceRecord.equipment)
			.map(RECORD_STATUS, pelletizerMaintenanceRecord.recordStatus)
			.map(CREATED_DATE, pelletizerMaintenanceRecord.createdDate)
			.map(CREATED_BY, pelletizerMaintenanceRecord.createdBy)
			.map(LAST_MODIFIED_DATE, pelletizerMaintenanceRecord.lastModifiedDate)
			.map(LAST_MODIFIED_BY, pelletizerMaintenanceRecord.lastModifiedBy)
			.map(ONLINE_RUN_TIME, pelletizerMaintenanceRecord.onlineRunTime)
			.map(OFFLINE_RUN_TIME, pelletizerMaintenanceRecord.offlineRunTime);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, pelletizerMaintenanceRecord);
    }
    
}
