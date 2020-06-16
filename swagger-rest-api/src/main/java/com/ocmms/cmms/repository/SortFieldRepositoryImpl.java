package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.SortField;
import com.ocmms.cmms.model.pm.configuration.QSortField;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = SortFieldRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class SortFieldRepositoryImpl extends QueryDslRepositorySupportExt<SortField>
		implements SortFieldRepositoryCustom {

	/**
	 * Default constructor
	 */
	SortFieldRepositoryImpl() {
		super(SortField.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

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
	public Page<SortField> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QSortField sortField = QSortField.sortField;
		JPQLQuery<SortField> query = from(sortField);
		Path<?>[] paths = new Path<?>[] { sortField.code, sortField.description, sortField.organization,
				sortField.recordStatus, sortField.createdDate, sortField.createdBy, sortField.lastModifiedDate,
				sortField.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, sortField.code)
				.map(DESCRIPTION, sortField.description).map(ORGANIZATION, sortField.organization)
				.map(RECORD_STATUS, sortField.recordStatus).map(CREATED_DATE, sortField.createdDate)
				.map(CREATED_BY, sortField.createdBy).map(LAST_MODIFIED_DATE, sortField.lastModifiedDate)
				.map(LAST_MODIFIED_BY, sortField.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, sortField);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<SortField> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QSortField sortField = QSortField.sortField;
		JPQLQuery<SortField> query = from(sortField);
		Path<?>[] paths = new Path<?>[] { sortField.code, sortField.description, sortField.organization,
				sortField.recordStatus, sortField.createdDate, sortField.createdBy, sortField.lastModifiedDate,
				sortField.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(sortField.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, sortField.code)
				.map(DESCRIPTION, sortField.description).map(ORGANIZATION, sortField.organization)
				.map(RECORD_STATUS, sortField.recordStatus).map(CREATED_DATE, sortField.createdDate)
				.map(CREATED_BY, sortField.createdBy).map(LAST_MODIFIED_DATE, sortField.lastModifiedDate)
				.map(LAST_MODIFIED_BY, sortField.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, sortField);
	}
}
