// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.FailureObjectPart;
import com.ocmms.cmms.model.pm.notification.QFailureObjectPart;
import com.ocmms.cmms.repository.FailureObjectPartRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect FailureObjectPartRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: FailureObjectPartRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.CODE = "code";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.GROUP_CODE = "groupCode";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.GROUP_DESCRIPTION = "groupDescription";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.SUB_CODE = "subCode";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.SUB_DESCRIPTION = "subDescription";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureObjectPartRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<FailureObjectPart> FailureObjectPartRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QFailureObjectPart failureObjectPart = QFailureObjectPart.failureObjectPart;
        
        JPQLQuery<FailureObjectPart> query = from(failureObjectPart);
        
        Path<?>[] paths = new Path<?>[] {failureObjectPart.code,failureObjectPart.description,failureObjectPart.groupCode,failureObjectPart.groupDescription,failureObjectPart.subCode,failureObjectPart.subDescription,failureObjectPart.recordStatus,failureObjectPart.createdDate,failureObjectPart.createdBy,failureObjectPart.lastModifiedDate,failureObjectPart.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, failureObjectPart.code)
			.map(DESCRIPTION, failureObjectPart.description)
			.map(GROUP_CODE, failureObjectPart.groupCode)
			.map(GROUP_DESCRIPTION, failureObjectPart.groupDescription)
			.map(SUB_CODE, failureObjectPart.subCode)
			.map(SUB_DESCRIPTION, failureObjectPart.subDescription)
			.map(RECORD_STATUS, failureObjectPart.recordStatus)
			.map(CREATED_DATE, failureObjectPart.createdDate)
			.map(CREATED_BY, failureObjectPart.createdBy)
			.map(LAST_MODIFIED_DATE, failureObjectPart.lastModifiedDate)
			.map(LAST_MODIFIED_BY, failureObjectPart.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, failureObjectPart);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<FailureObjectPart> FailureObjectPartRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QFailureObjectPart failureObjectPart = QFailureObjectPart.failureObjectPart;
        
        JPQLQuery<FailureObjectPart> query = from(failureObjectPart);
        
        Path<?>[] paths = new Path<?>[] {failureObjectPart.code,failureObjectPart.description,failureObjectPart.groupCode,failureObjectPart.groupDescription,failureObjectPart.subCode,failureObjectPart.subDescription,failureObjectPart.recordStatus,failureObjectPart.createdDate,failureObjectPart.createdBy,failureObjectPart.lastModifiedDate,failureObjectPart.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(failureObjectPart.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, failureObjectPart.code)
			.map(DESCRIPTION, failureObjectPart.description)
			.map(GROUP_CODE, failureObjectPart.groupCode)
			.map(GROUP_DESCRIPTION, failureObjectPart.groupDescription)
			.map(SUB_CODE, failureObjectPart.subCode)
			.map(SUB_DESCRIPTION, failureObjectPart.subDescription)
			.map(RECORD_STATUS, failureObjectPart.recordStatus)
			.map(CREATED_DATE, failureObjectPart.createdDate)
			.map(CREATED_BY, failureObjectPart.createdBy)
			.map(LAST_MODIFIED_DATE, failureObjectPart.lastModifiedDate)
			.map(LAST_MODIFIED_BY, failureObjectPart.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, failureObjectPart);
    }
    
}
