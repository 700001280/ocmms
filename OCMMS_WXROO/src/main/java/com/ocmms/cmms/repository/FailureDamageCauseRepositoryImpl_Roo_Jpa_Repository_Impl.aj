// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.FailureDamageCause;
import com.ocmms.cmms.model.pm.notification.QFailureDamageCause;
import com.ocmms.cmms.repository.FailureDamageCauseRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect FailureDamageCauseRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: FailureDamageCauseRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.CODE = "code";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.GROUP_CODE = "groupCode";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.GROUP_DESCRIPTION = "groupDescription";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.SUB_CODE = "subCode";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.SUB_DESCRIPTION = "subDescription";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.EXPLANATION = "explanation";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FailureDamageCauseRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<FailureDamageCause> FailureDamageCauseRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QFailureDamageCause failureDamageCause = QFailureDamageCause.failureDamageCause;
        
        JPQLQuery<FailureDamageCause> query = from(failureDamageCause);
        
        Path<?>[] paths = new Path<?>[] {failureDamageCause.code,failureDamageCause.description,failureDamageCause.groupCode,failureDamageCause.groupDescription,failureDamageCause.subCode,failureDamageCause.subDescription,failureDamageCause.explanation,failureDamageCause.recordStatus,failureDamageCause.createdDate,failureDamageCause.createdBy,failureDamageCause.lastModifiedDate,failureDamageCause.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, failureDamageCause.code)
			.map(DESCRIPTION, failureDamageCause.description)
			.map(GROUP_CODE, failureDamageCause.groupCode)
			.map(GROUP_DESCRIPTION, failureDamageCause.groupDescription)
			.map(SUB_CODE, failureDamageCause.subCode)
			.map(SUB_DESCRIPTION, failureDamageCause.subDescription)
			.map(EXPLANATION, failureDamageCause.explanation)
			.map(RECORD_STATUS, failureDamageCause.recordStatus)
			.map(CREATED_DATE, failureDamageCause.createdDate)
			.map(CREATED_BY, failureDamageCause.createdBy)
			.map(LAST_MODIFIED_DATE, failureDamageCause.lastModifiedDate)
			.map(LAST_MODIFIED_BY, failureDamageCause.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, failureDamageCause);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<FailureDamageCause> FailureDamageCauseRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QFailureDamageCause failureDamageCause = QFailureDamageCause.failureDamageCause;
        
        JPQLQuery<FailureDamageCause> query = from(failureDamageCause);
        
        Path<?>[] paths = new Path<?>[] {failureDamageCause.code,failureDamageCause.description,failureDamageCause.groupCode,failureDamageCause.groupDescription,failureDamageCause.subCode,failureDamageCause.subDescription,failureDamageCause.explanation,failureDamageCause.recordStatus,failureDamageCause.createdDate,failureDamageCause.createdBy,failureDamageCause.lastModifiedDate,failureDamageCause.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(failureDamageCause.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, failureDamageCause.code)
			.map(DESCRIPTION, failureDamageCause.description)
			.map(GROUP_CODE, failureDamageCause.groupCode)
			.map(GROUP_DESCRIPTION, failureDamageCause.groupDescription)
			.map(SUB_CODE, failureDamageCause.subCode)
			.map(SUB_DESCRIPTION, failureDamageCause.subDescription)
			.map(EXPLANATION, failureDamageCause.explanation)
			.map(RECORD_STATUS, failureDamageCause.recordStatus)
			.map(CREATED_DATE, failureDamageCause.createdDate)
			.map(CREATED_BY, failureDamageCause.createdBy)
			.map(LAST_MODIFIED_DATE, failureDamageCause.lastModifiedDate)
			.map(LAST_MODIFIED_BY, failureDamageCause.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, failureDamageCause);
    }
    
}
