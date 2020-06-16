package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.QPurchaseExpedite;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = PurchaseExpediteRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PurchaseExpediteRepositoryImpl extends QueryDslRepositorySupportExt<PurchaseExpedite>
		implements PurchaseExpediteRepositoryCustom {

	/**
	 * Default constructor
	 */
	PurchaseExpediteRepositoryImpl() {
		super(PurchaseExpedite.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EXPEDITOR = "expeditor";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PLAN_DELIVER_DATE = "planDeliverDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EXPEDITE_DATE = "expediteDate";

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
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PurchaseExpedite> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPurchaseExpedite purchaseExpedite = QPurchaseExpedite.purchaseExpedite;
		JPQLQuery<PurchaseExpedite> query = from(purchaseExpedite);
		Path<?>[] paths = new Path<?>[] { purchaseExpedite.procurementOrder, purchaseExpedite.description,
				purchaseExpedite.memo, purchaseExpedite.expeditor, purchaseExpedite.expediteDate,
				purchaseExpedite.planDeliverDate, purchaseExpedite.recordStatus, purchaseExpedite.createdDate,
				purchaseExpedite.createdBy, purchaseExpedite.lastModifiedDate, purchaseExpedite.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PROCUREMENT_ORDER, purchaseExpedite.procurementOrder)
				.map(DESCRIPTION, purchaseExpedite.description).map(MEMO, purchaseExpedite.memo)
				.map(EXPEDITOR, purchaseExpedite.expeditor).map(EXPEDITE_DATE, purchaseExpedite.expediteDate)
				.map(PLAN_DELIVER_DATE, purchaseExpedite.planDeliverDate)
				.map(RECORD_STATUS, purchaseExpedite.recordStatus).map(CREATED_DATE, purchaseExpedite.createdDate)
				.map(CREATED_BY, purchaseExpedite.createdBy).map(LAST_MODIFIED_DATE, purchaseExpedite.lastModifiedDate)
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
	public Page<PurchaseExpedite> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPurchaseExpedite purchaseExpedite = QPurchaseExpedite.purchaseExpedite;
		JPQLQuery<PurchaseExpedite> query = from(purchaseExpedite);
		Path<?>[] paths = new Path<?>[] { purchaseExpedite.procurementOrder, purchaseExpedite.description,
				purchaseExpedite.memo, purchaseExpedite.expeditor, purchaseExpedite.expediteDate,
				purchaseExpedite.planDeliverDate, purchaseExpedite.recordStatus, purchaseExpedite.createdDate,
				purchaseExpedite.createdBy, purchaseExpedite.lastModifiedDate, purchaseExpedite.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(purchaseExpedite.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(PROCUREMENT_ORDER, purchaseExpedite.procurementOrder)
				.map(DESCRIPTION, purchaseExpedite.description).map(MEMO, purchaseExpedite.memo)
				.map(EXPEDITOR, purchaseExpedite.expeditor).map(EXPEDITE_DATE, purchaseExpedite.expediteDate)
				.map(PLAN_DELIVER_DATE, purchaseExpedite.planDeliverDate)
				.map(RECORD_STATUS, purchaseExpedite.recordStatus).map(CREATED_DATE, purchaseExpedite.createdDate)
				.map(CREATED_BY, purchaseExpedite.createdBy).map(LAST_MODIFIED_DATE, purchaseExpedite.lastModifiedDate)
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
	public Page<PurchaseExpedite> findByProcurementOrder(ProcurementOrder procurementOrder, GlobalSearch globalSearch,
			Pageable pageable) {
		QPurchaseExpedite purchaseExpedite = QPurchaseExpedite.purchaseExpedite;
		JPQLQuery<PurchaseExpedite> query = from(purchaseExpedite);
		Assert.notNull(procurementOrder, "procurementOrder is required");
		query.where(purchaseExpedite.procurementOrder.eq(procurementOrder));
		Path<?>[] paths = new Path<?>[] { purchaseExpedite.procurementOrder, purchaseExpedite.description,
				purchaseExpedite.memo, purchaseExpedite.expeditor, purchaseExpedite.expediteDate,
				purchaseExpedite.planDeliverDate, purchaseExpedite.recordStatus, purchaseExpedite.createdDate,
				purchaseExpedite.createdBy, purchaseExpedite.lastModifiedDate, purchaseExpedite.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PROCUREMENT_ORDER, purchaseExpedite.procurementOrder)
				.map(DESCRIPTION, purchaseExpedite.description).map(MEMO, purchaseExpedite.memo)
				.map(EXPEDITOR, purchaseExpedite.expeditor).map(EXPEDITE_DATE, purchaseExpedite.expediteDate)
				.map(PLAN_DELIVER_DATE, purchaseExpedite.planDeliverDate)
				.map(RECORD_STATUS, purchaseExpedite.recordStatus).map(CREATED_DATE, purchaseExpedite.createdDate)
				.map(CREATED_BY, purchaseExpedite.createdBy).map(LAST_MODIFIED_DATE, purchaseExpedite.lastModifiedDate)
				.map(LAST_MODIFIED_BY, purchaseExpedite.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, purchaseExpedite);
	}
}
