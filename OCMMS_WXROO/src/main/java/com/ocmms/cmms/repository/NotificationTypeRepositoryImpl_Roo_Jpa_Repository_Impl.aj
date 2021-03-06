// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationType;
import com.ocmms.cmms.model.pm.notification.QNotificationType;
import com.ocmms.cmms.repository.NotificationTypeRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect NotificationTypeRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: NotificationTypeRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationTypeRepositoryImpl.CODE = "code";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationTypeRepositoryImpl.TYPE = "type";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationTypeRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationTypeRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationTypeRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationTypeRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationTypeRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationTypeRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<NotificationType> NotificationTypeRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QNotificationType notificationType = QNotificationType.notificationType;
        
        JPQLQuery<NotificationType> query = from(notificationType);
        
        Path<?>[] paths = new Path<?>[] {notificationType.code,notificationType.type,notificationType.description,notificationType.recordStatus,notificationType.createdDate,notificationType.createdBy,notificationType.lastModifiedDate,notificationType.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, notificationType.code)
			.map(TYPE, notificationType.type)
			.map(DESCRIPTION, notificationType.description)
			.map(RECORD_STATUS, notificationType.recordStatus)
			.map(CREATED_DATE, notificationType.createdDate)
			.map(CREATED_BY, notificationType.createdBy)
			.map(LAST_MODIFIED_DATE, notificationType.lastModifiedDate)
			.map(LAST_MODIFIED_BY, notificationType.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, notificationType);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<NotificationType> NotificationTypeRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QNotificationType notificationType = QNotificationType.notificationType;
        
        JPQLQuery<NotificationType> query = from(notificationType);
        
        Path<?>[] paths = new Path<?>[] {notificationType.code,notificationType.type,notificationType.description,notificationType.recordStatus,notificationType.createdDate,notificationType.createdBy,notificationType.lastModifiedDate,notificationType.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(notificationType.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CODE, notificationType.code)
			.map(TYPE, notificationType.type)
			.map(DESCRIPTION, notificationType.description)
			.map(RECORD_STATUS, notificationType.recordStatus)
			.map(CREATED_DATE, notificationType.createdDate)
			.map(CREATED_BY, notificationType.createdBy)
			.map(LAST_MODIFIED_DATE, notificationType.lastModifiedDate)
			.map(LAST_MODIFIED_BY, notificationType.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, notificationType);
    }
    
}
