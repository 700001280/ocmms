package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PlanItem;
import com.ocmms.cmms.model.pm.plan.QPlanItem;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PlanItemRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PlanItemRepositoryImpl extends QueryDslRepositorySupportExt<PlanItem> implements PlanItemRepositoryCustom {

	/**
	 * Default constructor
	 */
	PlanItemRepositoryImpl() {
		super(PlanItem.class);
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
	public static final String PLANNER_GROUP = "plannerGroup";

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
	public static final String ORDER_TYPE = "orderType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PRIORITY = "priority";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PLAN = "plan";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SYSTEM_CONDITION = "systemCondition";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MAINTENANCE_ACTIVITY_TYPE = "maintenanceActivityType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CODE = "code";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TECHNICAL_OBJECT = "technicalObject";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MAIN_WORK_CENTER = "mainWorkCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CATEGORY = "category";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_HEADER = "taskHeader";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlanItem> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPlanItem planItem = QPlanItem.planItem;
		JPQLQuery<PlanItem> query = from(planItem);
		Path<?>[] paths = new Path<?>[] { planItem.code, planItem.plan, planItem.category, planItem.description,
				planItem.technicalObject, planItem.organization, planItem.orderType, planItem.plannerGroup,
				planItem.systemCondition, planItem.priority, planItem.maintenanceActivityType, planItem.mainWorkCenter,
				planItem.taskHeader, planItem.recordStatus, planItem.createdDate, planItem.createdBy,
				planItem.lastModifiedDate, planItem.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, planItem.code).map(PLAN, planItem.plan)
				.map(CATEGORY, planItem.category).map(DESCRIPTION, planItem.description)
				.map(TECHNICAL_OBJECT, planItem.technicalObject).map(ORGANIZATION, planItem.organization)
				.map(ORDER_TYPE, planItem.orderType).map(PLANNER_GROUP, planItem.plannerGroup)
				.map(SYSTEM_CONDITION, planItem.systemCondition).map(PRIORITY, planItem.priority)
				.map(MAINTENANCE_ACTIVITY_TYPE, planItem.maintenanceActivityType)
				.map(MAIN_WORK_CENTER, planItem.mainWorkCenter).map(TASK_HEADER, planItem.taskHeader)
				.map(RECORD_STATUS, planItem.recordStatus).map(CREATED_DATE, planItem.createdDate)
				.map(CREATED_BY, planItem.createdBy).map(LAST_MODIFIED_DATE, planItem.lastModifiedDate)
				.map(LAST_MODIFIED_BY, planItem.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, planItem);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlanItem> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPlanItem planItem = QPlanItem.planItem;
		JPQLQuery<PlanItem> query = from(planItem);
		Path<?>[] paths = new Path<?>[] { planItem.code, planItem.plan, planItem.category, planItem.description,
				planItem.technicalObject, planItem.organization, planItem.orderType, planItem.plannerGroup,
				planItem.systemCondition, planItem.priority, planItem.maintenanceActivityType, planItem.mainWorkCenter,
				planItem.taskHeader, planItem.recordStatus, planItem.createdDate, planItem.createdBy,
				planItem.lastModifiedDate, planItem.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(planItem.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, planItem.code).map(PLAN, planItem.plan)
				.map(CATEGORY, planItem.category).map(DESCRIPTION, planItem.description)
				.map(TECHNICAL_OBJECT, planItem.technicalObject).map(ORGANIZATION, planItem.organization)
				.map(ORDER_TYPE, planItem.orderType).map(PLANNER_GROUP, planItem.plannerGroup)
				.map(SYSTEM_CONDITION, planItem.systemCondition).map(PRIORITY, planItem.priority)
				.map(MAINTENANCE_ACTIVITY_TYPE, planItem.maintenanceActivityType)
				.map(MAIN_WORK_CENTER, planItem.mainWorkCenter).map(TASK_HEADER, planItem.taskHeader)
				.map(RECORD_STATUS, planItem.recordStatus).map(CREATED_DATE, planItem.createdDate)
				.map(CREATED_BY, planItem.createdBy).map(LAST_MODIFIED_DATE, planItem.lastModifiedDate)
				.map(LAST_MODIFIED_BY, planItem.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, planItem);
	}
}
