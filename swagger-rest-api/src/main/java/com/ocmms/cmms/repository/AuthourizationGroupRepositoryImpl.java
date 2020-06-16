package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.AuthourizationGroup;
import com.ocmms.cmms.model.pm.configuration.QAuthourizationGroup;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AuthourizationGroupRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class AuthourizationGroupRepositoryImpl extends QueryDslRepositorySupportExt<AuthourizationGroup>
		implements AuthourizationGroupRepositoryCustom {

	/**
	 * Default constructor
	 */
	AuthourizationGroupRepositoryImpl() {
		super(AuthourizationGroup.class);
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
	public Page<AuthourizationGroup> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QAuthourizationGroup authourizationGroup = QAuthourizationGroup.authourizationGroup;
		JPQLQuery<AuthourizationGroup> query = from(authourizationGroup);
		Path<?>[] paths = new Path<?>[] { authourizationGroup.organization, authourizationGroup.code,
				authourizationGroup.description, authourizationGroup.recordStatus, authourizationGroup.createdDate,
				authourizationGroup.createdBy, authourizationGroup.lastModifiedDate,
				authourizationGroup.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, authourizationGroup.organization)
				.map(CODE, authourizationGroup.code).map(DESCRIPTION, authourizationGroup.description)
				.map(RECORD_STATUS, authourizationGroup.recordStatus).map(CREATED_DATE, authourizationGroup.createdDate)
				.map(CREATED_BY, authourizationGroup.createdBy)
				.map(LAST_MODIFIED_DATE, authourizationGroup.lastModifiedDate)
				.map(LAST_MODIFIED_BY, authourizationGroup.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, authourizationGroup);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AuthourizationGroup> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QAuthourizationGroup authourizationGroup = QAuthourizationGroup.authourizationGroup;
		JPQLQuery<AuthourizationGroup> query = from(authourizationGroup);
		Path<?>[] paths = new Path<?>[] { authourizationGroup.organization, authourizationGroup.code,
				authourizationGroup.description, authourizationGroup.recordStatus, authourizationGroup.createdDate,
				authourizationGroup.createdBy, authourizationGroup.lastModifiedDate,
				authourizationGroup.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(authourizationGroup.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, authourizationGroup.organization)
				.map(CODE, authourizationGroup.code).map(DESCRIPTION, authourizationGroup.description)
				.map(RECORD_STATUS, authourizationGroup.recordStatus).map(CREATED_DATE, authourizationGroup.createdDate)
				.map(CREATED_BY, authourizationGroup.createdBy)
				.map(LAST_MODIFIED_DATE, authourizationGroup.lastModifiedDate)
				.map(LAST_MODIFIED_BY, authourizationGroup.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, authourizationGroup);
	}
}
