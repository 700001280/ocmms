// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;
import com.ocmms.cmms.model.mm.procurement.QProcurementOrderFinanceTracking;
import com.ocmms.cmms.repository.ProcurementOrderFinanceTrackingRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

privileged aspect ProcurementOrderFinanceTrackingRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: ProcurementOrderFinanceTrackingRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrderFinanceTrackingRepositoryImpl.PROCUREMENT_ORDER = "procurementOrder";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrderFinanceTrackingRepositoryImpl.INVOICE_RECEIVED = "invoiceReceived";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrderFinanceTrackingRepositoryImpl.PAYMENT_SUBMIT = "paymentSubmit";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrderFinanceTrackingRepositoryImpl.PAYMENT_SUBMIT_DATE = "paymentSubmitDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrderFinanceTrackingRepositoryImpl.DESCRIPTION = "description";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrderFinanceTrackingRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrderFinanceTrackingRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrderFinanceTrackingRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrderFinanceTrackingRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrderFinanceTrackingRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ProcurementOrderFinanceTracking> ProcurementOrderFinanceTrackingRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QProcurementOrderFinanceTracking procurementOrderFinanceTracking = QProcurementOrderFinanceTracking.procurementOrderFinanceTracking;
        
        JPQLQuery<ProcurementOrderFinanceTracking> query = from(procurementOrderFinanceTracking);
        
        Path<?>[] paths = new Path<?>[] {procurementOrderFinanceTracking.procurementOrder,procurementOrderFinanceTracking.invoiceReceived,procurementOrderFinanceTracking.paymentSubmit,procurementOrderFinanceTracking.paymentSubmitDate,procurementOrderFinanceTracking.description,procurementOrderFinanceTracking.recordStatus,procurementOrderFinanceTracking.createdDate,procurementOrderFinanceTracking.createdBy,procurementOrderFinanceTracking.lastModifiedDate,procurementOrderFinanceTracking.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(PROCUREMENT_ORDER, procurementOrderFinanceTracking.procurementOrder)
			.map(INVOICE_RECEIVED, procurementOrderFinanceTracking.invoiceReceived)
			.map(PAYMENT_SUBMIT, procurementOrderFinanceTracking.paymentSubmit)
			.map(PAYMENT_SUBMIT_DATE, procurementOrderFinanceTracking.paymentSubmitDate)
			.map(DESCRIPTION, procurementOrderFinanceTracking.description)
			.map(RECORD_STATUS, procurementOrderFinanceTracking.recordStatus)
			.map(CREATED_DATE, procurementOrderFinanceTracking.createdDate)
			.map(CREATED_BY, procurementOrderFinanceTracking.createdBy)
			.map(LAST_MODIFIED_DATE, procurementOrderFinanceTracking.lastModifiedDate)
			.map(LAST_MODIFIED_BY, procurementOrderFinanceTracking.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, procurementOrderFinanceTracking);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ProcurementOrderFinanceTracking> ProcurementOrderFinanceTrackingRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QProcurementOrderFinanceTracking procurementOrderFinanceTracking = QProcurementOrderFinanceTracking.procurementOrderFinanceTracking;
        
        JPQLQuery<ProcurementOrderFinanceTracking> query = from(procurementOrderFinanceTracking);
        
        Path<?>[] paths = new Path<?>[] {procurementOrderFinanceTracking.procurementOrder,procurementOrderFinanceTracking.invoiceReceived,procurementOrderFinanceTracking.paymentSubmit,procurementOrderFinanceTracking.paymentSubmitDate,procurementOrderFinanceTracking.description,procurementOrderFinanceTracking.recordStatus,procurementOrderFinanceTracking.createdDate,procurementOrderFinanceTracking.createdBy,procurementOrderFinanceTracking.lastModifiedDate,procurementOrderFinanceTracking.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(procurementOrderFinanceTracking.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(PROCUREMENT_ORDER, procurementOrderFinanceTracking.procurementOrder)
			.map(INVOICE_RECEIVED, procurementOrderFinanceTracking.invoiceReceived)
			.map(PAYMENT_SUBMIT, procurementOrderFinanceTracking.paymentSubmit)
			.map(PAYMENT_SUBMIT_DATE, procurementOrderFinanceTracking.paymentSubmitDate)
			.map(DESCRIPTION, procurementOrderFinanceTracking.description)
			.map(RECORD_STATUS, procurementOrderFinanceTracking.recordStatus)
			.map(CREATED_DATE, procurementOrderFinanceTracking.createdDate)
			.map(CREATED_BY, procurementOrderFinanceTracking.createdBy)
			.map(LAST_MODIFIED_DATE, procurementOrderFinanceTracking.lastModifiedDate)
			.map(LAST_MODIFIED_BY, procurementOrderFinanceTracking.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, procurementOrderFinanceTracking);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ProcurementOrderFinanceTracking> ProcurementOrderFinanceTrackingRepositoryImpl.findByProcurementOrder(ProcurementOrder procurementOrder, GlobalSearch globalSearch, Pageable pageable) {
        
        QProcurementOrderFinanceTracking procurementOrderFinanceTracking = QProcurementOrderFinanceTracking.procurementOrderFinanceTracking;
        
        JPQLQuery<ProcurementOrderFinanceTracking> query = from(procurementOrderFinanceTracking);
        
        Assert.notNull(procurementOrder, "procurementOrder is required");
        
        query.where(procurementOrderFinanceTracking.procurementOrder.eq(procurementOrder));
        Path<?>[] paths = new Path<?>[] {procurementOrderFinanceTracking.procurementOrder,procurementOrderFinanceTracking.invoiceReceived,procurementOrderFinanceTracking.paymentSubmit,procurementOrderFinanceTracking.paymentSubmitDate,procurementOrderFinanceTracking.description,procurementOrderFinanceTracking.recordStatus,procurementOrderFinanceTracking.createdDate,procurementOrderFinanceTracking.createdBy,procurementOrderFinanceTracking.lastModifiedDate,procurementOrderFinanceTracking.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(PROCUREMENT_ORDER, procurementOrderFinanceTracking.procurementOrder)
			.map(INVOICE_RECEIVED, procurementOrderFinanceTracking.invoiceReceived)
			.map(PAYMENT_SUBMIT, procurementOrderFinanceTracking.paymentSubmit)
			.map(PAYMENT_SUBMIT_DATE, procurementOrderFinanceTracking.paymentSubmitDate)
			.map(DESCRIPTION, procurementOrderFinanceTracking.description)
			.map(RECORD_STATUS, procurementOrderFinanceTracking.recordStatus)
			.map(CREATED_DATE, procurementOrderFinanceTracking.createdDate)
			.map(CREATED_BY, procurementOrderFinanceTracking.createdBy)
			.map(LAST_MODIFIED_DATE, procurementOrderFinanceTracking.lastModifiedDate)
			.map(LAST_MODIFIED_BY, procurementOrderFinanceTracking.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, procurementOrderFinanceTracking);
    }
    
}
