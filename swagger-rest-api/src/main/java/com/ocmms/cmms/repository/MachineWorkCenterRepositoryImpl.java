package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.MachineWorkCenter;
import com.ocmms.cmms.model.pm.configuration.QMachineWorkCenter;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MachineWorkCenterRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MachineWorkCenterRepositoryImpl extends QueryDslRepositorySupportExt<MachineWorkCenter>
		implements MachineWorkCenterRepositoryCustom {

	/**
	 * Default constructor
	 */
	MachineWorkCenterRepositoryImpl() {
		super(MachineWorkCenter.class);
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
	public static final String OPERATIONAL_WORK_CENTER = "operationalWorkCenter";

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
	public static final String DESCRIPTION = "description";

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
	public Page<MachineWorkCenter> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMachineWorkCenter machineWorkCenter = QMachineWorkCenter.machineWorkCenter;
		JPQLQuery<MachineWorkCenter> query = from(machineWorkCenter);
		Path<?>[] paths = new Path<?>[] { machineWorkCenter.organization, machineWorkCenter.operationalWorkCenter,
				machineWorkCenter.code, machineWorkCenter.category, machineWorkCenter.description,
				machineWorkCenter.responsible, machineWorkCenter.controlKey, machineWorkCenter.plannerGroup,
				machineWorkCenter.capacityUnitOfMeasure, machineWorkCenter.capacityStartTime,
				machineWorkCenter.capacityEndTime, machineWorkCenter.capacityUtilization,
				machineWorkCenter.numberofCapacities, machineWorkCenter.validityStartDate,
				machineWorkCenter.validityEndDate, machineWorkCenter.costCenter, machineWorkCenter.recordStatus,
				machineWorkCenter.createdDate, machineWorkCenter.createdBy, machineWorkCenter.lastModifiedDate,
				machineWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, machineWorkCenter.organization)
				.map(OPERATIONAL_WORK_CENTER, machineWorkCenter.operationalWorkCenter).map(CODE, machineWorkCenter.code)
				.map(CATEGORY, machineWorkCenter.category).map(DESCRIPTION, machineWorkCenter.description)
				.map(RESPONSIBLE, machineWorkCenter.responsible).map(CONTROL_KEY, machineWorkCenter.controlKey)
				.map(PLANNER_GROUP, machineWorkCenter.plannerGroup)
				.map(CAPACITY_UNIT_OF_MEASURE, machineWorkCenter.capacityUnitOfMeasure)
				.map(CAPACITY_START_TIME, machineWorkCenter.capacityStartTime)
				.map(CAPACITY_END_TIME, machineWorkCenter.capacityEndTime)
				.map(CAPACITY_UTILIZATION, machineWorkCenter.capacityUtilization)
				.map(NUMBEROF_CAPACITIES, machineWorkCenter.numberofCapacities)
				.map(VALIDITY_START_DATE, machineWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, machineWorkCenter.validityEndDate)
				.map(COST_CENTER, machineWorkCenter.costCenter).map(RECORD_STATUS, machineWorkCenter.recordStatus)
				.map(CREATED_DATE, machineWorkCenter.createdDate).map(CREATED_BY, machineWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, machineWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, machineWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, machineWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MachineWorkCenter> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMachineWorkCenter machineWorkCenter = QMachineWorkCenter.machineWorkCenter;
		JPQLQuery<MachineWorkCenter> query = from(machineWorkCenter);
		Path<?>[] paths = new Path<?>[] { machineWorkCenter.organization, machineWorkCenter.operationalWorkCenter,
				machineWorkCenter.code, machineWorkCenter.category, machineWorkCenter.description,
				machineWorkCenter.responsible, machineWorkCenter.controlKey, machineWorkCenter.plannerGroup,
				machineWorkCenter.capacityUnitOfMeasure, machineWorkCenter.capacityStartTime,
				machineWorkCenter.capacityEndTime, machineWorkCenter.capacityUtilization,
				machineWorkCenter.numberofCapacities, machineWorkCenter.validityStartDate,
				machineWorkCenter.validityEndDate, machineWorkCenter.costCenter, machineWorkCenter.recordStatus,
				machineWorkCenter.createdDate, machineWorkCenter.createdBy, machineWorkCenter.lastModifiedDate,
				machineWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(machineWorkCenter.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, machineWorkCenter.organization)
				.map(OPERATIONAL_WORK_CENTER, machineWorkCenter.operationalWorkCenter).map(CODE, machineWorkCenter.code)
				.map(CATEGORY, machineWorkCenter.category).map(DESCRIPTION, machineWorkCenter.description)
				.map(RESPONSIBLE, machineWorkCenter.responsible).map(CONTROL_KEY, machineWorkCenter.controlKey)
				.map(PLANNER_GROUP, machineWorkCenter.plannerGroup)
				.map(CAPACITY_UNIT_OF_MEASURE, machineWorkCenter.capacityUnitOfMeasure)
				.map(CAPACITY_START_TIME, machineWorkCenter.capacityStartTime)
				.map(CAPACITY_END_TIME, machineWorkCenter.capacityEndTime)
				.map(CAPACITY_UTILIZATION, machineWorkCenter.capacityUtilization)
				.map(NUMBEROF_CAPACITIES, machineWorkCenter.numberofCapacities)
				.map(VALIDITY_START_DATE, machineWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, machineWorkCenter.validityEndDate)
				.map(COST_CENTER, machineWorkCenter.costCenter).map(RECORD_STATUS, machineWorkCenter.recordStatus)
				.map(CREATED_DATE, machineWorkCenter.createdDate).map(CREATED_BY, machineWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, machineWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, machineWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, machineWorkCenter);
	}
}
