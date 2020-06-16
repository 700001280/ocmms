package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.QOperationalWorkCenter;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = OperationalWorkCenterRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class OperationalWorkCenterRepositoryImpl extends QueryDslRepositorySupportExt<OperationalWorkCenter>
		implements OperationalWorkCenterRepositoryCustom {

	/**
	 * Default constructor
	 */
	OperationalWorkCenterRepositoryImpl() {
		super(OperationalWorkCenter.class);
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
	public static final String RESPONSIBLE = "responsible";

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
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String COST_CENTER = "costCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String VALIDITY_START_DATE = "validityStartDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NAME = "name";

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
	public static final String CAPACITY_UTILIZATION = "capacityUtilization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACTIVITY_TYPE = "activityType";

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
	public static final String CONTROL_KEY = "controlKey";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CAPACITY_UNIT_OF_MEASURE = "capacityUnitOfMeasure";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String VALIDITY_END_DATE = "validityEndDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CAPACITY_END_TIME = "capacityEndTime";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CAPACITY_START_TIME = "capacityStartTime";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NUMBEROF_CAPACITIES = "numberofCapacities";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OperationalWorkCenter> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QOperationalWorkCenter operationalWorkCenter = QOperationalWorkCenter.operationalWorkCenter;
		JPQLQuery<OperationalWorkCenter> query = from(operationalWorkCenter);
		Path<?>[] paths = new Path<?>[] { operationalWorkCenter.organization, operationalWorkCenter.mainWorkCenter,
				operationalWorkCenter.code, operationalWorkCenter.category, operationalWorkCenter.name,
				operationalWorkCenter.responsible, operationalWorkCenter.controlKey, operationalWorkCenter.plannerGroup,
				operationalWorkCenter.capacityUnitOfMeasure, operationalWorkCenter.capacityStartTime,
				operationalWorkCenter.capacityEndTime, operationalWorkCenter.capacityUtilization,
				operationalWorkCenter.numberofCapacities, operationalWorkCenter.validityStartDate,
				operationalWorkCenter.validityEndDate, operationalWorkCenter.costCenter,
				operationalWorkCenter.activityType, operationalWorkCenter.recordStatus,
				operationalWorkCenter.createdDate, operationalWorkCenter.createdBy,
				operationalWorkCenter.lastModifiedDate, operationalWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, operationalWorkCenter.organization)
				.map(MAIN_WORK_CENTER, operationalWorkCenter.mainWorkCenter).map(CODE, operationalWorkCenter.code)
				.map(CATEGORY, operationalWorkCenter.category).map(NAME, operationalWorkCenter.name)
				.map(RESPONSIBLE, operationalWorkCenter.responsible).map(CONTROL_KEY, operationalWorkCenter.controlKey)
				.map(PLANNER_GROUP, operationalWorkCenter.plannerGroup)
				.map(CAPACITY_UNIT_OF_MEASURE, operationalWorkCenter.capacityUnitOfMeasure)
				.map(CAPACITY_START_TIME, operationalWorkCenter.capacityStartTime)
				.map(CAPACITY_END_TIME, operationalWorkCenter.capacityEndTime)
				.map(CAPACITY_UTILIZATION, operationalWorkCenter.capacityUtilization)
				.map(NUMBEROF_CAPACITIES, operationalWorkCenter.numberofCapacities)
				.map(VALIDITY_START_DATE, operationalWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, operationalWorkCenter.validityEndDate)
				.map(COST_CENTER, operationalWorkCenter.costCenter)
				.map(ACTIVITY_TYPE, operationalWorkCenter.activityType)
				.map(RECORD_STATUS, operationalWorkCenter.recordStatus)
				.map(CREATED_DATE, operationalWorkCenter.createdDate).map(CREATED_BY, operationalWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, operationalWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, operationalWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, operationalWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OperationalWorkCenter> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QOperationalWorkCenter operationalWorkCenter = QOperationalWorkCenter.operationalWorkCenter;
		JPQLQuery<OperationalWorkCenter> query = from(operationalWorkCenter);
		Path<?>[] paths = new Path<?>[] { operationalWorkCenter.organization, operationalWorkCenter.mainWorkCenter,
				operationalWorkCenter.code, operationalWorkCenter.category, operationalWorkCenter.name,
				operationalWorkCenter.responsible, operationalWorkCenter.controlKey, operationalWorkCenter.plannerGroup,
				operationalWorkCenter.capacityUnitOfMeasure, operationalWorkCenter.capacityStartTime,
				operationalWorkCenter.capacityEndTime, operationalWorkCenter.capacityUtilization,
				operationalWorkCenter.numberofCapacities, operationalWorkCenter.validityStartDate,
				operationalWorkCenter.validityEndDate, operationalWorkCenter.costCenter,
				operationalWorkCenter.activityType, operationalWorkCenter.recordStatus,
				operationalWorkCenter.createdDate, operationalWorkCenter.createdBy,
				operationalWorkCenter.lastModifiedDate, operationalWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(operationalWorkCenter.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, operationalWorkCenter.organization)
				.map(MAIN_WORK_CENTER, operationalWorkCenter.mainWorkCenter).map(CODE, operationalWorkCenter.code)
				.map(CATEGORY, operationalWorkCenter.category).map(NAME, operationalWorkCenter.name)
				.map(RESPONSIBLE, operationalWorkCenter.responsible).map(CONTROL_KEY, operationalWorkCenter.controlKey)
				.map(PLANNER_GROUP, operationalWorkCenter.plannerGroup)
				.map(CAPACITY_UNIT_OF_MEASURE, operationalWorkCenter.capacityUnitOfMeasure)
				.map(CAPACITY_START_TIME, operationalWorkCenter.capacityStartTime)
				.map(CAPACITY_END_TIME, operationalWorkCenter.capacityEndTime)
				.map(CAPACITY_UTILIZATION, operationalWorkCenter.capacityUtilization)
				.map(NUMBEROF_CAPACITIES, operationalWorkCenter.numberofCapacities)
				.map(VALIDITY_START_DATE, operationalWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, operationalWorkCenter.validityEndDate)
				.map(COST_CENTER, operationalWorkCenter.costCenter)
				.map(ACTIVITY_TYPE, operationalWorkCenter.activityType)
				.map(RECORD_STATUS, operationalWorkCenter.recordStatus)
				.map(CREATED_DATE, operationalWorkCenter.createdDate).map(CREATED_BY, operationalWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, operationalWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, operationalWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, operationalWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OperationalWorkCenter> findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch,
			Pageable pageable) {
		QOperationalWorkCenter operationalWorkCenter = QOperationalWorkCenter.operationalWorkCenter;
		JPQLQuery<OperationalWorkCenter> query = from(operationalWorkCenter);
		Assert.notNull(costCenter, "costCenter is required");
		query.where(operationalWorkCenter.costCenter.eq(costCenter));
		Path<?>[] paths = new Path<?>[] { operationalWorkCenter.organization, operationalWorkCenter.mainWorkCenter,
				operationalWorkCenter.code, operationalWorkCenter.category, operationalWorkCenter.name,
				operationalWorkCenter.responsible, operationalWorkCenter.controlKey, operationalWorkCenter.plannerGroup,
				operationalWorkCenter.capacityUnitOfMeasure, operationalWorkCenter.capacityStartTime,
				operationalWorkCenter.capacityEndTime, operationalWorkCenter.capacityUtilization,
				operationalWorkCenter.numberofCapacities, operationalWorkCenter.validityStartDate,
				operationalWorkCenter.validityEndDate, operationalWorkCenter.costCenter,
				operationalWorkCenter.activityType, operationalWorkCenter.recordStatus,
				operationalWorkCenter.createdDate, operationalWorkCenter.createdBy,
				operationalWorkCenter.lastModifiedDate, operationalWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, operationalWorkCenter.organization)
				.map(MAIN_WORK_CENTER, operationalWorkCenter.mainWorkCenter).map(CODE, operationalWorkCenter.code)
				.map(CATEGORY, operationalWorkCenter.category).map(NAME, operationalWorkCenter.name)
				.map(RESPONSIBLE, operationalWorkCenter.responsible).map(CONTROL_KEY, operationalWorkCenter.controlKey)
				.map(PLANNER_GROUP, operationalWorkCenter.plannerGroup)
				.map(CAPACITY_UNIT_OF_MEASURE, operationalWorkCenter.capacityUnitOfMeasure)
				.map(CAPACITY_START_TIME, operationalWorkCenter.capacityStartTime)
				.map(CAPACITY_END_TIME, operationalWorkCenter.capacityEndTime)
				.map(CAPACITY_UTILIZATION, operationalWorkCenter.capacityUtilization)
				.map(NUMBEROF_CAPACITIES, operationalWorkCenter.numberofCapacities)
				.map(VALIDITY_START_DATE, operationalWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, operationalWorkCenter.validityEndDate)
				.map(COST_CENTER, operationalWorkCenter.costCenter)
				.map(ACTIVITY_TYPE, operationalWorkCenter.activityType)
				.map(RECORD_STATUS, operationalWorkCenter.recordStatus)
				.map(CREATED_DATE, operationalWorkCenter.createdDate).map(CREATED_BY, operationalWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, operationalWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, operationalWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, operationalWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param mainWorkCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OperationalWorkCenter> findByMainWorkCenter(MainWorkCenter mainWorkCenter, GlobalSearch globalSearch,
			Pageable pageable) {
		QOperationalWorkCenter operationalWorkCenter = QOperationalWorkCenter.operationalWorkCenter;
		JPQLQuery<OperationalWorkCenter> query = from(operationalWorkCenter);
		Assert.notNull(mainWorkCenter, "mainWorkCenter is required");
		query.where(operationalWorkCenter.mainWorkCenter.eq(mainWorkCenter));
		Path<?>[] paths = new Path<?>[] { operationalWorkCenter.organization, operationalWorkCenter.mainWorkCenter,
				operationalWorkCenter.code, operationalWorkCenter.category, operationalWorkCenter.name,
				operationalWorkCenter.responsible, operationalWorkCenter.controlKey, operationalWorkCenter.plannerGroup,
				operationalWorkCenter.capacityUnitOfMeasure, operationalWorkCenter.capacityStartTime,
				operationalWorkCenter.capacityEndTime, operationalWorkCenter.capacityUtilization,
				operationalWorkCenter.numberofCapacities, operationalWorkCenter.validityStartDate,
				operationalWorkCenter.validityEndDate, operationalWorkCenter.costCenter,
				operationalWorkCenter.activityType, operationalWorkCenter.recordStatus,
				operationalWorkCenter.createdDate, operationalWorkCenter.createdBy,
				operationalWorkCenter.lastModifiedDate, operationalWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, operationalWorkCenter.organization)
				.map(MAIN_WORK_CENTER, operationalWorkCenter.mainWorkCenter).map(CODE, operationalWorkCenter.code)
				.map(CATEGORY, operationalWorkCenter.category).map(NAME, operationalWorkCenter.name)
				.map(RESPONSIBLE, operationalWorkCenter.responsible).map(CONTROL_KEY, operationalWorkCenter.controlKey)
				.map(PLANNER_GROUP, operationalWorkCenter.plannerGroup)
				.map(CAPACITY_UNIT_OF_MEASURE, operationalWorkCenter.capacityUnitOfMeasure)
				.map(CAPACITY_START_TIME, operationalWorkCenter.capacityStartTime)
				.map(CAPACITY_END_TIME, operationalWorkCenter.capacityEndTime)
				.map(CAPACITY_UTILIZATION, operationalWorkCenter.capacityUtilization)
				.map(NUMBEROF_CAPACITIES, operationalWorkCenter.numberofCapacities)
				.map(VALIDITY_START_DATE, operationalWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, operationalWorkCenter.validityEndDate)
				.map(COST_CENTER, operationalWorkCenter.costCenter)
				.map(ACTIVITY_TYPE, operationalWorkCenter.activityType)
				.map(RECORD_STATUS, operationalWorkCenter.recordStatus)
				.map(CREATED_DATE, operationalWorkCenter.createdDate).map(CREATED_BY, operationalWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, operationalWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, operationalWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, operationalWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OperationalWorkCenter> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable) {
		QOperationalWorkCenter operationalWorkCenter = QOperationalWorkCenter.operationalWorkCenter;
		JPQLQuery<OperationalWorkCenter> query = from(operationalWorkCenter);
		Assert.notNull(organization, "organization is required");
		query.where(operationalWorkCenter.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { operationalWorkCenter.organization, operationalWorkCenter.mainWorkCenter,
				operationalWorkCenter.code, operationalWorkCenter.category, operationalWorkCenter.name,
				operationalWorkCenter.responsible, operationalWorkCenter.controlKey, operationalWorkCenter.plannerGroup,
				operationalWorkCenter.capacityUnitOfMeasure, operationalWorkCenter.capacityStartTime,
				operationalWorkCenter.capacityEndTime, operationalWorkCenter.capacityUtilization,
				operationalWorkCenter.numberofCapacities, operationalWorkCenter.validityStartDate,
				operationalWorkCenter.validityEndDate, operationalWorkCenter.costCenter,
				operationalWorkCenter.activityType, operationalWorkCenter.recordStatus,
				operationalWorkCenter.createdDate, operationalWorkCenter.createdBy,
				operationalWorkCenter.lastModifiedDate, operationalWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, operationalWorkCenter.organization)
				.map(MAIN_WORK_CENTER, operationalWorkCenter.mainWorkCenter).map(CODE, operationalWorkCenter.code)
				.map(CATEGORY, operationalWorkCenter.category).map(NAME, operationalWorkCenter.name)
				.map(RESPONSIBLE, operationalWorkCenter.responsible).map(CONTROL_KEY, operationalWorkCenter.controlKey)
				.map(PLANNER_GROUP, operationalWorkCenter.plannerGroup)
				.map(CAPACITY_UNIT_OF_MEASURE, operationalWorkCenter.capacityUnitOfMeasure)
				.map(CAPACITY_START_TIME, operationalWorkCenter.capacityStartTime)
				.map(CAPACITY_END_TIME, operationalWorkCenter.capacityEndTime)
				.map(CAPACITY_UTILIZATION, operationalWorkCenter.capacityUtilization)
				.map(NUMBEROF_CAPACITIES, operationalWorkCenter.numberofCapacities)
				.map(VALIDITY_START_DATE, operationalWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, operationalWorkCenter.validityEndDate)
				.map(COST_CENTER, operationalWorkCenter.costCenter)
				.map(ACTIVITY_TYPE, operationalWorkCenter.activityType)
				.map(RECORD_STATUS, operationalWorkCenter.recordStatus)
				.map(CREATED_DATE, operationalWorkCenter.createdDate).map(CREATED_BY, operationalWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, operationalWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, operationalWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, operationalWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plannerGroup
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OperationalWorkCenter> findByPlannerGroup(PlannerGroup plannerGroup, GlobalSearch globalSearch,
			Pageable pageable) {
		QOperationalWorkCenter operationalWorkCenter = QOperationalWorkCenter.operationalWorkCenter;
		JPQLQuery<OperationalWorkCenter> query = from(operationalWorkCenter);
		Assert.notNull(plannerGroup, "plannerGroup is required");
		query.where(operationalWorkCenter.plannerGroup.eq(plannerGroup));
		Path<?>[] paths = new Path<?>[] { operationalWorkCenter.organization, operationalWorkCenter.mainWorkCenter,
				operationalWorkCenter.code, operationalWorkCenter.category, operationalWorkCenter.name,
				operationalWorkCenter.responsible, operationalWorkCenter.controlKey, operationalWorkCenter.plannerGroup,
				operationalWorkCenter.capacityUnitOfMeasure, operationalWorkCenter.capacityStartTime,
				operationalWorkCenter.capacityEndTime, operationalWorkCenter.capacityUtilization,
				operationalWorkCenter.numberofCapacities, operationalWorkCenter.validityStartDate,
				operationalWorkCenter.validityEndDate, operationalWorkCenter.costCenter,
				operationalWorkCenter.activityType, operationalWorkCenter.recordStatus,
				operationalWorkCenter.createdDate, operationalWorkCenter.createdBy,
				operationalWorkCenter.lastModifiedDate, operationalWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, operationalWorkCenter.organization)
				.map(MAIN_WORK_CENTER, operationalWorkCenter.mainWorkCenter).map(CODE, operationalWorkCenter.code)
				.map(CATEGORY, operationalWorkCenter.category).map(NAME, operationalWorkCenter.name)
				.map(RESPONSIBLE, operationalWorkCenter.responsible).map(CONTROL_KEY, operationalWorkCenter.controlKey)
				.map(PLANNER_GROUP, operationalWorkCenter.plannerGroup)
				.map(CAPACITY_UNIT_OF_MEASURE, operationalWorkCenter.capacityUnitOfMeasure)
				.map(CAPACITY_START_TIME, operationalWorkCenter.capacityStartTime)
				.map(CAPACITY_END_TIME, operationalWorkCenter.capacityEndTime)
				.map(CAPACITY_UTILIZATION, operationalWorkCenter.capacityUtilization)
				.map(NUMBEROF_CAPACITIES, operationalWorkCenter.numberofCapacities)
				.map(VALIDITY_START_DATE, operationalWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, operationalWorkCenter.validityEndDate)
				.map(COST_CENTER, operationalWorkCenter.costCenter)
				.map(ACTIVITY_TYPE, operationalWorkCenter.activityType)
				.map(RECORD_STATUS, operationalWorkCenter.recordStatus)
				.map(CREATED_DATE, operationalWorkCenter.createdDate).map(CREATED_BY, operationalWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, operationalWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, operationalWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, operationalWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param responsible
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OperationalWorkCenter> findByResponsible(WorkCenterResponsible responsible, GlobalSearch globalSearch,
			Pageable pageable) {
		QOperationalWorkCenter operationalWorkCenter = QOperationalWorkCenter.operationalWorkCenter;
		JPQLQuery<OperationalWorkCenter> query = from(operationalWorkCenter);
		Assert.notNull(responsible, "responsible is required");
		query.where(operationalWorkCenter.responsible.eq(responsible));
		Path<?>[] paths = new Path<?>[] { operationalWorkCenter.organization, operationalWorkCenter.mainWorkCenter,
				operationalWorkCenter.code, operationalWorkCenter.category, operationalWorkCenter.name,
				operationalWorkCenter.responsible, operationalWorkCenter.controlKey, operationalWorkCenter.plannerGroup,
				operationalWorkCenter.capacityUnitOfMeasure, operationalWorkCenter.capacityStartTime,
				operationalWorkCenter.capacityEndTime, operationalWorkCenter.capacityUtilization,
				operationalWorkCenter.numberofCapacities, operationalWorkCenter.validityStartDate,
				operationalWorkCenter.validityEndDate, operationalWorkCenter.costCenter,
				operationalWorkCenter.activityType, operationalWorkCenter.recordStatus,
				operationalWorkCenter.createdDate, operationalWorkCenter.createdBy,
				operationalWorkCenter.lastModifiedDate, operationalWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, operationalWorkCenter.organization)
				.map(MAIN_WORK_CENTER, operationalWorkCenter.mainWorkCenter).map(CODE, operationalWorkCenter.code)
				.map(CATEGORY, operationalWorkCenter.category).map(NAME, operationalWorkCenter.name)
				.map(RESPONSIBLE, operationalWorkCenter.responsible).map(CONTROL_KEY, operationalWorkCenter.controlKey)
				.map(PLANNER_GROUP, operationalWorkCenter.plannerGroup)
				.map(CAPACITY_UNIT_OF_MEASURE, operationalWorkCenter.capacityUnitOfMeasure)
				.map(CAPACITY_START_TIME, operationalWorkCenter.capacityStartTime)
				.map(CAPACITY_END_TIME, operationalWorkCenter.capacityEndTime)
				.map(CAPACITY_UTILIZATION, operationalWorkCenter.capacityUtilization)
				.map(NUMBEROF_CAPACITIES, operationalWorkCenter.numberofCapacities)
				.map(VALIDITY_START_DATE, operationalWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, operationalWorkCenter.validityEndDate)
				.map(COST_CENTER, operationalWorkCenter.costCenter)
				.map(ACTIVITY_TYPE, operationalWorkCenter.activityType)
				.map(RECORD_STATUS, operationalWorkCenter.recordStatus)
				.map(CREATED_DATE, operationalWorkCenter.createdDate).map(CREATED_BY, operationalWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, operationalWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, operationalWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, operationalWorkCenter);
	}
}
