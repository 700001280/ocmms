package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.QProcurementOrderFinanceTracking;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = ProcurementOrderFinanceTrackingRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class ProcurementOrderFinanceTrackingRepositoryImpl
		extends QueryDslRepositorySupportExt<ProcurementOrderFinanceTracking>
		implements ProcurementOrderFinanceTrackingRepositoryCustom {

	/**
	 * Default constructor
	 */
	ProcurementOrderFinanceTrackingRepositoryImpl() {
		super(ProcurementOrderFinanceTracking.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PAYMENT_SUBMIT_DATE = "paymentSubmitDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PAYMENT_SUBMIT = "paymentSubmit";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROCUREMENT_ORDER = "procurementOrder";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String INVOICE_RECEIVED = "invoiceReceived";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProcurementOrderFinanceTracking> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QProcurementOrderFinanceTracking procurementOrderFinanceTracking = QProcurementOrderFinanceTracking.procurementOrderFinanceTracking;
		JPQLQuery<ProcurementOrderFinanceTracking> query = from(procurementOrderFinanceTracking);
		Path<?>[] paths = new Path<?>[] { procurementOrderFinanceTracking.procurementOrder,
				procurementOrderFinanceTracking.invoiceReceived, procurementOrderFinanceTracking.paymentSubmit,
				procurementOrderFinanceTracking.paymentSubmitDate, procurementOrderFinanceTracking.description,
				procurementOrderFinanceTracking.recordStatus, procurementOrderFinanceTracking.createdDate,
				procurementOrderFinanceTracking.createdBy, procurementOrderFinanceTracking.lastModifiedDate,
				procurementOrderFinanceTracking.lastModifiedBy };
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
	public Page<ProcurementOrderFinanceTracking> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QProcurementOrderFinanceTracking procurementOrderFinanceTracking = QProcurementOrderFinanceTracking.procurementOrderFinanceTracking;
		JPQLQuery<ProcurementOrderFinanceTracking> query = from(procurementOrderFinanceTracking);
		Path<?>[] paths = new Path<?>[] { procurementOrderFinanceTracking.procurementOrder,
				procurementOrderFinanceTracking.invoiceReceived, procurementOrderFinanceTracking.paymentSubmit,
				procurementOrderFinanceTracking.paymentSubmitDate, procurementOrderFinanceTracking.description,
				procurementOrderFinanceTracking.recordStatus, procurementOrderFinanceTracking.createdDate,
				procurementOrderFinanceTracking.createdBy, procurementOrderFinanceTracking.lastModifiedDate,
				procurementOrderFinanceTracking.lastModifiedBy };
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
	public Page<ProcurementOrderFinanceTracking> findByProcurementOrder(ProcurementOrder procurementOrder,
			GlobalSearch globalSearch, Pageable pageable) {
		QProcurementOrderFinanceTracking procurementOrderFinanceTracking = QProcurementOrderFinanceTracking.procurementOrderFinanceTracking;
		JPQLQuery<ProcurementOrderFinanceTracking> query = from(procurementOrderFinanceTracking);
		Assert.notNull(procurementOrder, "procurementOrder is required");
		query.where(procurementOrderFinanceTracking.procurementOrder.eq(procurementOrder));
		Path<?>[] paths = new Path<?>[] { procurementOrderFinanceTracking.procurementOrder,
				procurementOrderFinanceTracking.invoiceReceived, procurementOrderFinanceTracking.paymentSubmit,
				procurementOrderFinanceTracking.paymentSubmitDate, procurementOrderFinanceTracking.description,
				procurementOrderFinanceTracking.recordStatus, procurementOrderFinanceTracking.createdDate,
				procurementOrderFinanceTracking.createdBy, procurementOrderFinanceTracking.lastModifiedDate,
				procurementOrderFinanceTracking.lastModifiedBy };
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
