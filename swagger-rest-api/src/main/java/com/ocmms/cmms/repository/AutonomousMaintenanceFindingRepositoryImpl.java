package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;
import com.ocmms.cmms.model.pp.operation.QAutonomousMaintenanceFinding;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AutonomousMaintenanceFindingRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class AutonomousMaintenanceFindingRepositoryImpl
		extends QueryDslRepositorySupportExt<AutonomousMaintenanceFinding>
		implements AutonomousMaintenanceFindingRepositoryCustom {

	/**
	 * Default constructor
	 */
	AutonomousMaintenanceFindingRepositoryImpl() {
		super(AutonomousMaintenanceFinding.class);
	}

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
	public static final String REQUIRED_END = "requiredEnd";

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
	public static final String WORK_CENTER_RESPONSIBLE = "workCenterResponsible";

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
	public static final String WORKORDER_HEADER = "workorderHeader";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PLANT_LOCATION = "plantLocation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REPORTED_DATE = "reportedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NOTIFICATION_CODE = "notificationCode";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REQUIRED_START = "requiredStart";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REPORTED_BY = "reportedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LONG_TEXT = "longText";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PLANT_SECTION = "plantSection";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TECHNICAL_OBJECT = "technicalObject";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SYSTEM_STATUS = "systemStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NOTIFICATION_TYPE = "notificationType";

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
	public Page<AutonomousMaintenanceFinding> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QAutonomousMaintenanceFinding autonomousMaintenanceFinding = QAutonomousMaintenanceFinding.autonomousMaintenanceFinding;
		JPQLQuery<AutonomousMaintenanceFinding> query = from(autonomousMaintenanceFinding);
		Path<?>[] paths = new Path<?>[] { autonomousMaintenanceFinding.notificationCode,
				autonomousMaintenanceFinding.notificationType, autonomousMaintenanceFinding.reportedDate,
				autonomousMaintenanceFinding.reportedBy, autonomousMaintenanceFinding.description,
				autonomousMaintenanceFinding.longText, autonomousMaintenanceFinding.systemStatus,
				autonomousMaintenanceFinding.userStatus, autonomousMaintenanceFinding.priority,
				autonomousMaintenanceFinding.technicalObject, autonomousMaintenanceFinding.plantLocation,
				autonomousMaintenanceFinding.plantSection, autonomousMaintenanceFinding.costCenter,
				autonomousMaintenanceFinding.plannerGroup, autonomousMaintenanceFinding.mainWorkCenter,
				autonomousMaintenanceFinding.workCenterResponsible, autonomousMaintenanceFinding.breakdown,
				autonomousMaintenanceFinding.requiredStart, autonomousMaintenanceFinding.requiredEnd,
				autonomousMaintenanceFinding.workorderHeader, autonomousMaintenanceFinding.recordStatus,
				autonomousMaintenanceFinding.createdDate, autonomousMaintenanceFinding.createdBy,
				autonomousMaintenanceFinding.lastModifiedDate, autonomousMaintenanceFinding.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(NOTIFICATION_CODE, autonomousMaintenanceFinding.notificationCode)
				.map(NOTIFICATION_TYPE, autonomousMaintenanceFinding.notificationType)
				.map(REPORTED_DATE, autonomousMaintenanceFinding.reportedDate)
				.map(REPORTED_BY, autonomousMaintenanceFinding.reportedBy)
				.map(DESCRIPTION, autonomousMaintenanceFinding.description)
				.map(LONG_TEXT, autonomousMaintenanceFinding.longText)
				.map(SYSTEM_STATUS, autonomousMaintenanceFinding.systemStatus)
				.map(USER_STATUS, autonomousMaintenanceFinding.userStatus)
				.map(PRIORITY, autonomousMaintenanceFinding.priority)
				.map(TECHNICAL_OBJECT, autonomousMaintenanceFinding.technicalObject)
				.map(PLANT_LOCATION, autonomousMaintenanceFinding.plantLocation)
				.map(PLANT_SECTION, autonomousMaintenanceFinding.plantSection)
				.map(COST_CENTER, autonomousMaintenanceFinding.costCenter)
				.map(PLANNER_GROUP, autonomousMaintenanceFinding.plannerGroup)
				.map(MAIN_WORK_CENTER, autonomousMaintenanceFinding.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, autonomousMaintenanceFinding.workCenterResponsible)
				.map(BREAKDOWN, autonomousMaintenanceFinding.breakdown)
				.map(REQUIRED_START, autonomousMaintenanceFinding.requiredStart)
				.map(REQUIRED_END, autonomousMaintenanceFinding.requiredEnd)
				.map(WORKORDER_HEADER, autonomousMaintenanceFinding.workorderHeader)
				.map(RECORD_STATUS, autonomousMaintenanceFinding.recordStatus)
				.map(CREATED_DATE, autonomousMaintenanceFinding.createdDate)
				.map(CREATED_BY, autonomousMaintenanceFinding.createdBy)
				.map(LAST_MODIFIED_DATE, autonomousMaintenanceFinding.lastModifiedDate)
				.map(LAST_MODIFIED_BY, autonomousMaintenanceFinding.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, autonomousMaintenanceFinding);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AutonomousMaintenanceFinding> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QAutonomousMaintenanceFinding autonomousMaintenanceFinding = QAutonomousMaintenanceFinding.autonomousMaintenanceFinding;
		JPQLQuery<AutonomousMaintenanceFinding> query = from(autonomousMaintenanceFinding);
		Path<?>[] paths = new Path<?>[] { autonomousMaintenanceFinding.notificationCode,
				autonomousMaintenanceFinding.notificationType, autonomousMaintenanceFinding.reportedDate,
				autonomousMaintenanceFinding.reportedBy, autonomousMaintenanceFinding.description,
				autonomousMaintenanceFinding.longText, autonomousMaintenanceFinding.systemStatus,
				autonomousMaintenanceFinding.userStatus, autonomousMaintenanceFinding.priority,
				autonomousMaintenanceFinding.technicalObject, autonomousMaintenanceFinding.plantLocation,
				autonomousMaintenanceFinding.plantSection, autonomousMaintenanceFinding.costCenter,
				autonomousMaintenanceFinding.plannerGroup, autonomousMaintenanceFinding.mainWorkCenter,
				autonomousMaintenanceFinding.workCenterResponsible, autonomousMaintenanceFinding.breakdown,
				autonomousMaintenanceFinding.requiredStart, autonomousMaintenanceFinding.requiredEnd,
				autonomousMaintenanceFinding.workorderHeader, autonomousMaintenanceFinding.recordStatus,
				autonomousMaintenanceFinding.createdDate, autonomousMaintenanceFinding.createdBy,
				autonomousMaintenanceFinding.lastModifiedDate, autonomousMaintenanceFinding.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(autonomousMaintenanceFinding.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(NOTIFICATION_CODE, autonomousMaintenanceFinding.notificationCode)
				.map(NOTIFICATION_TYPE, autonomousMaintenanceFinding.notificationType)
				.map(REPORTED_DATE, autonomousMaintenanceFinding.reportedDate)
				.map(REPORTED_BY, autonomousMaintenanceFinding.reportedBy)
				.map(DESCRIPTION, autonomousMaintenanceFinding.description)
				.map(LONG_TEXT, autonomousMaintenanceFinding.longText)
				.map(SYSTEM_STATUS, autonomousMaintenanceFinding.systemStatus)
				.map(USER_STATUS, autonomousMaintenanceFinding.userStatus)
				.map(PRIORITY, autonomousMaintenanceFinding.priority)
				.map(TECHNICAL_OBJECT, autonomousMaintenanceFinding.technicalObject)
				.map(PLANT_LOCATION, autonomousMaintenanceFinding.plantLocation)
				.map(PLANT_SECTION, autonomousMaintenanceFinding.plantSection)
				.map(COST_CENTER, autonomousMaintenanceFinding.costCenter)
				.map(PLANNER_GROUP, autonomousMaintenanceFinding.plannerGroup)
				.map(MAIN_WORK_CENTER, autonomousMaintenanceFinding.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, autonomousMaintenanceFinding.workCenterResponsible)
				.map(BREAKDOWN, autonomousMaintenanceFinding.breakdown)
				.map(REQUIRED_START, autonomousMaintenanceFinding.requiredStart)
				.map(REQUIRED_END, autonomousMaintenanceFinding.requiredEnd)
				.map(WORKORDER_HEADER, autonomousMaintenanceFinding.workorderHeader)
				.map(RECORD_STATUS, autonomousMaintenanceFinding.recordStatus)
				.map(CREATED_DATE, autonomousMaintenanceFinding.createdDate)
				.map(CREATED_BY, autonomousMaintenanceFinding.createdBy)
				.map(LAST_MODIFIED_DATE, autonomousMaintenanceFinding.lastModifiedDate)
				.map(LAST_MODIFIED_BY, autonomousMaintenanceFinding.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, autonomousMaintenanceFinding);
	}
}
