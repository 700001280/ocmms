package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PreventiveMaintenanceFinding;
import com.ocmms.cmms.model.pm.routine.QPreventiveMaintenanceFinding;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PreventiveMaintenanceFindingRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PreventiveMaintenanceFindingRepositoryImpl
		extends QueryDslRepositorySupportExt<PreventiveMaintenanceFinding>
		implements PreventiveMaintenanceFindingRepositoryCustom {

	/**
	 * Default constructor
	 */
	PreventiveMaintenanceFindingRepositoryImpl() {
		super(PreventiveMaintenanceFinding.class);
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
	public Page<PreventiveMaintenanceFinding> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPreventiveMaintenanceFinding preventiveMaintenanceFinding = QPreventiveMaintenanceFinding.preventiveMaintenanceFinding;
		JPQLQuery<PreventiveMaintenanceFinding> query = from(preventiveMaintenanceFinding);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceFinding.notificationCode,
				preventiveMaintenanceFinding.notificationType, preventiveMaintenanceFinding.reportedDate,
				preventiveMaintenanceFinding.reportedBy, preventiveMaintenanceFinding.description,
				preventiveMaintenanceFinding.longText, preventiveMaintenanceFinding.systemStatus,
				preventiveMaintenanceFinding.userStatus, preventiveMaintenanceFinding.priority,
				preventiveMaintenanceFinding.technicalObject, preventiveMaintenanceFinding.plantLocation,
				preventiveMaintenanceFinding.plantSection, preventiveMaintenanceFinding.costCenter,
				preventiveMaintenanceFinding.plannerGroup, preventiveMaintenanceFinding.mainWorkCenter,
				preventiveMaintenanceFinding.workCenterResponsible, preventiveMaintenanceFinding.breakdown,
				preventiveMaintenanceFinding.requiredStart, preventiveMaintenanceFinding.requiredEnd,
				preventiveMaintenanceFinding.workorderHeader, preventiveMaintenanceFinding.recordStatus,
				preventiveMaintenanceFinding.createdDate, preventiveMaintenanceFinding.createdBy,
				preventiveMaintenanceFinding.lastModifiedDate, preventiveMaintenanceFinding.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(NOTIFICATION_CODE, preventiveMaintenanceFinding.notificationCode)
				.map(NOTIFICATION_TYPE, preventiveMaintenanceFinding.notificationType)
				.map(REPORTED_DATE, preventiveMaintenanceFinding.reportedDate)
				.map(REPORTED_BY, preventiveMaintenanceFinding.reportedBy)
				.map(DESCRIPTION, preventiveMaintenanceFinding.description)
				.map(LONG_TEXT, preventiveMaintenanceFinding.longText)
				.map(SYSTEM_STATUS, preventiveMaintenanceFinding.systemStatus)
				.map(USER_STATUS, preventiveMaintenanceFinding.userStatus)
				.map(PRIORITY, preventiveMaintenanceFinding.priority)
				.map(TECHNICAL_OBJECT, preventiveMaintenanceFinding.technicalObject)
				.map(PLANT_LOCATION, preventiveMaintenanceFinding.plantLocation)
				.map(PLANT_SECTION, preventiveMaintenanceFinding.plantSection)
				.map(COST_CENTER, preventiveMaintenanceFinding.costCenter)
				.map(PLANNER_GROUP, preventiveMaintenanceFinding.plannerGroup)
				.map(MAIN_WORK_CENTER, preventiveMaintenanceFinding.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, preventiveMaintenanceFinding.workCenterResponsible)
				.map(BREAKDOWN, preventiveMaintenanceFinding.breakdown)
				.map(REQUIRED_START, preventiveMaintenanceFinding.requiredStart)
				.map(REQUIRED_END, preventiveMaintenanceFinding.requiredEnd)
				.map(WORKORDER_HEADER, preventiveMaintenanceFinding.workorderHeader)
				.map(RECORD_STATUS, preventiveMaintenanceFinding.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceFinding.createdDate)
				.map(CREATED_BY, preventiveMaintenanceFinding.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceFinding.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceFinding.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceFinding);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceFinding> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPreventiveMaintenanceFinding preventiveMaintenanceFinding = QPreventiveMaintenanceFinding.preventiveMaintenanceFinding;
		JPQLQuery<PreventiveMaintenanceFinding> query = from(preventiveMaintenanceFinding);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceFinding.notificationCode,
				preventiveMaintenanceFinding.notificationType, preventiveMaintenanceFinding.reportedDate,
				preventiveMaintenanceFinding.reportedBy, preventiveMaintenanceFinding.description,
				preventiveMaintenanceFinding.longText, preventiveMaintenanceFinding.systemStatus,
				preventiveMaintenanceFinding.userStatus, preventiveMaintenanceFinding.priority,
				preventiveMaintenanceFinding.technicalObject, preventiveMaintenanceFinding.plantLocation,
				preventiveMaintenanceFinding.plantSection, preventiveMaintenanceFinding.costCenter,
				preventiveMaintenanceFinding.plannerGroup, preventiveMaintenanceFinding.mainWorkCenter,
				preventiveMaintenanceFinding.workCenterResponsible, preventiveMaintenanceFinding.breakdown,
				preventiveMaintenanceFinding.requiredStart, preventiveMaintenanceFinding.requiredEnd,
				preventiveMaintenanceFinding.workorderHeader, preventiveMaintenanceFinding.recordStatus,
				preventiveMaintenanceFinding.createdDate, preventiveMaintenanceFinding.createdBy,
				preventiveMaintenanceFinding.lastModifiedDate, preventiveMaintenanceFinding.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(preventiveMaintenanceFinding.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(NOTIFICATION_CODE, preventiveMaintenanceFinding.notificationCode)
				.map(NOTIFICATION_TYPE, preventiveMaintenanceFinding.notificationType)
				.map(REPORTED_DATE, preventiveMaintenanceFinding.reportedDate)
				.map(REPORTED_BY, preventiveMaintenanceFinding.reportedBy)
				.map(DESCRIPTION, preventiveMaintenanceFinding.description)
				.map(LONG_TEXT, preventiveMaintenanceFinding.longText)
				.map(SYSTEM_STATUS, preventiveMaintenanceFinding.systemStatus)
				.map(USER_STATUS, preventiveMaintenanceFinding.userStatus)
				.map(PRIORITY, preventiveMaintenanceFinding.priority)
				.map(TECHNICAL_OBJECT, preventiveMaintenanceFinding.technicalObject)
				.map(PLANT_LOCATION, preventiveMaintenanceFinding.plantLocation)
				.map(PLANT_SECTION, preventiveMaintenanceFinding.plantSection)
				.map(COST_CENTER, preventiveMaintenanceFinding.costCenter)
				.map(PLANNER_GROUP, preventiveMaintenanceFinding.plannerGroup)
				.map(MAIN_WORK_CENTER, preventiveMaintenanceFinding.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, preventiveMaintenanceFinding.workCenterResponsible)
				.map(BREAKDOWN, preventiveMaintenanceFinding.breakdown)
				.map(REQUIRED_START, preventiveMaintenanceFinding.requiredStart)
				.map(REQUIRED_END, preventiveMaintenanceFinding.requiredEnd)
				.map(WORKORDER_HEADER, preventiveMaintenanceFinding.workorderHeader)
				.map(RECORD_STATUS, preventiveMaintenanceFinding.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceFinding.createdDate)
				.map(CREATED_BY, preventiveMaintenanceFinding.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceFinding.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceFinding.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceFinding);
	}
}
