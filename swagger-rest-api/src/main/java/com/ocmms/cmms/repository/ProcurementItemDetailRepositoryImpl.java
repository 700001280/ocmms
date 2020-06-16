package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import com.ocmms.cmms.model.mm.procurement.QProcurementItemDetail;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = ProcurementItemDetailRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ProcurementItemDetailRepositoryImpl extends QueryDslRepositorySupportExt<ProcurementItemDetail>
		implements ProcurementItemDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	ProcurementItemDetailRepositoryImpl() {
		super(ProcurementItemDetail.class);
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
	public static final String QUANTITY = "quantity";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REQUESTER = "requester";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UNIT_PRICE = "unitPrice";

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
	public static final String CURRENCY_UNIT = "currencyUnit";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PO_NUMBER = "poNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UOM = "uom";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUBMIT_DATE = "submitDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROCUREMENT_ORDER = "procurementOrder";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PR_NUMBER = "prNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROCUREMENT_REQUEST = "procurementRequest";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL = "material";

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
	public Page<ProcurementItemDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QProcurementItemDetail procurementItemDetail = QProcurementItemDetail.procurementItemDetail;
		JPQLQuery<ProcurementItemDetail> query = from(procurementItemDetail);
		Path<?>[] paths = new Path<?>[] { procurementItemDetail.procurementRequest,
				procurementItemDetail.procurementOrder, procurementItemDetail.requester, procurementItemDetail.prNumber,
				procurementItemDetail.poNumber, procurementItemDetail.material, procurementItemDetail.submitDate,
				procurementItemDetail.quantity, procurementItemDetail.uom, procurementItemDetail.organization,
				procurementItemDetail.unitPrice, procurementItemDetail.currencyUnit, procurementItemDetail.memo,
				procurementItemDetail.closed, procurementItemDetail.recordStatus, procurementItemDetail.createdDate,
				procurementItemDetail.createdBy, procurementItemDetail.lastModifiedDate,
				procurementItemDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, procurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, procurementItemDetail.procurementOrder)
				.map(REQUESTER, procurementItemDetail.requester).map(PR_NUMBER, procurementItemDetail.prNumber)
				.map(PO_NUMBER, procurementItemDetail.poNumber).map(MATERIAL, procurementItemDetail.material)
				.map(SUBMIT_DATE, procurementItemDetail.submitDate).map(QUANTITY, procurementItemDetail.quantity)
				.map(UOM, procurementItemDetail.uom).map(ORGANIZATION, procurementItemDetail.organization)
				.map(UNIT_PRICE, procurementItemDetail.unitPrice).map(CURRENCY_UNIT, procurementItemDetail.currencyUnit)
				.map(MEMO, procurementItemDetail.memo).map(CLOSED, procurementItemDetail.closed)
				.map(RECORD_STATUS, procurementItemDetail.recordStatus)
				.map(CREATED_DATE, procurementItemDetail.createdDate).map(CREATED_BY, procurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, procurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementItemDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementItemDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProcurementItemDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QProcurementItemDetail procurementItemDetail = QProcurementItemDetail.procurementItemDetail;
		JPQLQuery<ProcurementItemDetail> query = from(procurementItemDetail);
		Path<?>[] paths = new Path<?>[] { procurementItemDetail.procurementRequest,
				procurementItemDetail.procurementOrder, procurementItemDetail.requester, procurementItemDetail.prNumber,
				procurementItemDetail.poNumber, procurementItemDetail.material, procurementItemDetail.submitDate,
				procurementItemDetail.quantity, procurementItemDetail.uom, procurementItemDetail.organization,
				procurementItemDetail.unitPrice, procurementItemDetail.currencyUnit, procurementItemDetail.memo,
				procurementItemDetail.closed, procurementItemDetail.recordStatus, procurementItemDetail.createdDate,
				procurementItemDetail.createdBy, procurementItemDetail.lastModifiedDate,
				procurementItemDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(procurementItemDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, procurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, procurementItemDetail.procurementOrder)
				.map(REQUESTER, procurementItemDetail.requester).map(PR_NUMBER, procurementItemDetail.prNumber)
				.map(PO_NUMBER, procurementItemDetail.poNumber).map(MATERIAL, procurementItemDetail.material)
				.map(SUBMIT_DATE, procurementItemDetail.submitDate).map(QUANTITY, procurementItemDetail.quantity)
				.map(UOM, procurementItemDetail.uom).map(ORGANIZATION, procurementItemDetail.organization)
				.map(UNIT_PRICE, procurementItemDetail.unitPrice).map(CURRENCY_UNIT, procurementItemDetail.currencyUnit)
				.map(MEMO, procurementItemDetail.memo).map(CLOSED, procurementItemDetail.closed)
				.map(RECORD_STATUS, procurementItemDetail.recordStatus)
				.map(CREATED_DATE, procurementItemDetail.createdDate).map(CREATED_BY, procurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, procurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementItemDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementItemDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProcurementItemDetail> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable) {
		QProcurementItemDetail procurementItemDetail = QProcurementItemDetail.procurementItemDetail;
		JPQLQuery<ProcurementItemDetail> query = from(procurementItemDetail);
		Assert.notNull(organization, "organization is required");
		query.where(procurementItemDetail.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { procurementItemDetail.procurementRequest,
				procurementItemDetail.procurementOrder, procurementItemDetail.requester, procurementItemDetail.prNumber,
				procurementItemDetail.poNumber, procurementItemDetail.material, procurementItemDetail.submitDate,
				procurementItemDetail.quantity, procurementItemDetail.uom, procurementItemDetail.organization,
				procurementItemDetail.unitPrice, procurementItemDetail.currencyUnit, procurementItemDetail.memo,
				procurementItemDetail.closed, procurementItemDetail.recordStatus, procurementItemDetail.createdDate,
				procurementItemDetail.createdBy, procurementItemDetail.lastModifiedDate,
				procurementItemDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, procurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, procurementItemDetail.procurementOrder)
				.map(REQUESTER, procurementItemDetail.requester).map(PR_NUMBER, procurementItemDetail.prNumber)
				.map(PO_NUMBER, procurementItemDetail.poNumber).map(MATERIAL, procurementItemDetail.material)
				.map(SUBMIT_DATE, procurementItemDetail.submitDate).map(QUANTITY, procurementItemDetail.quantity)
				.map(UOM, procurementItemDetail.uom).map(ORGANIZATION, procurementItemDetail.organization)
				.map(UNIT_PRICE, procurementItemDetail.unitPrice).map(CURRENCY_UNIT, procurementItemDetail.currencyUnit)
				.map(MEMO, procurementItemDetail.memo).map(CLOSED, procurementItemDetail.closed)
				.map(RECORD_STATUS, procurementItemDetail.recordStatus)
				.map(CREATED_DATE, procurementItemDetail.createdDate).map(CREATED_BY, procurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, procurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementItemDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementItemDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrder
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProcurementItemDetail> findByProcurementOrder(ProcurementOrder procurementOrder,
			GlobalSearch globalSearch, Pageable pageable) {
		QProcurementItemDetail procurementItemDetail = QProcurementItemDetail.procurementItemDetail;
		JPQLQuery<ProcurementItemDetail> query = from(procurementItemDetail);
		Assert.notNull(procurementOrder, "procurementOrder is required");
		query.where(procurementItemDetail.procurementOrder.eq(procurementOrder));
		Path<?>[] paths = new Path<?>[] { procurementItemDetail.procurementRequest,
				procurementItemDetail.procurementOrder, procurementItemDetail.requester, procurementItemDetail.prNumber,
				procurementItemDetail.poNumber, procurementItemDetail.material, procurementItemDetail.submitDate,
				procurementItemDetail.quantity, procurementItemDetail.uom, procurementItemDetail.organization,
				procurementItemDetail.unitPrice, procurementItemDetail.currencyUnit, procurementItemDetail.memo,
				procurementItemDetail.closed, procurementItemDetail.recordStatus, procurementItemDetail.createdDate,
				procurementItemDetail.createdBy, procurementItemDetail.lastModifiedDate,
				procurementItemDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, procurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, procurementItemDetail.procurementOrder)
				.map(REQUESTER, procurementItemDetail.requester).map(PR_NUMBER, procurementItemDetail.prNumber)
				.map(PO_NUMBER, procurementItemDetail.poNumber).map(MATERIAL, procurementItemDetail.material)
				.map(SUBMIT_DATE, procurementItemDetail.submitDate).map(QUANTITY, procurementItemDetail.quantity)
				.map(UOM, procurementItemDetail.uom).map(ORGANIZATION, procurementItemDetail.organization)
				.map(UNIT_PRICE, procurementItemDetail.unitPrice).map(CURRENCY_UNIT, procurementItemDetail.currencyUnit)
				.map(MEMO, procurementItemDetail.memo).map(CLOSED, procurementItemDetail.closed)
				.map(RECORD_STATUS, procurementItemDetail.recordStatus)
				.map(CREATED_DATE, procurementItemDetail.createdDate).map(CREATED_BY, procurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, procurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementItemDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementItemDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementRequest
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProcurementItemDetail> findByProcurementRequest(ProcurementRequest procurementRequest,
			GlobalSearch globalSearch, Pageable pageable) {
		QProcurementItemDetail procurementItemDetail = QProcurementItemDetail.procurementItemDetail;
		JPQLQuery<ProcurementItemDetail> query = from(procurementItemDetail);
		Assert.notNull(procurementRequest, "procurementRequest is required");
		query.where(procurementItemDetail.procurementRequest.eq(procurementRequest));
		Path<?>[] paths = new Path<?>[] { procurementItemDetail.procurementRequest,
				procurementItemDetail.procurementOrder, procurementItemDetail.requester, procurementItemDetail.prNumber,
				procurementItemDetail.poNumber, procurementItemDetail.material, procurementItemDetail.submitDate,
				procurementItemDetail.quantity, procurementItemDetail.uom, procurementItemDetail.organization,
				procurementItemDetail.unitPrice, procurementItemDetail.currencyUnit, procurementItemDetail.memo,
				procurementItemDetail.closed, procurementItemDetail.recordStatus, procurementItemDetail.createdDate,
				procurementItemDetail.createdBy, procurementItemDetail.lastModifiedDate,
				procurementItemDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, procurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, procurementItemDetail.procurementOrder)
				.map(REQUESTER, procurementItemDetail.requester).map(PR_NUMBER, procurementItemDetail.prNumber)
				.map(PO_NUMBER, procurementItemDetail.poNumber).map(MATERIAL, procurementItemDetail.material)
				.map(SUBMIT_DATE, procurementItemDetail.submitDate).map(QUANTITY, procurementItemDetail.quantity)
				.map(UOM, procurementItemDetail.uom).map(ORGANIZATION, procurementItemDetail.organization)
				.map(UNIT_PRICE, procurementItemDetail.unitPrice).map(CURRENCY_UNIT, procurementItemDetail.currencyUnit)
				.map(MEMO, procurementItemDetail.memo).map(CLOSED, procurementItemDetail.closed)
				.map(RECORD_STATUS, procurementItemDetail.recordStatus)
				.map(CREATED_DATE, procurementItemDetail.createdDate).map(CREATED_BY, procurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, procurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementItemDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementItemDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param requester
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProcurementItemDetail> findByRequester(Employee requester, GlobalSearch globalSearch,
			Pageable pageable) {
		QProcurementItemDetail procurementItemDetail = QProcurementItemDetail.procurementItemDetail;
		JPQLQuery<ProcurementItemDetail> query = from(procurementItemDetail);
		Assert.notNull(requester, "requester is required");
		query.where(procurementItemDetail.requester.eq(requester));
		Path<?>[] paths = new Path<?>[] { procurementItemDetail.procurementRequest,
				procurementItemDetail.procurementOrder, procurementItemDetail.requester, procurementItemDetail.prNumber,
				procurementItemDetail.poNumber, procurementItemDetail.material, procurementItemDetail.submitDate,
				procurementItemDetail.quantity, procurementItemDetail.uom, procurementItemDetail.organization,
				procurementItemDetail.unitPrice, procurementItemDetail.currencyUnit, procurementItemDetail.memo,
				procurementItemDetail.closed, procurementItemDetail.recordStatus, procurementItemDetail.createdDate,
				procurementItemDetail.createdBy, procurementItemDetail.lastModifiedDate,
				procurementItemDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, procurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, procurementItemDetail.procurementOrder)
				.map(REQUESTER, procurementItemDetail.requester).map(PR_NUMBER, procurementItemDetail.prNumber)
				.map(PO_NUMBER, procurementItemDetail.poNumber).map(MATERIAL, procurementItemDetail.material)
				.map(SUBMIT_DATE, procurementItemDetail.submitDate).map(QUANTITY, procurementItemDetail.quantity)
				.map(UOM, procurementItemDetail.uom).map(ORGANIZATION, procurementItemDetail.organization)
				.map(UNIT_PRICE, procurementItemDetail.unitPrice).map(CURRENCY_UNIT, procurementItemDetail.currencyUnit)
				.map(MEMO, procurementItemDetail.memo).map(CLOSED, procurementItemDetail.closed)
				.map(RECORD_STATUS, procurementItemDetail.recordStatus)
				.map(CREATED_DATE, procurementItemDetail.createdDate).map(CREATED_BY, procurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, procurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementItemDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementItemDetail);
	}
}
