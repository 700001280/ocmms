package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MROCatalog;
import com.ocmms.cmms.model.mm.master.QMROCatalog;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MROCatalogRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MROCatalogRepositoryImpl extends QueryDslRepositorySupportExt<MROCatalog>
		implements MROCatalogRepositoryCustom {

	/**
	 * Default constructor
	 */
	MROCatalogRepositoryImpl() {
		super(MROCatalog.class);
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
	public static final String MATERIAL_NAME = "materialName";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MROCatalog> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMROCatalog mROCatalog = QMROCatalog.mROCatalog;
		JPQLQuery<MROCatalog> query = from(mROCatalog);
		Path<?>[] paths = new Path<?>[] { mROCatalog.code, mROCatalog.materialName, mROCatalog.materialGroup,
				mROCatalog.recordStatus, mROCatalog.createdDate, mROCatalog.createdBy, mROCatalog.lastModifiedDate,
				mROCatalog.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, mROCatalog.code)
				.map(MATERIAL_NAME, mROCatalog.materialName).map(MATERIAL_GROUP, mROCatalog.materialGroup)
				.map(RECORD_STATUS, mROCatalog.recordStatus).map(CREATED_DATE, mROCatalog.createdDate)
				.map(CREATED_BY, mROCatalog.createdBy).map(LAST_MODIFIED_DATE, mROCatalog.lastModifiedDate)
				.map(LAST_MODIFIED_BY, mROCatalog.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, mROCatalog);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MROCatalog> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMROCatalog mROCatalog = QMROCatalog.mROCatalog;
		JPQLQuery<MROCatalog> query = from(mROCatalog);
		Path<?>[] paths = new Path<?>[] { mROCatalog.code, mROCatalog.materialName, mROCatalog.materialGroup,
				mROCatalog.recordStatus, mROCatalog.createdDate, mROCatalog.createdBy, mROCatalog.lastModifiedDate,
				mROCatalog.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(mROCatalog.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, mROCatalog.code)
				.map(MATERIAL_NAME, mROCatalog.materialName).map(MATERIAL_GROUP, mROCatalog.materialGroup)
				.map(RECORD_STATUS, mROCatalog.recordStatus).map(CREATED_DATE, mROCatalog.createdDate)
				.map(CREATED_BY, mROCatalog.createdBy).map(LAST_MODIFIED_DATE, mROCatalog.lastModifiedDate)
				.map(LAST_MODIFIED_BY, mROCatalog.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, mROCatalog);
	}
}
