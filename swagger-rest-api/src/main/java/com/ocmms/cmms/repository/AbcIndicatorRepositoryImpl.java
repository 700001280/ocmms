package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.AbcIndicator;
import com.ocmms.cmms.model.pm.configuration.QAbcIndicator;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AbcIndicatorRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class AbcIndicatorRepositoryImpl extends QueryDslRepositorySupportExt<AbcIndicator>
		implements AbcIndicatorRepositoryCustom {

	/**
	 * Default constructor
	 */
	AbcIndicatorRepositoryImpl() {
		super(AbcIndicator.class);
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
	public static final String STATUS = "status";

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
	public static final String INDICATOR = "indicator";

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
	public static final String RISK_LEVEL = "riskLevel";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AbcIndicator> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QAbcIndicator abcIndicator = QAbcIndicator.abcIndicator;
		JPQLQuery<AbcIndicator> query = from(abcIndicator);
		Path<?>[] paths = new Path<?>[] { abcIndicator.riskLevel, abcIndicator.description, abcIndicator.status,
				abcIndicator.indicator, abcIndicator.recordStatus, abcIndicator.createdDate, abcIndicator.createdBy,
				abcIndicator.lastModifiedDate, abcIndicator.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(RISK_LEVEL, abcIndicator.riskLevel)
				.map(DESCRIPTION, abcIndicator.description).map(STATUS, abcIndicator.status)
				.map(INDICATOR, abcIndicator.indicator).map(RECORD_STATUS, abcIndicator.recordStatus)
				.map(CREATED_DATE, abcIndicator.createdDate).map(CREATED_BY, abcIndicator.createdBy)
				.map(LAST_MODIFIED_DATE, abcIndicator.lastModifiedDate)
				.map(LAST_MODIFIED_BY, abcIndicator.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, abcIndicator);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AbcIndicator> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QAbcIndicator abcIndicator = QAbcIndicator.abcIndicator;
		JPQLQuery<AbcIndicator> query = from(abcIndicator);
		Path<?>[] paths = new Path<?>[] { abcIndicator.riskLevel, abcIndicator.description, abcIndicator.status,
				abcIndicator.indicator, abcIndicator.recordStatus, abcIndicator.createdDate, abcIndicator.createdBy,
				abcIndicator.lastModifiedDate, abcIndicator.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(abcIndicator.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(RISK_LEVEL, abcIndicator.riskLevel)
				.map(DESCRIPTION, abcIndicator.description).map(STATUS, abcIndicator.status)
				.map(INDICATOR, abcIndicator.indicator).map(RECORD_STATUS, abcIndicator.recordStatus)
				.map(CREATED_DATE, abcIndicator.createdDate).map(CREATED_BY, abcIndicator.createdBy)
				.map(LAST_MODIFIED_DATE, abcIndicator.lastModifiedDate)
				.map(LAST_MODIFIED_BY, abcIndicator.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, abcIndicator);
	}
}
