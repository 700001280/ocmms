package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialAttribute;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.master.QMaterialAttribute;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = MaterialAttributeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialAttributeRepositoryImpl extends QueryDslRepositorySupportExt<MaterialAttribute>
		implements MaterialAttributeRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialAttributeRepositoryImpl() {
		super(MaterialAttribute.class);
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
	public static final String ATTRIBUTE_NAME = "attributeName";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UOM = "uom";

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
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialAttribute> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialAttribute materialAttribute = QMaterialAttribute.materialAttribute;
		JPQLQuery<MaterialAttribute> query = from(materialAttribute);
		Path<?>[] paths = new Path<?>[] { materialAttribute.attributeName, materialAttribute.description,
				materialAttribute.uom, materialAttribute.materialCatalog, materialAttribute.recordStatus,
				materialAttribute.createdDate, materialAttribute.createdBy, materialAttribute.lastModifiedDate,
				materialAttribute.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ATTRIBUTE_NAME, materialAttribute.attributeName)
				.map(DESCRIPTION, materialAttribute.description).map(UOM, materialAttribute.uom)
				.map(MATERIAL_CATALOG, materialAttribute.materialCatalog)
				.map(RECORD_STATUS, materialAttribute.recordStatus).map(CREATED_DATE, materialAttribute.createdDate)
				.map(CREATED_BY, materialAttribute.createdBy)
				.map(LAST_MODIFIED_DATE, materialAttribute.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialAttribute.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialAttribute);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialAttribute> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialAttribute materialAttribute = QMaterialAttribute.materialAttribute;
		JPQLQuery<MaterialAttribute> query = from(materialAttribute);
		Path<?>[] paths = new Path<?>[] { materialAttribute.attributeName, materialAttribute.description,
				materialAttribute.uom, materialAttribute.materialCatalog, materialAttribute.recordStatus,
				materialAttribute.createdDate, materialAttribute.createdBy, materialAttribute.lastModifiedDate,
				materialAttribute.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialAttribute.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ATTRIBUTE_NAME, materialAttribute.attributeName)
				.map(DESCRIPTION, materialAttribute.description).map(UOM, materialAttribute.uom)
				.map(MATERIAL_CATALOG, materialAttribute.materialCatalog)
				.map(RECORD_STATUS, materialAttribute.recordStatus).map(CREATED_DATE, materialAttribute.createdDate)
				.map(CREATED_BY, materialAttribute.createdBy)
				.map(LAST_MODIFIED_DATE, materialAttribute.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialAttribute.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialAttribute);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialAttribute> findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch,
			Pageable pageable) {
		QMaterialAttribute materialAttribute = QMaterialAttribute.materialAttribute;
		JPQLQuery<MaterialAttribute> query = from(materialAttribute);
		Assert.notNull(materialCatalog, "materialCatalog is required");
		query.where(materialAttribute.materialCatalog.eq(materialCatalog));
		Path<?>[] paths = new Path<?>[] { materialAttribute.attributeName, materialAttribute.description,
				materialAttribute.uom, materialAttribute.materialCatalog, materialAttribute.recordStatus,
				materialAttribute.createdDate, materialAttribute.createdBy, materialAttribute.lastModifiedDate,
				materialAttribute.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ATTRIBUTE_NAME, materialAttribute.attributeName)
				.map(DESCRIPTION, materialAttribute.description).map(UOM, materialAttribute.uom)
				.map(MATERIAL_CATALOG, materialAttribute.materialCatalog)
				.map(RECORD_STATUS, materialAttribute.recordStatus).map(CREATED_DATE, materialAttribute.createdDate)
				.map(CREATED_BY, materialAttribute.createdBy)
				.map(LAST_MODIFIED_DATE, materialAttribute.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialAttribute.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialAttribute);
	}
}
