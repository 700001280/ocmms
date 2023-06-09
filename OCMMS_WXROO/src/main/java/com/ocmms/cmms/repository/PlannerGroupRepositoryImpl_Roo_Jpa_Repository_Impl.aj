// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.QPlannerGroup;
import com.ocmms.cmms.repository.PlannerGroupRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PlannerGroupRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: PlannerGroupRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupRepositoryImpl.CODE = "code";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupRepositoryImpl.ORGANIZATION = "organization";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupRepositoryImpl.PHONE_NUMBER = "phoneNumber";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PlannerGroup> PlannerGroupRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QPlannerGroup plannerGroup = QPlannerGroup.plannerGroup;
        
        JPQLQuery<PlannerGroup> query = from(plannerGroup);
        
        Path<?>[] paths = new Path<?>[] {plannerGroup.code,plannerGroup.description,plannerGroup.organization,plannerGroup.phoneNumber,plannerGroup.recordStatus,plannerGroup.createdDate,plannerGroup.createdBy,plannerGroup.lastModifiedDate,plannerGroup.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, plannerGroup.code)
			.map(DESCRIPTION, plannerGroup.description)
			.map(ORGANIZATION, plannerGroup.organization)
			.map(PHONE_NUMBER, plannerGroup.phoneNumber)
			.map(RECORD_STATUS, plannerGroup.recordStatus)
			.map(CREATED_DATE, plannerGroup.createdDate)
			.map(CREATED_BY, plannerGroup.createdBy)
			.map(LAST_MODIFIED_DATE, plannerGroup.lastModifiedDate)
			.map(LAST_MODIFIED_BY, plannerGroup.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, plannerGroup);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PlannerGroup> PlannerGroupRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QPlannerGroup plannerGroup = QPlannerGroup.plannerGroup;
        
        JPQLQuery<PlannerGroup> query = from(plannerGroup);
        
        Path<?>[] paths = new Path<?>[] {plannerGroup.code,plannerGroup.description,plannerGroup.organization,plannerGroup.phoneNumber,plannerGroup.recordStatus,plannerGroup.createdDate,plannerGroup.createdBy,plannerGroup.lastModifiedDate,plannerGroup.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(plannerGroup.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, plannerGroup.code)
			.map(DESCRIPTION, plannerGroup.description)
			.map(ORGANIZATION, plannerGroup.organization)
			.map(PHONE_NUMBER, plannerGroup.phoneNumber)
			.map(RECORD_STATUS, plannerGroup.recordStatus)
			.map(CREATED_DATE, plannerGroup.createdDate)
			.map(CREATED_BY, plannerGroup.createdBy)
			.map(LAST_MODIFIED_DATE, plannerGroup.lastModifiedDate)
			.map(LAST_MODIFIED_BY, plannerGroup.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, plannerGroup);
    }
    
}
