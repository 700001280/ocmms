// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialDiscipline;
import com.ocmms.cmms.model.mm.master.QMaterialDiscipline;
import com.ocmms.cmms.repository.MaterialDisciplineRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MaterialDisciplineRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: MaterialDisciplineRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialDisciplineRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialDisciplineRepositoryImpl.DISCIPLINE = "discipline";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialDisciplineRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialDisciplineRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialDisciplineRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialDisciplineRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialDisciplineRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialDiscipline> MaterialDisciplineRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QMaterialDiscipline materialDiscipline = QMaterialDiscipline.materialDiscipline;
        
        JPQLQuery<MaterialDiscipline> query = from(materialDiscipline);
        
        Path<?>[] paths = new Path<?>[] {materialDiscipline.description,materialDiscipline.discipline,materialDiscipline.recordStatus,materialDiscipline.createdDate,materialDiscipline.createdBy,materialDiscipline.lastModifiedDate,materialDiscipline.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DESCRIPTION, materialDiscipline.description)
			.map(DISCIPLINE, materialDiscipline.discipline)
			.map(RECORD_STATUS, materialDiscipline.recordStatus)
			.map(CREATED_DATE, materialDiscipline.createdDate)
			.map(CREATED_BY, materialDiscipline.createdBy)
			.map(LAST_MODIFIED_DATE, materialDiscipline.lastModifiedDate)
			.map(LAST_MODIFIED_BY, materialDiscipline.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, materialDiscipline);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialDiscipline> MaterialDisciplineRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QMaterialDiscipline materialDiscipline = QMaterialDiscipline.materialDiscipline;
        
        JPQLQuery<MaterialDiscipline> query = from(materialDiscipline);
        
        Path<?>[] paths = new Path<?>[] {materialDiscipline.description,materialDiscipline.discipline,materialDiscipline.recordStatus,materialDiscipline.createdDate,materialDiscipline.createdBy,materialDiscipline.lastModifiedDate,materialDiscipline.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(materialDiscipline.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(DESCRIPTION, materialDiscipline.description)
			.map(DISCIPLINE, materialDiscipline.discipline)
			.map(RECORD_STATUS, materialDiscipline.recordStatus)
			.map(CREATED_DATE, materialDiscipline.createdDate)
			.map(CREATED_BY, materialDiscipline.createdBy)
			.map(LAST_MODIFIED_DATE, materialDiscipline.lastModifiedDate)
			.map(LAST_MODIFIED_BY, materialDiscipline.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, materialDiscipline);
    }
    
}
