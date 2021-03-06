// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.MovementType;
import com.ocmms.cmms.model.mm.storage.QMovementType;
import com.ocmms.cmms.repository.MovementTypeRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MovementTypeRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: MovementTypeRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MovementTypeRepositoryImpl.CODE = "code";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MovementTypeRepositoryImpl.MEMO = "memo";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MovementTypeRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MovementTypeRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MovementTypeRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MovementTypeRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MovementTypeRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MovementTypeRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MovementType> MovementTypeRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QMovementType movementType = QMovementType.movementType;
        
        JPQLQuery<MovementType> query = from(movementType);
        
        Path<?>[] paths = new Path<?>[] {movementType.code,movementType.memo,movementType.description,movementType.recordStatus,movementType.createdDate,movementType.createdBy,movementType.lastModifiedDate,movementType.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, movementType.code)
			.map(MEMO, movementType.memo)
			.map(DESCRIPTION, movementType.description)
			.map(RECORD_STATUS, movementType.recordStatus)
			.map(CREATED_DATE, movementType.createdDate)
			.map(CREATED_BY, movementType.createdBy)
			.map(LAST_MODIFIED_DATE, movementType.lastModifiedDate)
			.map(LAST_MODIFIED_BY, movementType.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, movementType);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MovementType> MovementTypeRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QMovementType movementType = QMovementType.movementType;
        
        JPQLQuery<MovementType> query = from(movementType);
        
        Path<?>[] paths = new Path<?>[] {movementType.code,movementType.memo,movementType.description,movementType.recordStatus,movementType.createdDate,movementType.createdBy,movementType.lastModifiedDate,movementType.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(movementType.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, movementType.code)
			.map(MEMO, movementType.memo)
			.map(DESCRIPTION, movementType.description)
			.map(RECORD_STATUS, movementType.recordStatus)
			.map(CREATED_DATE, movementType.createdDate)
			.map(CREATED_BY, movementType.createdBy)
			.map(LAST_MODIFIED_DATE, movementType.lastModifiedDate)
			.map(LAST_MODIFIED_BY, movementType.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, movementType);
    }
    
}
