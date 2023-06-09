package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.master.QMaterialPlantInfo;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = MaterialPlantInfoRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialPlantInfoRepositoryImpl extends QueryDslRepositorySupportExt<MaterialPlantInfo>
		implements MaterialPlantInfoRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialPlantInfoRepositoryImpl() {
		super(MaterialPlantInfo.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DECLARATION_NUMBER = "declarationNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CONSUMABLE_INVENTORY = "consumableInventory";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REQ_REORDER_POINT = "reqReorderPoint";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String USEFUL_LIFE = "usefulLife";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SHELF_LIFE_DAYS = "shelfLifeDays";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String STOCK = "stock";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DECLARATION_NAME = "declarationName";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_CATALOG = "materialCatalog";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SAFETY_STOCK = "safetyStock";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DOCUMENT_TYPE = "documentType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CRITICAL = "critical";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialPlantInfo> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialPlantInfo materialPlantInfo = QMaterialPlantInfo.materialPlantInfo;
		JPQLQuery<MaterialPlantInfo> query = from(materialPlantInfo);
		Path<?>[] paths = new Path<?>[] { materialPlantInfo.materialCatalog, materialPlantInfo.organization,
				materialPlantInfo.stock, materialPlantInfo.safetyStock, materialPlantInfo.reqReorderPoint,
				materialPlantInfo.consumableInventory, materialPlantInfo.critical, materialPlantInfo.usefulLife,
				materialPlantInfo.shelfLifeDays, materialPlantInfo.declarationNumber, materialPlantInfo.declarationName,
				materialPlantInfo.documentType, materialPlantInfo.recordStatus, materialPlantInfo.createdDate,
				materialPlantInfo.createdBy, materialPlantInfo.lastModifiedDate, materialPlantInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, materialPlantInfo.materialCatalog)
				.map(ORGANIZATION, materialPlantInfo.organization).map(STOCK, materialPlantInfo.stock)
				.map(SAFETY_STOCK, materialPlantInfo.safetyStock)
				.map(REQ_REORDER_POINT, materialPlantInfo.reqReorderPoint)
				.map(CONSUMABLE_INVENTORY, materialPlantInfo.consumableInventory)
				.map(CRITICAL, materialPlantInfo.critical).map(USEFUL_LIFE, materialPlantInfo.usefulLife)
				.map(SHELF_LIFE_DAYS, materialPlantInfo.shelfLifeDays)
				.map(DECLARATION_NUMBER, materialPlantInfo.declarationNumber)
				.map(DECLARATION_NAME, materialPlantInfo.declarationName)
				.map(DOCUMENT_TYPE, materialPlantInfo.documentType).map(RECORD_STATUS, materialPlantInfo.recordStatus)
				.map(CREATED_DATE, materialPlantInfo.createdDate).map(CREATED_BY, materialPlantInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialPlantInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialPlantInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialPlantInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialPlantInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialPlantInfo materialPlantInfo = QMaterialPlantInfo.materialPlantInfo;
		JPQLQuery<MaterialPlantInfo> query = from(materialPlantInfo);
		Path<?>[] paths = new Path<?>[] { materialPlantInfo.materialCatalog, materialPlantInfo.organization,
				materialPlantInfo.stock, materialPlantInfo.safetyStock, materialPlantInfo.reqReorderPoint,
				materialPlantInfo.consumableInventory, materialPlantInfo.critical, materialPlantInfo.usefulLife,
				materialPlantInfo.shelfLifeDays, materialPlantInfo.declarationNumber, materialPlantInfo.declarationName,
				materialPlantInfo.documentType, materialPlantInfo.recordStatus, materialPlantInfo.createdDate,
				materialPlantInfo.createdBy, materialPlantInfo.lastModifiedDate, materialPlantInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialPlantInfo.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, materialPlantInfo.materialCatalog)
				.map(ORGANIZATION, materialPlantInfo.organization).map(STOCK, materialPlantInfo.stock)
				.map(SAFETY_STOCK, materialPlantInfo.safetyStock)
				.map(REQ_REORDER_POINT, materialPlantInfo.reqReorderPoint)
				.map(CONSUMABLE_INVENTORY, materialPlantInfo.consumableInventory)
				.map(CRITICAL, materialPlantInfo.critical).map(USEFUL_LIFE, materialPlantInfo.usefulLife)
				.map(SHELF_LIFE_DAYS, materialPlantInfo.shelfLifeDays)
				.map(DECLARATION_NUMBER, materialPlantInfo.declarationNumber)
				.map(DECLARATION_NAME, materialPlantInfo.declarationName)
				.map(DOCUMENT_TYPE, materialPlantInfo.documentType).map(RECORD_STATUS, materialPlantInfo.recordStatus)
				.map(CREATED_DATE, materialPlantInfo.createdDate).map(CREATED_BY, materialPlantInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialPlantInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialPlantInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialPlantInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialPlantInfo> findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch,
			Pageable pageable) {
		QMaterialPlantInfo materialPlantInfo = QMaterialPlantInfo.materialPlantInfo;
		JPQLQuery<MaterialPlantInfo> query = from(materialPlantInfo);
		Assert.notNull(materialCatalog, "materialCatalog is required");
		query.where(materialPlantInfo.materialCatalog.eq(materialCatalog));
		Path<?>[] paths = new Path<?>[] { materialPlantInfo.materialCatalog, materialPlantInfo.organization,
				materialPlantInfo.stock, materialPlantInfo.safetyStock, materialPlantInfo.reqReorderPoint,
				materialPlantInfo.consumableInventory, materialPlantInfo.critical, materialPlantInfo.usefulLife,
				materialPlantInfo.shelfLifeDays, materialPlantInfo.declarationNumber, materialPlantInfo.declarationName,
				materialPlantInfo.documentType, materialPlantInfo.recordStatus, materialPlantInfo.createdDate,
				materialPlantInfo.createdBy, materialPlantInfo.lastModifiedDate, materialPlantInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, materialPlantInfo.materialCatalog)
				.map(ORGANIZATION, materialPlantInfo.organization).map(STOCK, materialPlantInfo.stock)
				.map(SAFETY_STOCK, materialPlantInfo.safetyStock)
				.map(REQ_REORDER_POINT, materialPlantInfo.reqReorderPoint)
				.map(CONSUMABLE_INVENTORY, materialPlantInfo.consumableInventory)
				.map(CRITICAL, materialPlantInfo.critical).map(USEFUL_LIFE, materialPlantInfo.usefulLife)
				.map(SHELF_LIFE_DAYS, materialPlantInfo.shelfLifeDays)
				.map(DECLARATION_NUMBER, materialPlantInfo.declarationNumber)
				.map(DECLARATION_NAME, materialPlantInfo.declarationName)
				.map(DOCUMENT_TYPE, materialPlantInfo.documentType).map(RECORD_STATUS, materialPlantInfo.recordStatus)
				.map(CREATED_DATE, materialPlantInfo.createdDate).map(CREATED_BY, materialPlantInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialPlantInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialPlantInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialPlantInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialPlantInfo> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable) {
		QMaterialPlantInfo materialPlantInfo = QMaterialPlantInfo.materialPlantInfo;
		JPQLQuery<MaterialPlantInfo> query = from(materialPlantInfo);
		Assert.notNull(organization, "organization is required");
		query.where(materialPlantInfo.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { materialPlantInfo.materialCatalog, materialPlantInfo.organization,
				materialPlantInfo.stock, materialPlantInfo.safetyStock, materialPlantInfo.reqReorderPoint,
				materialPlantInfo.consumableInventory, materialPlantInfo.critical, materialPlantInfo.usefulLife,
				materialPlantInfo.shelfLifeDays, materialPlantInfo.declarationNumber, materialPlantInfo.declarationName,
				materialPlantInfo.documentType, materialPlantInfo.recordStatus, materialPlantInfo.createdDate,
				materialPlantInfo.createdBy, materialPlantInfo.lastModifiedDate, materialPlantInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, materialPlantInfo.materialCatalog)
				.map(ORGANIZATION, materialPlantInfo.organization).map(STOCK, materialPlantInfo.stock)
				.map(SAFETY_STOCK, materialPlantInfo.safetyStock)
				.map(REQ_REORDER_POINT, materialPlantInfo.reqReorderPoint)
				.map(CONSUMABLE_INVENTORY, materialPlantInfo.consumableInventory)
				.map(CRITICAL, materialPlantInfo.critical).map(USEFUL_LIFE, materialPlantInfo.usefulLife)
				.map(SHELF_LIFE_DAYS, materialPlantInfo.shelfLifeDays)
				.map(DECLARATION_NUMBER, materialPlantInfo.declarationNumber)
				.map(DECLARATION_NAME, materialPlantInfo.declarationName)
				.map(DOCUMENT_TYPE, materialPlantInfo.documentType).map(RECORD_STATUS, materialPlantInfo.recordStatus)
				.map(CREATED_DATE, materialPlantInfo.createdDate).map(CREATED_BY, materialPlantInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialPlantInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialPlantInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialPlantInfo);
	}
}
