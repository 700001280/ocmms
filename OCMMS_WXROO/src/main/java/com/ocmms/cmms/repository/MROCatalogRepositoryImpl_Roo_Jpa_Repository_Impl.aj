// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MROCatalog;
import com.ocmms.cmms.model.mm.master.QMROCatalog;
import com.ocmms.cmms.repository.MROCatalogRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MROCatalogRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: MROCatalogRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MROCatalogRepositoryImpl.CODE = "code";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MROCatalogRepositoryImpl.MATERIAL_NAME = "materialName";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MROCatalogRepositoryImpl.MATERIAL_GROUP = "materialGroup";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MROCatalogRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MROCatalogRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MROCatalogRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MROCatalogRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MROCatalogRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MROCatalog> MROCatalogRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QMROCatalog mROCatalog = QMROCatalog.mROCatalog;
        
        JPQLQuery<MROCatalog> query = from(mROCatalog);
        
        Path<?>[] paths = new Path<?>[] {mROCatalog.code,mROCatalog.materialName,mROCatalog.materialGroup,mROCatalog.recordStatus,mROCatalog.createdDate,mROCatalog.createdBy,mROCatalog.lastModifiedDate,mROCatalog.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, mROCatalog.code)
			.map(MATERIAL_NAME, mROCatalog.materialName)
			.map(MATERIAL_GROUP, mROCatalog.materialGroup)
			.map(RECORD_STATUS, mROCatalog.recordStatus)
			.map(CREATED_DATE, mROCatalog.createdDate)
			.map(CREATED_BY, mROCatalog.createdBy)
			.map(LAST_MODIFIED_DATE, mROCatalog.lastModifiedDate)
			.map(LAST_MODIFIED_BY, mROCatalog.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, mROCatalog);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MROCatalog> MROCatalogRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QMROCatalog mROCatalog = QMROCatalog.mROCatalog;
        
        JPQLQuery<MROCatalog> query = from(mROCatalog);
        
        Path<?>[] paths = new Path<?>[] {mROCatalog.code,mROCatalog.materialName,mROCatalog.materialGroup,mROCatalog.recordStatus,mROCatalog.createdDate,mROCatalog.createdBy,mROCatalog.lastModifiedDate,mROCatalog.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(mROCatalog.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, mROCatalog.code)
			.map(MATERIAL_NAME, mROCatalog.materialName)
			.map(MATERIAL_GROUP, mROCatalog.materialGroup)
			.map(RECORD_STATUS, mROCatalog.recordStatus)
			.map(CREATED_DATE, mROCatalog.createdDate)
			.map(CREATED_BY, mROCatalog.createdBy)
			.map(LAST_MODIFIED_DATE, mROCatalog.lastModifiedDate)
			.map(LAST_MODIFIED_BY, mROCatalog.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, mROCatalog);
    }
    
}
