// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import com.ocmms.cmms.model.mm.procurement.QPurchaseExpedite;
import com.ocmms.cmms.repository.PurchaseExpediteRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

privileged aspect PurchaseExpediteRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: PurchaseExpediteRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.PROCUREMENT_ORDER = "procurementOrder";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.MEMO = "memo";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.EXPEDITOR = "expeditor";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.EXPEDITE_DATE = "expediteDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.PLAN_DELIVER_DATE = "planDeliverDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseExpediteRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PurchaseExpedite> PurchaseExpediteRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QPurchaseExpedite purchaseExpedite = QPurchaseExpedite.purchaseExpedite;
        
        JPQLQuery<PurchaseExpedite> query = from(purchaseExpedite);
        
        Path<?>[] paths = new Path<?>[] {purchaseExpedite.procurementOrder,purchaseExpedite.description,purchaseExpedite.memo,purchaseExpedite.expeditor,purchaseExpedite.expediteDate,purchaseExpedite.planDeliverDate,purchaseExpedite.recordStatus,purchaseExpedite.createdDate,purchaseExpedite.createdBy,purchaseExpedite.lastModifiedDate,purchaseExpedite.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(PROCUREMENT_ORDER, purchaseExpedite.procurementOrder)
			.map(DESCRIPTION, purchaseExpedite.description)
			.map(MEMO, purchaseExpedite.memo)
			.map(EXPEDITOR, purchaseExpedite.expeditor)
			.map(EXPEDITE_DATE, purchaseExpedite.expediteDate)
			.map(PLAN_DELIVER_DATE, purchaseExpedite.planDeliverDate)
			.map(RECORD_STATUS, purchaseExpedite.recordStatus)
			.map(CREATED_DATE, purchaseExpedite.createdDate)
			.map(CREATED_BY, purchaseExpedite.createdBy)
			.map(LAST_MODIFIED_DATE, purchaseExpedite.lastModifiedDate)
			.map(LAST_MODIFIED_BY, purchaseExpedite.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, purchaseExpedite);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PurchaseExpedite> PurchaseExpediteRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QPurchaseExpedite purchaseExpedite = QPurchaseExpedite.purchaseExpedite;
        
        JPQLQuery<PurchaseExpedite> query = from(purchaseExpedite);
        
        Path<?>[] paths = new Path<?>[] {purchaseExpedite.procurementOrder,purchaseExpedite.description,purchaseExpedite.memo,purchaseExpedite.expeditor,purchaseExpedite.expediteDate,purchaseExpedite.planDeliverDate,purchaseExpedite.recordStatus,purchaseExpedite.createdDate,purchaseExpedite.createdBy,purchaseExpedite.lastModifiedDate,purchaseExpedite.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(purchaseExpedite.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(PROCUREMENT_ORDER, purchaseExpedite.procurementOrder)
			.map(DESCRIPTION, purchaseExpedite.description)
			.map(MEMO, purchaseExpedite.memo)
			.map(EXPEDITOR, purchaseExpedite.expeditor)
			.map(EXPEDITE_DATE, purchaseExpedite.expediteDate)
			.map(PLAN_DELIVER_DATE, purchaseExpedite.planDeliverDate)
			.map(RECORD_STATUS, purchaseExpedite.recordStatus)
			.map(CREATED_DATE, purchaseExpedite.createdDate)
			.map(CREATED_BY, purchaseExpedite.createdBy)
			.map(LAST_MODIFIED_DATE, purchaseExpedite.lastModifiedDate)
			.map(LAST_MODIFIED_BY, purchaseExpedite.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, purchaseExpedite);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PurchaseExpedite> PurchaseExpediteRepositoryImpl.findByProcurementOrder(ProcurementOrder procurementOrder, GlobalSearch globalSearch, Pageable pageable) {
        
        QPurchaseExpedite purchaseExpedite = QPurchaseExpedite.purchaseExpedite;
        
        JPQLQuery<PurchaseExpedite> query = from(purchaseExpedite);
        
        Assert.notNull(procurementOrder, "procurementOrder is required");
        
        query.where(purchaseExpedite.procurementOrder.eq(procurementOrder));
        Path<?>[] paths = new Path<?>[] {purchaseExpedite.procurementOrder,purchaseExpedite.description,purchaseExpedite.memo,purchaseExpedite.expeditor,purchaseExpedite.expediteDate,purchaseExpedite.planDeliverDate,purchaseExpedite.recordStatus,purchaseExpedite.createdDate,purchaseExpedite.createdBy,purchaseExpedite.lastModifiedDate,purchaseExpedite.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(PROCUREMENT_ORDER, purchaseExpedite.procurementOrder)
			.map(DESCRIPTION, purchaseExpedite.description)
			.map(MEMO, purchaseExpedite.memo)
			.map(EXPEDITOR, purchaseExpedite.expeditor)
			.map(EXPEDITE_DATE, purchaseExpedite.expediteDate)
			.map(PLAN_DELIVER_DATE, purchaseExpedite.planDeliverDate)
			.map(RECORD_STATUS, purchaseExpedite.recordStatus)
			.map(CREATED_DATE, purchaseExpedite.createdDate)
			.map(CREATED_BY, purchaseExpedite.createdBy)
			.map(LAST_MODIFIED_DATE, purchaseExpedite.lastModifiedDate)
			.map(LAST_MODIFIED_BY, purchaseExpedite.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, purchaseExpedite);
    }
    
}
