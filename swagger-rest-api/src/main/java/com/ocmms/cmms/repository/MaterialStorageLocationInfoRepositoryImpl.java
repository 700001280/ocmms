package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.QMaterialStorageLocationInfo;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = MaterialStorageLocationInfoRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialStorageLocationInfoRepositoryImpl extends QueryDslRepositorySupportExt<MaterialStorageLocationInfo>
		implements MaterialStorageLocationInfoRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialStorageLocationInfoRepositoryImpl() {
		super(MaterialStorageLocationInfo.class);
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
	public static final String STORAGE_LOCATION = "storageLocation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_CATALOG = "materialCatalog";

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
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialStorageLocationInfo> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialStorageLocationInfo materialStorageLocationInfo = QMaterialStorageLocationInfo.materialStorageLocationInfo;
		JPQLQuery<MaterialStorageLocationInfo> query = from(materialStorageLocationInfo);
		Path<?>[] paths = new Path<?>[] { materialStorageLocationInfo.materialCatalog,
				materialStorageLocationInfo.storageLocation, materialStorageLocationInfo.stock,
				materialStorageLocationInfo.recordStatus, materialStorageLocationInfo.createdDate,
				materialStorageLocationInfo.createdBy, materialStorageLocationInfo.lastModifiedDate,
				materialStorageLocationInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, materialStorageLocationInfo.materialCatalog)
				.map(STORAGE_LOCATION, materialStorageLocationInfo.storageLocation)
				.map(STOCK, materialStorageLocationInfo.stock)
				.map(RECORD_STATUS, materialStorageLocationInfo.recordStatus)
				.map(CREATED_DATE, materialStorageLocationInfo.createdDate)
				.map(CREATED_BY, materialStorageLocationInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialStorageLocationInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialStorageLocationInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialStorageLocationInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialStorageLocationInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QMaterialStorageLocationInfo materialStorageLocationInfo = QMaterialStorageLocationInfo.materialStorageLocationInfo;
		JPQLQuery<MaterialStorageLocationInfo> query = from(materialStorageLocationInfo);
		Path<?>[] paths = new Path<?>[] { materialStorageLocationInfo.materialCatalog,
				materialStorageLocationInfo.storageLocation, materialStorageLocationInfo.stock,
				materialStorageLocationInfo.recordStatus, materialStorageLocationInfo.createdDate,
				materialStorageLocationInfo.createdBy, materialStorageLocationInfo.lastModifiedDate,
				materialStorageLocationInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialStorageLocationInfo.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, materialStorageLocationInfo.materialCatalog)
				.map(STORAGE_LOCATION, materialStorageLocationInfo.storageLocation)
				.map(STOCK, materialStorageLocationInfo.stock)
				.map(RECORD_STATUS, materialStorageLocationInfo.recordStatus)
				.map(CREATED_DATE, materialStorageLocationInfo.createdDate)
				.map(CREATED_BY, materialStorageLocationInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialStorageLocationInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialStorageLocationInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialStorageLocationInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialStorageLocationInfo> findByMaterialCatalog(MaterialCatalog materialCatalog,
			GlobalSearch globalSearch, Pageable pageable) {
		QMaterialStorageLocationInfo materialStorageLocationInfo = QMaterialStorageLocationInfo.materialStorageLocationInfo;
		JPQLQuery<MaterialStorageLocationInfo> query = from(materialStorageLocationInfo);
		Assert.notNull(materialCatalog, "materialCatalog is required");
		query.where(materialStorageLocationInfo.materialCatalog.eq(materialCatalog));
		Path<?>[] paths = new Path<?>[] { materialStorageLocationInfo.materialCatalog,
				materialStorageLocationInfo.storageLocation, materialStorageLocationInfo.stock,
				materialStorageLocationInfo.recordStatus, materialStorageLocationInfo.createdDate,
				materialStorageLocationInfo.createdBy, materialStorageLocationInfo.lastModifiedDate,
				materialStorageLocationInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, materialStorageLocationInfo.materialCatalog)
				.map(STORAGE_LOCATION, materialStorageLocationInfo.storageLocation)
				.map(STOCK, materialStorageLocationInfo.stock)
				.map(RECORD_STATUS, materialStorageLocationInfo.recordStatus)
				.map(CREATED_DATE, materialStorageLocationInfo.createdDate)
				.map(CREATED_BY, materialStorageLocationInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialStorageLocationInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialStorageLocationInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialStorageLocationInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param storageLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialStorageLocationInfo> findByStorageLocation(StorageLocation storageLocation,
			GlobalSearch globalSearch, Pageable pageable) {
		QMaterialStorageLocationInfo materialStorageLocationInfo = QMaterialStorageLocationInfo.materialStorageLocationInfo;
		JPQLQuery<MaterialStorageLocationInfo> query = from(materialStorageLocationInfo);
		Assert.notNull(storageLocation, "storageLocation is required");
		query.where(materialStorageLocationInfo.storageLocation.eq(storageLocation));
		Path<?>[] paths = new Path<?>[] { materialStorageLocationInfo.materialCatalog,
				materialStorageLocationInfo.storageLocation, materialStorageLocationInfo.stock,
				materialStorageLocationInfo.recordStatus, materialStorageLocationInfo.createdDate,
				materialStorageLocationInfo.createdBy, materialStorageLocationInfo.lastModifiedDate,
				materialStorageLocationInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, materialStorageLocationInfo.materialCatalog)
				.map(STORAGE_LOCATION, materialStorageLocationInfo.storageLocation)
				.map(STOCK, materialStorageLocationInfo.stock)
				.map(RECORD_STATUS, materialStorageLocationInfo.recordStatus)
				.map(CREATED_DATE, materialStorageLocationInfo.createdDate)
				.map(CREATED_BY, materialStorageLocationInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialStorageLocationInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialStorageLocationInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialStorageLocationInfo);
	}
}
