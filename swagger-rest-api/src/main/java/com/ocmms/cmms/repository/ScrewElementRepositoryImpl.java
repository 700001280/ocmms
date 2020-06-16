package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.ScrewElement;
import com.ocmms.cmms.model.mm.master.QScrewElement;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ScrewElementRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ScrewElementRepositoryImpl extends QueryDslRepositorySupportExt<ScrewElement>
		implements ScrewElementRepositoryCustom {

	/**
	 * Default constructor
	 */
	ScrewElementRepositoryImpl() {
		super(ScrewElement.class);
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
	public static final String MACHINE_TYPE = "machineType";

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
	public static final String SCREW_TYPE = "screwType";

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
	public Page<ScrewElement> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QScrewElement screwElement = QScrewElement.screwElement;
		JPQLQuery<ScrewElement> query = from(screwElement);
		Path<?>[] paths = new Path<?>[] { screwElement.materialCatalog, screwElement.organization, screwElement.stock,
				screwElement.safetyStock, screwElement.reqReorderPoint, screwElement.consumableInventory,
				screwElement.critical, screwElement.usefulLife, screwElement.shelfLifeDays,
				screwElement.declarationNumber, screwElement.declarationName, screwElement.documentType,
				screwElement.recordStatus, screwElement.createdDate, screwElement.createdBy,
				screwElement.lastModifiedDate, screwElement.lastModifiedBy, screwElement.machineType,
				screwElement.screwType, screwElement.memo };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, screwElement.materialCatalog)
				.map(ORGANIZATION, screwElement.organization).map(STOCK, screwElement.stock)
				.map(SAFETY_STOCK, screwElement.safetyStock).map(REQ_REORDER_POINT, screwElement.reqReorderPoint)
				.map(CONSUMABLE_INVENTORY, screwElement.consumableInventory).map(CRITICAL, screwElement.critical)
				.map(USEFUL_LIFE, screwElement.usefulLife).map(SHELF_LIFE_DAYS, screwElement.shelfLifeDays)
				.map(DECLARATION_NUMBER, screwElement.declarationNumber)
				.map(DECLARATION_NAME, screwElement.declarationName).map(DOCUMENT_TYPE, screwElement.documentType)
				.map(RECORD_STATUS, screwElement.recordStatus).map(CREATED_DATE, screwElement.createdDate)
				.map(CREATED_BY, screwElement.createdBy).map(LAST_MODIFIED_DATE, screwElement.lastModifiedDate)
				.map(LAST_MODIFIED_BY, screwElement.lastModifiedBy).map(MACHINE_TYPE, screwElement.machineType)
				.map(SCREW_TYPE, screwElement.screwType).map(MEMO, screwElement.memo);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, screwElement);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ScrewElement> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QScrewElement screwElement = QScrewElement.screwElement;
		JPQLQuery<ScrewElement> query = from(screwElement);
		Path<?>[] paths = new Path<?>[] { screwElement.materialCatalog, screwElement.organization, screwElement.stock,
				screwElement.safetyStock, screwElement.reqReorderPoint, screwElement.consumableInventory,
				screwElement.critical, screwElement.usefulLife, screwElement.shelfLifeDays,
				screwElement.declarationNumber, screwElement.declarationName, screwElement.documentType,
				screwElement.recordStatus, screwElement.createdDate, screwElement.createdBy,
				screwElement.lastModifiedDate, screwElement.lastModifiedBy, screwElement.machineType,
				screwElement.screwType, screwElement.memo };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(screwElement.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, screwElement.materialCatalog)
				.map(ORGANIZATION, screwElement.organization).map(STOCK, screwElement.stock)
				.map(SAFETY_STOCK, screwElement.safetyStock).map(REQ_REORDER_POINT, screwElement.reqReorderPoint)
				.map(CONSUMABLE_INVENTORY, screwElement.consumableInventory).map(CRITICAL, screwElement.critical)
				.map(USEFUL_LIFE, screwElement.usefulLife).map(SHELF_LIFE_DAYS, screwElement.shelfLifeDays)
				.map(DECLARATION_NUMBER, screwElement.declarationNumber)
				.map(DECLARATION_NAME, screwElement.declarationName).map(DOCUMENT_TYPE, screwElement.documentType)
				.map(RECORD_STATUS, screwElement.recordStatus).map(CREATED_DATE, screwElement.createdDate)
				.map(CREATED_BY, screwElement.createdBy).map(LAST_MODIFIED_DATE, screwElement.lastModifiedDate)
				.map(LAST_MODIFIED_BY, screwElement.lastModifiedBy).map(MACHINE_TYPE, screwElement.machineType)
				.map(SCREW_TYPE, screwElement.screwType).map(MEMO, screwElement.memo);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, screwElement);
	}
}
