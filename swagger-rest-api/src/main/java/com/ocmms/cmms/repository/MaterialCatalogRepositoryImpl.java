package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.master.QMaterialCatalog;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialCatalogRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialCatalogRepositoryImpl extends QueryDslRepositorySupportExt<MaterialCatalog>
		implements MaterialCatalogRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialCatalogRepositoryImpl() {
		super(MaterialCatalog.class);
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
	public static final String MATERIAL_GROUP = "materialGroup";

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
	public static final String HAZARDOUS_MATERIAL = "hazardousMaterial";

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
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SHELF_LIFE_DAYS = "shelfLifeDays";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_TYPE = "materialType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CODE = "code";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UOM = "uom";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SHORT_DESCRIPTION = "shortDescription";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DISCIPLINE = "discipline";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LONG_DESCRIPTION = "longDescription";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_NAME = "materialName";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String INSTOCK_TYPE = "instockType";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialCatalog> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialCatalog materialCatalog = QMaterialCatalog.materialCatalog;
		JPQLQuery<MaterialCatalog> query = from(materialCatalog);
		Path<?>[] paths = new Path<?>[] { materialCatalog.code, materialCatalog.materialName,
				materialCatalog.materialGroup, materialCatalog.recordStatus, materialCatalog.createdDate,
				materialCatalog.createdBy, materialCatalog.lastModifiedDate, materialCatalog.lastModifiedBy,
				materialCatalog.materialType, materialCatalog.discipline, materialCatalog.instockType,
				materialCatalog.uom, materialCatalog.usefulLife, materialCatalog.shelfLifeDays,
				materialCatalog.shortDescription, materialCatalog.longDescription, materialCatalog.hazardousMaterial };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, materialCatalog.code)
				.map(MATERIAL_NAME, materialCatalog.materialName).map(MATERIAL_GROUP, materialCatalog.materialGroup)
				.map(RECORD_STATUS, materialCatalog.recordStatus).map(CREATED_DATE, materialCatalog.createdDate)
				.map(CREATED_BY, materialCatalog.createdBy).map(LAST_MODIFIED_DATE, materialCatalog.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialCatalog.lastModifiedBy).map(MATERIAL_TYPE, materialCatalog.materialType)
				.map(DISCIPLINE, materialCatalog.discipline).map(INSTOCK_TYPE, materialCatalog.instockType)
				.map(UOM, materialCatalog.uom).map(USEFUL_LIFE, materialCatalog.usefulLife)
				.map(SHELF_LIFE_DAYS, materialCatalog.shelfLifeDays)
				.map(SHORT_DESCRIPTION, materialCatalog.shortDescription)
				.map(LONG_DESCRIPTION, materialCatalog.longDescription)
				.map(HAZARDOUS_MATERIAL, materialCatalog.hazardousMaterial);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialCatalog);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialCatalog> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialCatalog materialCatalog = QMaterialCatalog.materialCatalog;
		JPQLQuery<MaterialCatalog> query = from(materialCatalog);
		Path<?>[] paths = new Path<?>[] { materialCatalog.code, materialCatalog.materialName,
				materialCatalog.materialGroup, materialCatalog.recordStatus, materialCatalog.createdDate,
				materialCatalog.createdBy, materialCatalog.lastModifiedDate, materialCatalog.lastModifiedBy,
				materialCatalog.materialType, materialCatalog.discipline, materialCatalog.instockType,
				materialCatalog.uom, materialCatalog.usefulLife, materialCatalog.shelfLifeDays,
				materialCatalog.shortDescription, materialCatalog.longDescription, materialCatalog.hazardousMaterial };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialCatalog.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, materialCatalog.code)
				.map(MATERIAL_NAME, materialCatalog.materialName).map(MATERIAL_GROUP, materialCatalog.materialGroup)
				.map(RECORD_STATUS, materialCatalog.recordStatus).map(CREATED_DATE, materialCatalog.createdDate)
				.map(CREATED_BY, materialCatalog.createdBy).map(LAST_MODIFIED_DATE, materialCatalog.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialCatalog.lastModifiedBy).map(MATERIAL_TYPE, materialCatalog.materialType)
				.map(DISCIPLINE, materialCatalog.discipline).map(INSTOCK_TYPE, materialCatalog.instockType)
				.map(UOM, materialCatalog.uom).map(USEFUL_LIFE, materialCatalog.usefulLife)
				.map(SHELF_LIFE_DAYS, materialCatalog.shelfLifeDays)
				.map(SHORT_DESCRIPTION, materialCatalog.shortDescription)
				.map(LONG_DESCRIPTION, materialCatalog.longDescription)
				.map(HAZARDOUS_MATERIAL, materialCatalog.hazardousMaterial);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialCatalog);
	}
}
