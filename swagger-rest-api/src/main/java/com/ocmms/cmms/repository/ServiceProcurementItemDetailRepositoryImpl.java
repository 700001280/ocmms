package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import com.ocmms.cmms.model.mm.procurement.QServiceProcurementItemDetail;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = ServiceProcurementItemDetailRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class ServiceProcurementItemDetailRepositoryImpl
		extends QueryDslRepositorySupportExt<ServiceProcurementItemDetail>
		implements ServiceProcurementItemDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	ServiceProcurementItemDetailRepositoryImpl() {
		super(ServiceProcurementItemDetail.class);
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
	public static final String SERVICE_CATALOG = "serviceCatalog";

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
	public static final String DESCRIPTION = "description";

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
	public Page<ServiceProcurementItemDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QServiceProcurementItemDetail serviceProcurementItemDetail = QServiceProcurementItemDetail.serviceProcurementItemDetail;
		JPQLQuery<ServiceProcurementItemDetail> query = from(serviceProcurementItemDetail);
		Path<?>[] paths = new Path<?>[] { serviceProcurementItemDetail.procurementRequest,
				serviceProcurementItemDetail.procurementOrder, serviceProcurementItemDetail.requester,
				serviceProcurementItemDetail.prNumber, serviceProcurementItemDetail.poNumber,
				serviceProcurementItemDetail.material, serviceProcurementItemDetail.submitDate,
				serviceProcurementItemDetail.quantity, serviceProcurementItemDetail.uom,
				serviceProcurementItemDetail.organization, serviceProcurementItemDetail.unitPrice,
				serviceProcurementItemDetail.currencyUnit, serviceProcurementItemDetail.memo,
				serviceProcurementItemDetail.closed, serviceProcurementItemDetail.recordStatus,
				serviceProcurementItemDetail.createdDate, serviceProcurementItemDetail.createdBy,
				serviceProcurementItemDetail.lastModifiedDate, serviceProcurementItemDetail.lastModifiedBy,
				serviceProcurementItemDetail.serviceCatalog, serviceProcurementItemDetail.description };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, serviceProcurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, serviceProcurementItemDetail.procurementOrder)
				.map(REQUESTER, serviceProcurementItemDetail.requester)
				.map(PR_NUMBER, serviceProcurementItemDetail.prNumber)
				.map(PO_NUMBER, serviceProcurementItemDetail.poNumber)
				.map(MATERIAL, serviceProcurementItemDetail.material)
				.map(SUBMIT_DATE, serviceProcurementItemDetail.submitDate)
				.map(QUANTITY, serviceProcurementItemDetail.quantity).map(UOM, serviceProcurementItemDetail.uom)
				.map(ORGANIZATION, serviceProcurementItemDetail.organization)
				.map(UNIT_PRICE, serviceProcurementItemDetail.unitPrice)
				.map(CURRENCY_UNIT, serviceProcurementItemDetail.currencyUnit)
				.map(MEMO, serviceProcurementItemDetail.memo).map(CLOSED, serviceProcurementItemDetail.closed)
				.map(RECORD_STATUS, serviceProcurementItemDetail.recordStatus)
				.map(CREATED_DATE, serviceProcurementItemDetail.createdDate)
				.map(CREATED_BY, serviceProcurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, serviceProcurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, serviceProcurementItemDetail.lastModifiedBy)
				.map(SERVICE_CATALOG, serviceProcurementItemDetail.serviceCatalog)
				.map(DESCRIPTION, serviceProcurementItemDetail.description);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, serviceProcurementItemDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ServiceProcurementItemDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QServiceProcurementItemDetail serviceProcurementItemDetail = QServiceProcurementItemDetail.serviceProcurementItemDetail;
		JPQLQuery<ServiceProcurementItemDetail> query = from(serviceProcurementItemDetail);
		Path<?>[] paths = new Path<?>[] { serviceProcurementItemDetail.procurementRequest,
				serviceProcurementItemDetail.procurementOrder, serviceProcurementItemDetail.requester,
				serviceProcurementItemDetail.prNumber, serviceProcurementItemDetail.poNumber,
				serviceProcurementItemDetail.material, serviceProcurementItemDetail.submitDate,
				serviceProcurementItemDetail.quantity, serviceProcurementItemDetail.uom,
				serviceProcurementItemDetail.organization, serviceProcurementItemDetail.unitPrice,
				serviceProcurementItemDetail.currencyUnit, serviceProcurementItemDetail.memo,
				serviceProcurementItemDetail.closed, serviceProcurementItemDetail.recordStatus,
				serviceProcurementItemDetail.createdDate, serviceProcurementItemDetail.createdBy,
				serviceProcurementItemDetail.lastModifiedDate, serviceProcurementItemDetail.lastModifiedBy,
				serviceProcurementItemDetail.serviceCatalog, serviceProcurementItemDetail.description };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(serviceProcurementItemDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, serviceProcurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, serviceProcurementItemDetail.procurementOrder)
				.map(REQUESTER, serviceProcurementItemDetail.requester)
				.map(PR_NUMBER, serviceProcurementItemDetail.prNumber)
				.map(PO_NUMBER, serviceProcurementItemDetail.poNumber)
				.map(MATERIAL, serviceProcurementItemDetail.material)
				.map(SUBMIT_DATE, serviceProcurementItemDetail.submitDate)
				.map(QUANTITY, serviceProcurementItemDetail.quantity).map(UOM, serviceProcurementItemDetail.uom)
				.map(ORGANIZATION, serviceProcurementItemDetail.organization)
				.map(UNIT_PRICE, serviceProcurementItemDetail.unitPrice)
				.map(CURRENCY_UNIT, serviceProcurementItemDetail.currencyUnit)
				.map(MEMO, serviceProcurementItemDetail.memo).map(CLOSED, serviceProcurementItemDetail.closed)
				.map(RECORD_STATUS, serviceProcurementItemDetail.recordStatus)
				.map(CREATED_DATE, serviceProcurementItemDetail.createdDate)
				.map(CREATED_BY, serviceProcurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, serviceProcurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, serviceProcurementItemDetail.lastModifiedBy)
				.map(SERVICE_CATALOG, serviceProcurementItemDetail.serviceCatalog)
				.map(DESCRIPTION, serviceProcurementItemDetail.description);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, serviceProcurementItemDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ServiceProcurementItemDetail> findByServiceCatalog(ServiceCatalog serviceCatalog,
			GlobalSearch globalSearch, Pageable pageable) {
		QServiceProcurementItemDetail serviceProcurementItemDetail = QServiceProcurementItemDetail.serviceProcurementItemDetail;
		JPQLQuery<ServiceProcurementItemDetail> query = from(serviceProcurementItemDetail);
		Assert.notNull(serviceCatalog, "serviceCatalog is required");
		query.where(serviceProcurementItemDetail.serviceCatalog.eq(serviceCatalog));
		Path<?>[] paths = new Path<?>[] { serviceProcurementItemDetail.procurementRequest,
				serviceProcurementItemDetail.procurementOrder, serviceProcurementItemDetail.requester,
				serviceProcurementItemDetail.prNumber, serviceProcurementItemDetail.poNumber,
				serviceProcurementItemDetail.material, serviceProcurementItemDetail.submitDate,
				serviceProcurementItemDetail.quantity, serviceProcurementItemDetail.uom,
				serviceProcurementItemDetail.organization, serviceProcurementItemDetail.unitPrice,
				serviceProcurementItemDetail.currencyUnit, serviceProcurementItemDetail.memo,
				serviceProcurementItemDetail.closed, serviceProcurementItemDetail.recordStatus,
				serviceProcurementItemDetail.createdDate, serviceProcurementItemDetail.createdBy,
				serviceProcurementItemDetail.lastModifiedDate, serviceProcurementItemDetail.lastModifiedBy,
				serviceProcurementItemDetail.serviceCatalog, serviceProcurementItemDetail.description };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, serviceProcurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, serviceProcurementItemDetail.procurementOrder)
				.map(REQUESTER, serviceProcurementItemDetail.requester)
				.map(PR_NUMBER, serviceProcurementItemDetail.prNumber)
				.map(PO_NUMBER, serviceProcurementItemDetail.poNumber)
				.map(MATERIAL, serviceProcurementItemDetail.material)
				.map(SUBMIT_DATE, serviceProcurementItemDetail.submitDate)
				.map(QUANTITY, serviceProcurementItemDetail.quantity).map(UOM, serviceProcurementItemDetail.uom)
				.map(ORGANIZATION, serviceProcurementItemDetail.organization)
				.map(UNIT_PRICE, serviceProcurementItemDetail.unitPrice)
				.map(CURRENCY_UNIT, serviceProcurementItemDetail.currencyUnit)
				.map(MEMO, serviceProcurementItemDetail.memo).map(CLOSED, serviceProcurementItemDetail.closed)
				.map(RECORD_STATUS, serviceProcurementItemDetail.recordStatus)
				.map(CREATED_DATE, serviceProcurementItemDetail.createdDate)
				.map(CREATED_BY, serviceProcurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, serviceProcurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, serviceProcurementItemDetail.lastModifiedBy)
				.map(SERVICE_CATALOG, serviceProcurementItemDetail.serviceCatalog)
				.map(DESCRIPTION, serviceProcurementItemDetail.description);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, serviceProcurementItemDetail);
	}
}
