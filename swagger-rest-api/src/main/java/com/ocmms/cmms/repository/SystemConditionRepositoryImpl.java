package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import com.ocmms.cmms.model.pm.technicalobject.QSystemCondition;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = SystemConditionRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class SystemConditionRepositoryImpl extends QueryDslRepositorySupportExt<SystemCondition>
		implements SystemConditionRepositoryCustom {

	/**
	 * Default constructor
	 */
	SystemConditionRepositoryImpl() {
		super(SystemCondition.class);
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
	public Page<SystemCondition> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QSystemCondition systemCondition = QSystemCondition.systemCondition;
		JPQLQuery<SystemCondition> query = from(systemCondition);
		Path<?>[] paths = new Path<?>[] { systemCondition.code, systemCondition.description,
				systemCondition.recordStatus, systemCondition.createdDate, systemCondition.createdBy,
				systemCondition.lastModifiedDate, systemCondition.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, systemCondition.code)
				.map(DESCRIPTION, systemCondition.description).map(RECORD_STATUS, systemCondition.recordStatus)
				.map(CREATED_DATE, systemCondition.createdDate).map(CREATED_BY, systemCondition.createdBy)
				.map(LAST_MODIFIED_DATE, systemCondition.lastModifiedDate)
				.map(LAST_MODIFIED_BY, systemCondition.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, systemCondition);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<SystemCondition> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QSystemCondition systemCondition = QSystemCondition.systemCondition;
		JPQLQuery<SystemCondition> query = from(systemCondition);
		Path<?>[] paths = new Path<?>[] { systemCondition.code, systemCondition.description,
				systemCondition.recordStatus, systemCondition.createdDate, systemCondition.createdBy,
				systemCondition.lastModifiedDate, systemCondition.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(systemCondition.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, systemCondition.code)
				.map(DESCRIPTION, systemCondition.description).map(RECORD_STATUS, systemCondition.recordStatus)
				.map(CREATED_DATE, systemCondition.createdDate).map(CREATED_BY, systemCondition.createdBy)
				.map(LAST_MODIFIED_DATE, systemCondition.lastModifiedDate)
				.map(LAST_MODIFIED_BY, systemCondition.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, systemCondition);
	}
}
