package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import com.ocmms.cmms.model.pm.workorder.QWorkOrderHeader;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = WorkOrderHeaderRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WorkOrderHeaderRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderHeader>
		implements WorkOrderHeaderRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkOrderHeaderRepositoryImpl() {
		super(WorkOrderHeader.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PLAN_FINISH_DATE = "planFinishDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String USER_STATUS = "userStatus";

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
	public static final String PRIORITY = "priority";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FUNCTIONAL_LOCATION = "functionalLocation";

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
	public static final String SYSTEM_CONDITION = "systemCondition";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT = "equipment";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORK_ORDER_CODE = "workOrderCode";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACTIVITY_TYPE = "activityType";

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
	public static final String PLANT_LOCATION = "plantLocation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACT_START_DATE = "actStartDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACT_FINISH_DATE = "actFinishDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PLAN_START_DATE = "planStartDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PLANT_SECTION = "plantSection";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NOTIFICATION_HEADER = "notificationHeader";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORK_ORDER_TYPE = "workOrderType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String BREAKDOWN = "breakdown";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderHeader> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderHeader workOrderHeader = QWorkOrderHeader.workOrderHeader;
		JPQLQuery<WorkOrderHeader> query = from(workOrderHeader);
		Path<?>[] paths = new Path<?>[] { workOrderHeader.workOrderCode, workOrderHeader.workOrderType,
				workOrderHeader.description, workOrderHeader.userStatus, workOrderHeader.notificationHeader,
				workOrderHeader.plannerGroup, workOrderHeader.mainWorkCenter, workOrderHeader.activityType,
				workOrderHeader.systemCondition, workOrderHeader.priority, workOrderHeader.planStartDate,
				workOrderHeader.planFinishDate, workOrderHeader.actStartDate, workOrderHeader.actFinishDate,
				workOrderHeader.functionalLocation, workOrderHeader.equipment, workOrderHeader.plantLocation,
				workOrderHeader.plantSection, workOrderHeader.costCenter, workOrderHeader.breakdown,
				workOrderHeader.recordStatus, workOrderHeader.createdDate, workOrderHeader.createdBy,
				workOrderHeader.lastModifiedDate, workOrderHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER_CODE, workOrderHeader.workOrderCode)
				.map(WORK_ORDER_TYPE, workOrderHeader.workOrderType).map(DESCRIPTION, workOrderHeader.description)
				.map(USER_STATUS, workOrderHeader.userStatus)
				.map(NOTIFICATION_HEADER, workOrderHeader.notificationHeader)
				.map(PLANNER_GROUP, workOrderHeader.plannerGroup).map(MAIN_WORK_CENTER, workOrderHeader.mainWorkCenter)
				.map(ACTIVITY_TYPE, workOrderHeader.activityType).map(SYSTEM_CONDITION, workOrderHeader.systemCondition)
				.map(PRIORITY, workOrderHeader.priority).map(PLAN_START_DATE, workOrderHeader.planStartDate)
				.map(PLAN_FINISH_DATE, workOrderHeader.planFinishDate).map(ACT_START_DATE, workOrderHeader.actStartDate)
				.map(ACT_FINISH_DATE, workOrderHeader.actFinishDate)
				.map(FUNCTIONAL_LOCATION, workOrderHeader.functionalLocation).map(EQUIPMENT, workOrderHeader.equipment)
				.map(PLANT_LOCATION, workOrderHeader.plantLocation).map(PLANT_SECTION, workOrderHeader.plantSection)
				.map(COST_CENTER, workOrderHeader.costCenter).map(BREAKDOWN, workOrderHeader.breakdown)
				.map(RECORD_STATUS, workOrderHeader.recordStatus).map(CREATED_DATE, workOrderHeader.createdDate)
				.map(CREATED_BY, workOrderHeader.createdBy).map(LAST_MODIFIED_DATE, workOrderHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderHeader> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderHeader workOrderHeader = QWorkOrderHeader.workOrderHeader;
		JPQLQuery<WorkOrderHeader> query = from(workOrderHeader);
		Path<?>[] paths = new Path<?>[] { workOrderHeader.workOrderCode, workOrderHeader.workOrderType,
				workOrderHeader.description, workOrderHeader.userStatus, workOrderHeader.notificationHeader,
				workOrderHeader.plannerGroup, workOrderHeader.mainWorkCenter, workOrderHeader.activityType,
				workOrderHeader.systemCondition, workOrderHeader.priority, workOrderHeader.planStartDate,
				workOrderHeader.planFinishDate, workOrderHeader.actStartDate, workOrderHeader.actFinishDate,
				workOrderHeader.functionalLocation, workOrderHeader.equipment, workOrderHeader.plantLocation,
				workOrderHeader.plantSection, workOrderHeader.costCenter, workOrderHeader.breakdown,
				workOrderHeader.recordStatus, workOrderHeader.createdDate, workOrderHeader.createdBy,
				workOrderHeader.lastModifiedDate, workOrderHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workOrderHeader.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER_CODE, workOrderHeader.workOrderCode)
				.map(WORK_ORDER_TYPE, workOrderHeader.workOrderType).map(DESCRIPTION, workOrderHeader.description)
				.map(USER_STATUS, workOrderHeader.userStatus)
				.map(NOTIFICATION_HEADER, workOrderHeader.notificationHeader)
				.map(PLANNER_GROUP, workOrderHeader.plannerGroup).map(MAIN_WORK_CENTER, workOrderHeader.mainWorkCenter)
				.map(ACTIVITY_TYPE, workOrderHeader.activityType).map(SYSTEM_CONDITION, workOrderHeader.systemCondition)
				.map(PRIORITY, workOrderHeader.priority).map(PLAN_START_DATE, workOrderHeader.planStartDate)
				.map(PLAN_FINISH_DATE, workOrderHeader.planFinishDate).map(ACT_START_DATE, workOrderHeader.actStartDate)
				.map(ACT_FINISH_DATE, workOrderHeader.actFinishDate)
				.map(FUNCTIONAL_LOCATION, workOrderHeader.functionalLocation).map(EQUIPMENT, workOrderHeader.equipment)
				.map(PLANT_LOCATION, workOrderHeader.plantLocation).map(PLANT_SECTION, workOrderHeader.plantSection)
				.map(COST_CENTER, workOrderHeader.costCenter).map(BREAKDOWN, workOrderHeader.breakdown)
				.map(RECORD_STATUS, workOrderHeader.recordStatus).map(CREATED_DATE, workOrderHeader.createdDate)
				.map(CREATED_BY, workOrderHeader.createdBy).map(LAST_MODIFIED_DATE, workOrderHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param activityType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderHeader> findByActivityType(MaintenanceActivityType activityType, GlobalSearch globalSearch,
			Pageable pageable) {
		QWorkOrderHeader workOrderHeader = QWorkOrderHeader.workOrderHeader;
		JPQLQuery<WorkOrderHeader> query = from(workOrderHeader);
		Assert.notNull(activityType, "activityType is required");
		query.where(workOrderHeader.activityType.eq(activityType));
		Path<?>[] paths = new Path<?>[] { workOrderHeader.workOrderCode, workOrderHeader.workOrderType,
				workOrderHeader.description, workOrderHeader.userStatus, workOrderHeader.notificationHeader,
				workOrderHeader.plannerGroup, workOrderHeader.mainWorkCenter, workOrderHeader.activityType,
				workOrderHeader.systemCondition, workOrderHeader.priority, workOrderHeader.planStartDate,
				workOrderHeader.planFinishDate, workOrderHeader.actStartDate, workOrderHeader.actFinishDate,
				workOrderHeader.functionalLocation, workOrderHeader.equipment, workOrderHeader.plantLocation,
				workOrderHeader.plantSection, workOrderHeader.costCenter, workOrderHeader.breakdown,
				workOrderHeader.recordStatus, workOrderHeader.createdDate, workOrderHeader.createdBy,
				workOrderHeader.lastModifiedDate, workOrderHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER_CODE, workOrderHeader.workOrderCode)
				.map(WORK_ORDER_TYPE, workOrderHeader.workOrderType).map(DESCRIPTION, workOrderHeader.description)
				.map(USER_STATUS, workOrderHeader.userStatus)
				.map(NOTIFICATION_HEADER, workOrderHeader.notificationHeader)
				.map(PLANNER_GROUP, workOrderHeader.plannerGroup).map(MAIN_WORK_CENTER, workOrderHeader.mainWorkCenter)
				.map(ACTIVITY_TYPE, workOrderHeader.activityType).map(SYSTEM_CONDITION, workOrderHeader.systemCondition)
				.map(PRIORITY, workOrderHeader.priority).map(PLAN_START_DATE, workOrderHeader.planStartDate)
				.map(PLAN_FINISH_DATE, workOrderHeader.planFinishDate).map(ACT_START_DATE, workOrderHeader.actStartDate)
				.map(ACT_FINISH_DATE, workOrderHeader.actFinishDate)
				.map(FUNCTIONAL_LOCATION, workOrderHeader.functionalLocation).map(EQUIPMENT, workOrderHeader.equipment)
				.map(PLANT_LOCATION, workOrderHeader.plantLocation).map(PLANT_SECTION, workOrderHeader.plantSection)
				.map(COST_CENTER, workOrderHeader.costCenter).map(BREAKDOWN, workOrderHeader.breakdown)
				.map(RECORD_STATUS, workOrderHeader.recordStatus).map(CREATED_DATE, workOrderHeader.createdDate)
				.map(CREATED_BY, workOrderHeader.createdBy).map(LAST_MODIFIED_DATE, workOrderHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeader
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderHeader> findByNotificationHeader(NotificationHeader notificationHeader,
			GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderHeader workOrderHeader = QWorkOrderHeader.workOrderHeader;
		JPQLQuery<WorkOrderHeader> query = from(workOrderHeader);
		Assert.notNull(notificationHeader, "notificationHeader is required");
		query.where(workOrderHeader.notificationHeader.eq(notificationHeader));
		Path<?>[] paths = new Path<?>[] { workOrderHeader.workOrderCode, workOrderHeader.workOrderType,
				workOrderHeader.description, workOrderHeader.userStatus, workOrderHeader.notificationHeader,
				workOrderHeader.plannerGroup, workOrderHeader.mainWorkCenter, workOrderHeader.activityType,
				workOrderHeader.systemCondition, workOrderHeader.priority, workOrderHeader.planStartDate,
				workOrderHeader.planFinishDate, workOrderHeader.actStartDate, workOrderHeader.actFinishDate,
				workOrderHeader.functionalLocation, workOrderHeader.equipment, workOrderHeader.plantLocation,
				workOrderHeader.plantSection, workOrderHeader.costCenter, workOrderHeader.breakdown,
				workOrderHeader.recordStatus, workOrderHeader.createdDate, workOrderHeader.createdBy,
				workOrderHeader.lastModifiedDate, workOrderHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER_CODE, workOrderHeader.workOrderCode)
				.map(WORK_ORDER_TYPE, workOrderHeader.workOrderType).map(DESCRIPTION, workOrderHeader.description)
				.map(USER_STATUS, workOrderHeader.userStatus)
				.map(NOTIFICATION_HEADER, workOrderHeader.notificationHeader)
				.map(PLANNER_GROUP, workOrderHeader.plannerGroup).map(MAIN_WORK_CENTER, workOrderHeader.mainWorkCenter)
				.map(ACTIVITY_TYPE, workOrderHeader.activityType).map(SYSTEM_CONDITION, workOrderHeader.systemCondition)
				.map(PRIORITY, workOrderHeader.priority).map(PLAN_START_DATE, workOrderHeader.planStartDate)
				.map(PLAN_FINISH_DATE, workOrderHeader.planFinishDate).map(ACT_START_DATE, workOrderHeader.actStartDate)
				.map(ACT_FINISH_DATE, workOrderHeader.actFinishDate)
				.map(FUNCTIONAL_LOCATION, workOrderHeader.functionalLocation).map(EQUIPMENT, workOrderHeader.equipment)
				.map(PLANT_LOCATION, workOrderHeader.plantLocation).map(PLANT_SECTION, workOrderHeader.plantSection)
				.map(COST_CENTER, workOrderHeader.costCenter).map(BREAKDOWN, workOrderHeader.breakdown)
				.map(RECORD_STATUS, workOrderHeader.recordStatus).map(CREATED_DATE, workOrderHeader.createdDate)
				.map(CREATED_BY, workOrderHeader.createdBy).map(LAST_MODIFIED_DATE, workOrderHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemCondition
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderHeader> findBySystemCondition(SystemCondition systemCondition, GlobalSearch globalSearch,
			Pageable pageable) {
		QWorkOrderHeader workOrderHeader = QWorkOrderHeader.workOrderHeader;
		JPQLQuery<WorkOrderHeader> query = from(workOrderHeader);
		Assert.notNull(systemCondition, "systemCondition is required");
		query.where(workOrderHeader.systemCondition.eq(systemCondition));
		Path<?>[] paths = new Path<?>[] { workOrderHeader.workOrderCode, workOrderHeader.workOrderType,
				workOrderHeader.description, workOrderHeader.userStatus, workOrderHeader.notificationHeader,
				workOrderHeader.plannerGroup, workOrderHeader.mainWorkCenter, workOrderHeader.activityType,
				workOrderHeader.systemCondition, workOrderHeader.priority, workOrderHeader.planStartDate,
				workOrderHeader.planFinishDate, workOrderHeader.actStartDate, workOrderHeader.actFinishDate,
				workOrderHeader.functionalLocation, workOrderHeader.equipment, workOrderHeader.plantLocation,
				workOrderHeader.plantSection, workOrderHeader.costCenter, workOrderHeader.breakdown,
				workOrderHeader.recordStatus, workOrderHeader.createdDate, workOrderHeader.createdBy,
				workOrderHeader.lastModifiedDate, workOrderHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER_CODE, workOrderHeader.workOrderCode)
				.map(WORK_ORDER_TYPE, workOrderHeader.workOrderType).map(DESCRIPTION, workOrderHeader.description)
				.map(USER_STATUS, workOrderHeader.userStatus)
				.map(NOTIFICATION_HEADER, workOrderHeader.notificationHeader)
				.map(PLANNER_GROUP, workOrderHeader.plannerGroup).map(MAIN_WORK_CENTER, workOrderHeader.mainWorkCenter)
				.map(ACTIVITY_TYPE, workOrderHeader.activityType).map(SYSTEM_CONDITION, workOrderHeader.systemCondition)
				.map(PRIORITY, workOrderHeader.priority).map(PLAN_START_DATE, workOrderHeader.planStartDate)
				.map(PLAN_FINISH_DATE, workOrderHeader.planFinishDate).map(ACT_START_DATE, workOrderHeader.actStartDate)
				.map(ACT_FINISH_DATE, workOrderHeader.actFinishDate)
				.map(FUNCTIONAL_LOCATION, workOrderHeader.functionalLocation).map(EQUIPMENT, workOrderHeader.equipment)
				.map(PLANT_LOCATION, workOrderHeader.plantLocation).map(PLANT_SECTION, workOrderHeader.plantSection)
				.map(COST_CENTER, workOrderHeader.costCenter).map(BREAKDOWN, workOrderHeader.breakdown)
				.map(RECORD_STATUS, workOrderHeader.recordStatus).map(CREATED_DATE, workOrderHeader.createdDate)
				.map(CREATED_BY, workOrderHeader.createdBy).map(LAST_MODIFIED_DATE, workOrderHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param userStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderHeader> findByUserStatus(WorkOrderUserStatusWithNumber userStatus, GlobalSearch globalSearch,
			Pageable pageable) {
		QWorkOrderHeader workOrderHeader = QWorkOrderHeader.workOrderHeader;
		JPQLQuery<WorkOrderHeader> query = from(workOrderHeader);
		Assert.notNull(userStatus, "userStatus is required");
		query.where(workOrderHeader.userStatus.eq(userStatus));
		Path<?>[] paths = new Path<?>[] { workOrderHeader.workOrderCode, workOrderHeader.workOrderType,
				workOrderHeader.description, workOrderHeader.userStatus, workOrderHeader.notificationHeader,
				workOrderHeader.plannerGroup, workOrderHeader.mainWorkCenter, workOrderHeader.activityType,
				workOrderHeader.systemCondition, workOrderHeader.priority, workOrderHeader.planStartDate,
				workOrderHeader.planFinishDate, workOrderHeader.actStartDate, workOrderHeader.actFinishDate,
				workOrderHeader.functionalLocation, workOrderHeader.equipment, workOrderHeader.plantLocation,
				workOrderHeader.plantSection, workOrderHeader.costCenter, workOrderHeader.breakdown,
				workOrderHeader.recordStatus, workOrderHeader.createdDate, workOrderHeader.createdBy,
				workOrderHeader.lastModifiedDate, workOrderHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER_CODE, workOrderHeader.workOrderCode)
				.map(WORK_ORDER_TYPE, workOrderHeader.workOrderType).map(DESCRIPTION, workOrderHeader.description)
				.map(USER_STATUS, workOrderHeader.userStatus)
				.map(NOTIFICATION_HEADER, workOrderHeader.notificationHeader)
				.map(PLANNER_GROUP, workOrderHeader.plannerGroup).map(MAIN_WORK_CENTER, workOrderHeader.mainWorkCenter)
				.map(ACTIVITY_TYPE, workOrderHeader.activityType).map(SYSTEM_CONDITION, workOrderHeader.systemCondition)
				.map(PRIORITY, workOrderHeader.priority).map(PLAN_START_DATE, workOrderHeader.planStartDate)
				.map(PLAN_FINISH_DATE, workOrderHeader.planFinishDate).map(ACT_START_DATE, workOrderHeader.actStartDate)
				.map(ACT_FINISH_DATE, workOrderHeader.actFinishDate)
				.map(FUNCTIONAL_LOCATION, workOrderHeader.functionalLocation).map(EQUIPMENT, workOrderHeader.equipment)
				.map(PLANT_LOCATION, workOrderHeader.plantLocation).map(PLANT_SECTION, workOrderHeader.plantSection)
				.map(COST_CENTER, workOrderHeader.costCenter).map(BREAKDOWN, workOrderHeader.breakdown)
				.map(RECORD_STATUS, workOrderHeader.recordStatus).map(CREATED_DATE, workOrderHeader.createdDate)
				.map(CREATED_BY, workOrderHeader.createdBy).map(LAST_MODIFIED_DATE, workOrderHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderHeader> findByWorkOrderType(WorkOrderType workOrderType, GlobalSearch globalSearch,
			Pageable pageable) {
		QWorkOrderHeader workOrderHeader = QWorkOrderHeader.workOrderHeader;
		JPQLQuery<WorkOrderHeader> query = from(workOrderHeader);
		Assert.notNull(workOrderType, "workOrderType is required");
		query.where(workOrderHeader.workOrderType.eq(workOrderType));
		Path<?>[] paths = new Path<?>[] { workOrderHeader.workOrderCode, workOrderHeader.workOrderType,
				workOrderHeader.description, workOrderHeader.userStatus, workOrderHeader.notificationHeader,
				workOrderHeader.plannerGroup, workOrderHeader.mainWorkCenter, workOrderHeader.activityType,
				workOrderHeader.systemCondition, workOrderHeader.priority, workOrderHeader.planStartDate,
				workOrderHeader.planFinishDate, workOrderHeader.actStartDate, workOrderHeader.actFinishDate,
				workOrderHeader.functionalLocation, workOrderHeader.equipment, workOrderHeader.plantLocation,
				workOrderHeader.plantSection, workOrderHeader.costCenter, workOrderHeader.breakdown,
				workOrderHeader.recordStatus, workOrderHeader.createdDate, workOrderHeader.createdBy,
				workOrderHeader.lastModifiedDate, workOrderHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER_CODE, workOrderHeader.workOrderCode)
				.map(WORK_ORDER_TYPE, workOrderHeader.workOrderType).map(DESCRIPTION, workOrderHeader.description)
				.map(USER_STATUS, workOrderHeader.userStatus)
				.map(NOTIFICATION_HEADER, workOrderHeader.notificationHeader)
				.map(PLANNER_GROUP, workOrderHeader.plannerGroup).map(MAIN_WORK_CENTER, workOrderHeader.mainWorkCenter)
				.map(ACTIVITY_TYPE, workOrderHeader.activityType).map(SYSTEM_CONDITION, workOrderHeader.systemCondition)
				.map(PRIORITY, workOrderHeader.priority).map(PLAN_START_DATE, workOrderHeader.planStartDate)
				.map(PLAN_FINISH_DATE, workOrderHeader.planFinishDate).map(ACT_START_DATE, workOrderHeader.actStartDate)
				.map(ACT_FINISH_DATE, workOrderHeader.actFinishDate)
				.map(FUNCTIONAL_LOCATION, workOrderHeader.functionalLocation).map(EQUIPMENT, workOrderHeader.equipment)
				.map(PLANT_LOCATION, workOrderHeader.plantLocation).map(PLANT_SECTION, workOrderHeader.plantSection)
				.map(COST_CENTER, workOrderHeader.costCenter).map(BREAKDOWN, workOrderHeader.breakdown)
				.map(RECORD_STATUS, workOrderHeader.recordStatus).map(CREATED_DATE, workOrderHeader.createdDate)
				.map(CREATED_BY, workOrderHeader.createdBy).map(LAST_MODIFIED_DATE, workOrderHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderHeader);
	}
}
