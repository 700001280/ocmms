package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialType;
import com.ocmms.cmms.model.mm.master.QMaterialType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialTypeRepositoryImpl extends QueryDslRepositorySupportExt<MaterialType>
		implements MaterialTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialTypeRepositoryImpl() {
		super(MaterialType.class);
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
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TYPE = "type";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialType materialType = QMaterialType.materialType;
		JPQLQuery<MaterialType> query = from(materialType);
		Path<?>[] paths = new Path<?>[] { materialType.description, materialType.type, materialType.recordStatus,
				materialType.createdDate, materialType.createdBy, materialType.lastModifiedDate,
				materialType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, materialType.description)
				.map(TYPE, materialType.type).map(RECORD_STATUS, materialType.recordStatus)
				.map(CREATED_DATE, materialType.createdDate).map(CREATED_BY, materialType.createdBy)
				.map(LAST_MODIFIED_DATE, materialType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialType materialType = QMaterialType.materialType;
		JPQLQuery<MaterialType> query = from(materialType);
		Path<?>[] paths = new Path<?>[] { materialType.description, materialType.type, materialType.recordStatus,
				materialType.createdDate, materialType.createdBy, materialType.lastModifiedDate,
				materialType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, materialType.description)
				.map(TYPE, materialType.type).map(RECORD_STATUS, materialType.recordStatus)
				.map(CREATED_DATE, materialType.createdDate).map(CREATED_BY, materialType.createdBy)
				.map(LAST_MODIFIED_DATE, materialType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialType);
	}
}
