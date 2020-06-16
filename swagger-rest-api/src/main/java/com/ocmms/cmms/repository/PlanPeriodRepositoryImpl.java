package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PlanPeriod;
import com.ocmms.cmms.model.pm.plan.QPlanPeriod;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PlanPeriodRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PlanPeriodRepositoryImpl extends QueryDslRepositorySupportExt<PlanPeriod>
		implements PlanPeriodRepositoryCustom {

	/**
	 * Default constructor
	 */
	PlanPeriodRepositoryImpl() {
		super(PlanPeriod.class);
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
	public static final String PERIOD = "period";

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
	public Page<PlanPeriod> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPlanPeriod planPeriod = QPlanPeriod.planPeriod;
		JPQLQuery<PlanPeriod> query = from(planPeriod);
		Path<?>[] paths = new Path<?>[] { planPeriod.period, planPeriod.description, planPeriod.recordStatus,
				planPeriod.createdDate, planPeriod.createdBy, planPeriod.lastModifiedDate, planPeriod.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PERIOD, planPeriod.period)
				.map(DESCRIPTION, planPeriod.description).map(RECORD_STATUS, planPeriod.recordStatus)
				.map(CREATED_DATE, planPeriod.createdDate).map(CREATED_BY, planPeriod.createdBy)
				.map(LAST_MODIFIED_DATE, planPeriod.lastModifiedDate).map(LAST_MODIFIED_BY, planPeriod.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, planPeriod);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlanPeriod> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPlanPeriod planPeriod = QPlanPeriod.planPeriod;
		JPQLQuery<PlanPeriod> query = from(planPeriod);
		Path<?>[] paths = new Path<?>[] { planPeriod.period, planPeriod.description, planPeriod.recordStatus,
				planPeriod.createdDate, planPeriod.createdBy, planPeriod.lastModifiedDate, planPeriod.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(planPeriod.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(PERIOD, planPeriod.period)
				.map(DESCRIPTION, planPeriod.description).map(RECORD_STATUS, planPeriod.recordStatus)
				.map(CREATED_DATE, planPeriod.createdDate).map(CREATED_BY, planPeriod.createdBy)
				.map(LAST_MODIFIED_DATE, planPeriod.lastModifiedDate).map(LAST_MODIFIED_BY, planPeriod.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, planPeriod);
	}
}
