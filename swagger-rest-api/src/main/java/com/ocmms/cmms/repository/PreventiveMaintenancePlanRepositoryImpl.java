package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;
import com.ocmms.cmms.model.pm.plan.QPreventiveMaintenancePlan;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PreventiveMaintenancePlanRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PreventiveMaintenancePlanRepositoryImpl extends QueryDslRepositorySupportExt<PreventiveMaintenancePlan>
		implements PreventiveMaintenancePlanRepositoryCustom {

	/**
	 * Default constructor
	 */
	PreventiveMaintenancePlanRepositoryImpl() {
		super(PreventiveMaintenancePlan.class);
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
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SINGLE_CYCLE = "singleCycle";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CALL_HORIZON = "callHorizon";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String START_DATE = "startDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SORT_FIELD = "sortField";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CALL_HORIZON_UOM = "callHorizonUom";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CYCLE_UNIT = "cycleUnit";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CODE = "code";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SCHEDULING_PERIOD_UOM = "schedulingPeriodUom";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CATEGORY = "category";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String AUTHORIZATION_GROUP = "authorizationGroup";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SCHEDULING_PERIOD = "schedulingPeriod";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String START_COUNTER = "startCounter";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenancePlan> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPreventiveMaintenancePlan preventiveMaintenancePlan = QPreventiveMaintenancePlan.preventiveMaintenancePlan;
		JPQLQuery<PreventiveMaintenancePlan> query = from(preventiveMaintenancePlan);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenancePlan.code, preventiveMaintenancePlan.category,
				preventiveMaintenancePlan.singleCycle, preventiveMaintenancePlan.cycleUnit,
				preventiveMaintenancePlan.description, preventiveMaintenancePlan.sortField,
				preventiveMaintenancePlan.authorizationGroup, preventiveMaintenancePlan.schedulingPeriod,
				preventiveMaintenancePlan.schedulingPeriodUom, preventiveMaintenancePlan.callHorizon,
				preventiveMaintenancePlan.callHorizonUom, preventiveMaintenancePlan.startDate,
				preventiveMaintenancePlan.startCounter, preventiveMaintenancePlan.recordStatus,
				preventiveMaintenancePlan.createdDate, preventiveMaintenancePlan.createdBy,
				preventiveMaintenancePlan.lastModifiedDate, preventiveMaintenancePlan.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, preventiveMaintenancePlan.code)
				.map(CATEGORY, preventiveMaintenancePlan.category)
				.map(SINGLE_CYCLE, preventiveMaintenancePlan.singleCycle)
				.map(CYCLE_UNIT, preventiveMaintenancePlan.cycleUnit)
				.map(DESCRIPTION, preventiveMaintenancePlan.description)
				.map(SORT_FIELD, preventiveMaintenancePlan.sortField)
				.map(AUTHORIZATION_GROUP, preventiveMaintenancePlan.authorizationGroup)
				.map(SCHEDULING_PERIOD, preventiveMaintenancePlan.schedulingPeriod)
				.map(SCHEDULING_PERIOD_UOM, preventiveMaintenancePlan.schedulingPeriodUom)
				.map(CALL_HORIZON, preventiveMaintenancePlan.callHorizon)
				.map(CALL_HORIZON_UOM, preventiveMaintenancePlan.callHorizonUom)
				.map(START_DATE, preventiveMaintenancePlan.startDate)
				.map(START_COUNTER, preventiveMaintenancePlan.startCounter)
				.map(RECORD_STATUS, preventiveMaintenancePlan.recordStatus)
				.map(CREATED_DATE, preventiveMaintenancePlan.createdDate)
				.map(CREATED_BY, preventiveMaintenancePlan.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenancePlan.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenancePlan.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenancePlan);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenancePlan> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPreventiveMaintenancePlan preventiveMaintenancePlan = QPreventiveMaintenancePlan.preventiveMaintenancePlan;
		JPQLQuery<PreventiveMaintenancePlan> query = from(preventiveMaintenancePlan);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenancePlan.code, preventiveMaintenancePlan.category,
				preventiveMaintenancePlan.singleCycle, preventiveMaintenancePlan.cycleUnit,
				preventiveMaintenancePlan.description, preventiveMaintenancePlan.sortField,
				preventiveMaintenancePlan.authorizationGroup, preventiveMaintenancePlan.schedulingPeriod,
				preventiveMaintenancePlan.schedulingPeriodUom, preventiveMaintenancePlan.callHorizon,
				preventiveMaintenancePlan.callHorizonUom, preventiveMaintenancePlan.startDate,
				preventiveMaintenancePlan.startCounter, preventiveMaintenancePlan.recordStatus,
				preventiveMaintenancePlan.createdDate, preventiveMaintenancePlan.createdBy,
				preventiveMaintenancePlan.lastModifiedDate, preventiveMaintenancePlan.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(preventiveMaintenancePlan.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, preventiveMaintenancePlan.code)
				.map(CATEGORY, preventiveMaintenancePlan.category)
				.map(SINGLE_CYCLE, preventiveMaintenancePlan.singleCycle)
				.map(CYCLE_UNIT, preventiveMaintenancePlan.cycleUnit)
				.map(DESCRIPTION, preventiveMaintenancePlan.description)
				.map(SORT_FIELD, preventiveMaintenancePlan.sortField)
				.map(AUTHORIZATION_GROUP, preventiveMaintenancePlan.authorizationGroup)
				.map(SCHEDULING_PERIOD, preventiveMaintenancePlan.schedulingPeriod)
				.map(SCHEDULING_PERIOD_UOM, preventiveMaintenancePlan.schedulingPeriodUom)
				.map(CALL_HORIZON, preventiveMaintenancePlan.callHorizon)
				.map(CALL_HORIZON_UOM, preventiveMaintenancePlan.callHorizonUom)
				.map(START_DATE, preventiveMaintenancePlan.startDate)
				.map(START_COUNTER, preventiveMaintenancePlan.startCounter)
				.map(RECORD_STATUS, preventiveMaintenancePlan.recordStatus)
				.map(CREATED_DATE, preventiveMaintenancePlan.createdDate)
				.map(CREATED_BY, preventiveMaintenancePlan.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenancePlan.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenancePlan.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenancePlan);
	}
}
