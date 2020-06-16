package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PlanStrategy;
import com.ocmms.cmms.model.pm.plan.QPlanStrategy;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PlanStrategyRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PlanStrategyRepositoryImpl extends QueryDslRepositorySupportExt<PlanStrategy>
		implements PlanStrategyRepositoryCustom {

	/**
	 * Default constructor
	 */
	PlanStrategyRepositoryImpl() {
		super(PlanStrategy.class);
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
	public Page<PlanStrategy> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPlanStrategy planStrategy = QPlanStrategy.planStrategy;
		JPQLQuery<PlanStrategy> query = from(planStrategy);
		Path<?>[] paths = new Path<?>[] { planStrategy.period, planStrategy.description, planStrategy.recordStatus,
				planStrategy.createdDate, planStrategy.createdBy, planStrategy.lastModifiedDate,
				planStrategy.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PERIOD, planStrategy.period)
				.map(DESCRIPTION, planStrategy.description).map(RECORD_STATUS, planStrategy.recordStatus)
				.map(CREATED_DATE, planStrategy.createdDate).map(CREATED_BY, planStrategy.createdBy)
				.map(LAST_MODIFIED_DATE, planStrategy.lastModifiedDate)
				.map(LAST_MODIFIED_BY, planStrategy.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, planStrategy);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlanStrategy> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPlanStrategy planStrategy = QPlanStrategy.planStrategy;
		JPQLQuery<PlanStrategy> query = from(planStrategy);
		Path<?>[] paths = new Path<?>[] { planStrategy.period, planStrategy.description, planStrategy.recordStatus,
				planStrategy.createdDate, planStrategy.createdBy, planStrategy.lastModifiedDate,
				planStrategy.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(planStrategy.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(PERIOD, planStrategy.period)
				.map(DESCRIPTION, planStrategy.description).map(RECORD_STATUS, planStrategy.recordStatus)
				.map(CREATED_DATE, planStrategy.createdDate).map(CREATED_BY, planStrategy.createdBy)
				.map(LAST_MODIFIED_DATE, planStrategy.lastModifiedDate)
				.map(LAST_MODIFIED_BY, planStrategy.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, planStrategy);
	}
}
