package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.CatalogType;
import com.ocmms.cmms.model.mm.procurement.QCatalogType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CatalogTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class CatalogTypeRepositoryImpl extends QueryDslRepositorySupportExt<CatalogType>
		implements CatalogTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	CatalogTypeRepositoryImpl() {
		super(CatalogType.class);
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
	public static final String CODE = "code";

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
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<CatalogType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QCatalogType catalogType = QCatalogType.catalogType;
		JPQLQuery<CatalogType> query = from(catalogType);
		Path<?>[] paths = new Path<?>[] { catalogType.description, catalogType.code, catalogType.recordStatus,
				catalogType.createdDate, catalogType.createdBy, catalogType.lastModifiedDate,
				catalogType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, catalogType.description)
				.map(CODE, catalogType.code).map(RECORD_STATUS, catalogType.recordStatus)
				.map(CREATED_DATE, catalogType.createdDate).map(CREATED_BY, catalogType.createdBy)
				.map(LAST_MODIFIED_DATE, catalogType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, catalogType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, catalogType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<CatalogType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QCatalogType catalogType = QCatalogType.catalogType;
		JPQLQuery<CatalogType> query = from(catalogType);
		Path<?>[] paths = new Path<?>[] { catalogType.description, catalogType.code, catalogType.recordStatus,
				catalogType.createdDate, catalogType.createdBy, catalogType.lastModifiedDate,
				catalogType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(catalogType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, catalogType.description)
				.map(CODE, catalogType.code).map(RECORD_STATUS, catalogType.recordStatus)
				.map(CREATED_DATE, catalogType.createdDate).map(CREATED_BY, catalogType.createdBy)
				.map(LAST_MODIFIED_DATE, catalogType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, catalogType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, catalogType);
	}
}
