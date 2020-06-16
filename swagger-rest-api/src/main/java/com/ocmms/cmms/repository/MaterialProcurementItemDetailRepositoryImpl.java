package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.procurement.QMaterialProcurementItemDetail;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = MaterialProcurementItemDetailRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialProcurementItemDetailRepositoryImpl
		extends QueryDslRepositorySupportExt<MaterialProcurementItemDetail>
		implements MaterialProcurementItemDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialProcurementItemDetailRepositoryImpl() {
		super(MaterialProcurementItemDetail.class);
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
	public static final String WORK_ORDER_MATERIAL = "workOrderMaterial";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_CATALOG = "materialCatalog";

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
	public Page<MaterialProcurementItemDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialProcurementItemDetail materialProcurementItemDetail = QMaterialProcurementItemDetail.materialProcurementItemDetail;
		JPQLQuery<MaterialProcurementItemDetail> query = from(materialProcurementItemDetail);
		Path<?>[] paths = new Path<?>[] { materialProcurementItemDetail.procurementRequest,
				materialProcurementItemDetail.procurementOrder, materialProcurementItemDetail.requester,
				materialProcurementItemDetail.prNumber, materialProcurementItemDetail.poNumber,
				materialProcurementItemDetail.material, materialProcurementItemDetail.submitDate,
				materialProcurementItemDetail.quantity, materialProcurementItemDetail.uom,
				materialProcurementItemDetail.organization, materialProcurementItemDetail.unitPrice,
				materialProcurementItemDetail.currencyUnit, materialProcurementItemDetail.memo,
				materialProcurementItemDetail.closed, materialProcurementItemDetail.recordStatus,
				materialProcurementItemDetail.createdDate, materialProcurementItemDetail.createdBy,
				materialProcurementItemDetail.lastModifiedDate, materialProcurementItemDetail.lastModifiedBy,
				materialProcurementItemDetail.materialCatalog, materialProcurementItemDetail.workOrderMaterial };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, materialProcurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, materialProcurementItemDetail.procurementOrder)
				.map(REQUESTER, materialProcurementItemDetail.requester)
				.map(PR_NUMBER, materialProcurementItemDetail.prNumber)
				.map(PO_NUMBER, materialProcurementItemDetail.poNumber)
				.map(MATERIAL, materialProcurementItemDetail.material)
				.map(SUBMIT_DATE, materialProcurementItemDetail.submitDate)
				.map(QUANTITY, materialProcurementItemDetail.quantity).map(UOM, materialProcurementItemDetail.uom)
				.map(ORGANIZATION, materialProcurementItemDetail.organization)
				.map(UNIT_PRICE, materialProcurementItemDetail.unitPrice)
				.map(CURRENCY_UNIT, materialProcurementItemDetail.currencyUnit)
				.map(MEMO, materialProcurementItemDetail.memo).map(CLOSED, materialProcurementItemDetail.closed)
				.map(RECORD_STATUS, materialProcurementItemDetail.recordStatus)
				.map(CREATED_DATE, materialProcurementItemDetail.createdDate)
				.map(CREATED_BY, materialProcurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialProcurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialProcurementItemDetail.lastModifiedBy)
				.map(MATERIAL_CATALOG, materialProcurementItemDetail.materialCatalog)
				.map(WORK_ORDER_MATERIAL, materialProcurementItemDetail.workOrderMaterial);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialProcurementItemDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialProcurementItemDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QMaterialProcurementItemDetail materialProcurementItemDetail = QMaterialProcurementItemDetail.materialProcurementItemDetail;
		JPQLQuery<MaterialProcurementItemDetail> query = from(materialProcurementItemDetail);
		Path<?>[] paths = new Path<?>[] { materialProcurementItemDetail.procurementRequest,
				materialProcurementItemDetail.procurementOrder, materialProcurementItemDetail.requester,
				materialProcurementItemDetail.prNumber, materialProcurementItemDetail.poNumber,
				materialProcurementItemDetail.material, materialProcurementItemDetail.submitDate,
				materialProcurementItemDetail.quantity, materialProcurementItemDetail.uom,
				materialProcurementItemDetail.organization, materialProcurementItemDetail.unitPrice,
				materialProcurementItemDetail.currencyUnit, materialProcurementItemDetail.memo,
				materialProcurementItemDetail.closed, materialProcurementItemDetail.recordStatus,
				materialProcurementItemDetail.createdDate, materialProcurementItemDetail.createdBy,
				materialProcurementItemDetail.lastModifiedDate, materialProcurementItemDetail.lastModifiedBy,
				materialProcurementItemDetail.materialCatalog, materialProcurementItemDetail.workOrderMaterial };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialProcurementItemDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, materialProcurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, materialProcurementItemDetail.procurementOrder)
				.map(REQUESTER, materialProcurementItemDetail.requester)
				.map(PR_NUMBER, materialProcurementItemDetail.prNumber)
				.map(PO_NUMBER, materialProcurementItemDetail.poNumber)
				.map(MATERIAL, materialProcurementItemDetail.material)
				.map(SUBMIT_DATE, materialProcurementItemDetail.submitDate)
				.map(QUANTITY, materialProcurementItemDetail.quantity).map(UOM, materialProcurementItemDetail.uom)
				.map(ORGANIZATION, materialProcurementItemDetail.organization)
				.map(UNIT_PRICE, materialProcurementItemDetail.unitPrice)
				.map(CURRENCY_UNIT, materialProcurementItemDetail.currencyUnit)
				.map(MEMO, materialProcurementItemDetail.memo).map(CLOSED, materialProcurementItemDetail.closed)
				.map(RECORD_STATUS, materialProcurementItemDetail.recordStatus)
				.map(CREATED_DATE, materialProcurementItemDetail.createdDate)
				.map(CREATED_BY, materialProcurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialProcurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialProcurementItemDetail.lastModifiedBy)
				.map(MATERIAL_CATALOG, materialProcurementItemDetail.materialCatalog)
				.map(WORK_ORDER_MATERIAL, materialProcurementItemDetail.workOrderMaterial);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialProcurementItemDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialProcurementItemDetail> findByMaterialCatalog(MaterialCatalog materialCatalog,
			GlobalSearch globalSearch, Pageable pageable) {
		QMaterialProcurementItemDetail materialProcurementItemDetail = QMaterialProcurementItemDetail.materialProcurementItemDetail;
		JPQLQuery<MaterialProcurementItemDetail> query = from(materialProcurementItemDetail);
		Assert.notNull(materialCatalog, "materialCatalog is required");
		query.where(materialProcurementItemDetail.materialCatalog.eq(materialCatalog));
		Path<?>[] paths = new Path<?>[] { materialProcurementItemDetail.procurementRequest,
				materialProcurementItemDetail.procurementOrder, materialProcurementItemDetail.requester,
				materialProcurementItemDetail.prNumber, materialProcurementItemDetail.poNumber,
				materialProcurementItemDetail.material, materialProcurementItemDetail.submitDate,
				materialProcurementItemDetail.quantity, materialProcurementItemDetail.uom,
				materialProcurementItemDetail.organization, materialProcurementItemDetail.unitPrice,
				materialProcurementItemDetail.currencyUnit, materialProcurementItemDetail.memo,
				materialProcurementItemDetail.closed, materialProcurementItemDetail.recordStatus,
				materialProcurementItemDetail.createdDate, materialProcurementItemDetail.createdBy,
				materialProcurementItemDetail.lastModifiedDate, materialProcurementItemDetail.lastModifiedBy,
				materialProcurementItemDetail.materialCatalog, materialProcurementItemDetail.workOrderMaterial };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, materialProcurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, materialProcurementItemDetail.procurementOrder)
				.map(REQUESTER, materialProcurementItemDetail.requester)
				.map(PR_NUMBER, materialProcurementItemDetail.prNumber)
				.map(PO_NUMBER, materialProcurementItemDetail.poNumber)
				.map(MATERIAL, materialProcurementItemDetail.material)
				.map(SUBMIT_DATE, materialProcurementItemDetail.submitDate)
				.map(QUANTITY, materialProcurementItemDetail.quantity).map(UOM, materialProcurementItemDetail.uom)
				.map(ORGANIZATION, materialProcurementItemDetail.organization)
				.map(UNIT_PRICE, materialProcurementItemDetail.unitPrice)
				.map(CURRENCY_UNIT, materialProcurementItemDetail.currencyUnit)
				.map(MEMO, materialProcurementItemDetail.memo).map(CLOSED, materialProcurementItemDetail.closed)
				.map(RECORD_STATUS, materialProcurementItemDetail.recordStatus)
				.map(CREATED_DATE, materialProcurementItemDetail.createdDate)
				.map(CREATED_BY, materialProcurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialProcurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialProcurementItemDetail.lastModifiedBy)
				.map(MATERIAL_CATALOG, materialProcurementItemDetail.materialCatalog)
				.map(WORK_ORDER_MATERIAL, materialProcurementItemDetail.workOrderMaterial);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialProcurementItemDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderMaterial
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialProcurementItemDetail> findByWorkOrderMaterial(WorkOrderMaterial workOrderMaterial,
			GlobalSearch globalSearch, Pageable pageable) {
		QMaterialProcurementItemDetail materialProcurementItemDetail = QMaterialProcurementItemDetail.materialProcurementItemDetail;
		JPQLQuery<MaterialProcurementItemDetail> query = from(materialProcurementItemDetail);
		Assert.notNull(workOrderMaterial, "workOrderMaterial is required");
		query.where(materialProcurementItemDetail.workOrderMaterial.eq(workOrderMaterial));
		Path<?>[] paths = new Path<?>[] { materialProcurementItemDetail.procurementRequest,
				materialProcurementItemDetail.procurementOrder, materialProcurementItemDetail.requester,
				materialProcurementItemDetail.prNumber, materialProcurementItemDetail.poNumber,
				materialProcurementItemDetail.material, materialProcurementItemDetail.submitDate,
				materialProcurementItemDetail.quantity, materialProcurementItemDetail.uom,
				materialProcurementItemDetail.organization, materialProcurementItemDetail.unitPrice,
				materialProcurementItemDetail.currencyUnit, materialProcurementItemDetail.memo,
				materialProcurementItemDetail.closed, materialProcurementItemDetail.recordStatus,
				materialProcurementItemDetail.createdDate, materialProcurementItemDetail.createdBy,
				materialProcurementItemDetail.lastModifiedDate, materialProcurementItemDetail.lastModifiedBy,
				materialProcurementItemDetail.materialCatalog, materialProcurementItemDetail.workOrderMaterial };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PROCUREMENT_REQUEST, materialProcurementItemDetail.procurementRequest)
				.map(PROCUREMENT_ORDER, materialProcurementItemDetail.procurementOrder)
				.map(REQUESTER, materialProcurementItemDetail.requester)
				.map(PR_NUMBER, materialProcurementItemDetail.prNumber)
				.map(PO_NUMBER, materialProcurementItemDetail.poNumber)
				.map(MATERIAL, materialProcurementItemDetail.material)
				.map(SUBMIT_DATE, materialProcurementItemDetail.submitDate)
				.map(QUANTITY, materialProcurementItemDetail.quantity).map(UOM, materialProcurementItemDetail.uom)
				.map(ORGANIZATION, materialProcurementItemDetail.organization)
				.map(UNIT_PRICE, materialProcurementItemDetail.unitPrice)
				.map(CURRENCY_UNIT, materialProcurementItemDetail.currencyUnit)
				.map(MEMO, materialProcurementItemDetail.memo).map(CLOSED, materialProcurementItemDetail.closed)
				.map(RECORD_STATUS, materialProcurementItemDetail.recordStatus)
				.map(CREATED_DATE, materialProcurementItemDetail.createdDate)
				.map(CREATED_BY, materialProcurementItemDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialProcurementItemDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialProcurementItemDetail.lastModifiedBy)
				.map(MATERIAL_CATALOG, materialProcurementItemDetail.materialCatalog)
				.map(WORK_ORDER_MATERIAL, materialProcurementItemDetail.workOrderMaterial);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialProcurementItemDetail);
	}
}
