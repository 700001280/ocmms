package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.QProcurementOrder;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProcurementOrderRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ProcurementOrderRepositoryImpl extends QueryDslRepositorySupportExt<ProcurementOrder>
		implements ProcurementOrderRepositoryCustom {

	/**
	 * Default constructor
	 */
	ProcurementOrderRepositoryImpl() {
		super(ProcurementOrder.class);
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
	public static final String ORDER_DATE = "orderDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CLOSED = "closed";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CATALOG_TYPE = "catalogType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORDER_NUMBER = "orderNumber";

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
	public static final String PRIORITY_TYPE = "priorityType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUPPLIER = "supplier";

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
	public Page<ProcurementOrder> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QProcurementOrder procurementOrder = QProcurementOrder.procurementOrder;
		JPQLQuery<ProcurementOrder> query = from(procurementOrder);
		Path<?>[] paths = new Path<?>[] { procurementOrder.priorityType, procurementOrder.catalogType,
				procurementOrder.supplier, procurementOrder.orderDate, procurementOrder.orderNumber,
				procurementOrder.memo, procurementOrder.closed, procurementOrder.recordStatus,
				procurementOrder.createdDate, procurementOrder.createdBy, procurementOrder.lastModifiedDate,
				procurementOrder.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PRIORITY_TYPE, procurementOrder.priorityType)
				.map(CATALOG_TYPE, procurementOrder.catalogType).map(SUPPLIER, procurementOrder.supplier)
				.map(ORDER_DATE, procurementOrder.orderDate).map(ORDER_NUMBER, procurementOrder.orderNumber)
				.map(MEMO, procurementOrder.memo).map(CLOSED, procurementOrder.closed)
				.map(RECORD_STATUS, procurementOrder.recordStatus).map(CREATED_DATE, procurementOrder.createdDate)
				.map(CREATED_BY, procurementOrder.createdBy).map(LAST_MODIFIED_DATE, procurementOrder.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementOrder.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementOrder);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProcurementOrder> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QProcurementOrder procurementOrder = QProcurementOrder.procurementOrder;
		JPQLQuery<ProcurementOrder> query = from(procurementOrder);
		Path<?>[] paths = new Path<?>[] { procurementOrder.priorityType, procurementOrder.catalogType,
				procurementOrder.supplier, procurementOrder.orderDate, procurementOrder.orderNumber,
				procurementOrder.memo, procurementOrder.closed, procurementOrder.recordStatus,
				procurementOrder.createdDate, procurementOrder.createdBy, procurementOrder.lastModifiedDate,
				procurementOrder.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(procurementOrder.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(PRIORITY_TYPE, procurementOrder.priorityType)
				.map(CATALOG_TYPE, procurementOrder.catalogType).map(SUPPLIER, procurementOrder.supplier)
				.map(ORDER_DATE, procurementOrder.orderDate).map(ORDER_NUMBER, procurementOrder.orderNumber)
				.map(MEMO, procurementOrder.memo).map(CLOSED, procurementOrder.closed)
				.map(RECORD_STATUS, procurementOrder.recordStatus).map(CREATED_DATE, procurementOrder.createdDate)
				.map(CREATED_BY, procurementOrder.createdBy).map(LAST_MODIFIED_DATE, procurementOrder.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementOrder.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementOrder);
	}
}
