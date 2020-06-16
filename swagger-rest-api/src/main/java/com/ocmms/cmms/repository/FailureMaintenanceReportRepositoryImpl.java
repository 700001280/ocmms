package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;
import com.ocmms.cmms.model.pp.operation.QFailureMaintenanceReport;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = FailureMaintenanceReportRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class FailureMaintenanceReportRepositoryImpl extends QueryDslRepositorySupportExt<FailureMaintenanceReport>
		implements FailureMaintenanceReportRepositoryCustom {

	/**
	 * Default constructor
	 */
	FailureMaintenanceReportRepositoryImpl() {
		super(FailureMaintenanceReport.class);
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
	public Page<FailureMaintenanceReport> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QFailureMaintenanceReport failureMaintenanceReport = QFailureMaintenanceReport.failureMaintenanceReport;
		JPQLQuery<FailureMaintenanceReport> query = from(failureMaintenanceReport);
		Path<?>[] paths = new Path<?>[] { failureMaintenanceReport.notificationCode,
				failureMaintenanceReport.notificationType, failureMaintenanceReport.reportedDate,
				failureMaintenanceReport.reportedBy, failureMaintenanceReport.description,
				failureMaintenanceReport.longText, failureMaintenanceReport.systemStatus,
				failureMaintenanceReport.userStatus, failureMaintenanceReport.priority,
				failureMaintenanceReport.technicalObject, failureMaintenanceReport.plantLocation,
				failureMaintenanceReport.plantSection, failureMaintenanceReport.costCenter,
				failureMaintenanceReport.plannerGroup, failureMaintenanceReport.mainWorkCenter,
				failureMaintenanceReport.workCenterResponsible, failureMaintenanceReport.breakdown,
				failureMaintenanceReport.requiredStart, failureMaintenanceReport.requiredEnd,
				failureMaintenanceReport.workorderHeader, failureMaintenanceReport.recordStatus,
				failureMaintenanceReport.createdDate, failureMaintenanceReport.createdBy,
				failureMaintenanceReport.lastModifiedDate, failureMaintenanceReport.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(NOTIFICATION_CODE, failureMaintenanceReport.notificationCode)
				.map(NOTIFICATION_TYPE, failureMaintenanceReport.notificationType)
				.map(REPORTED_DATE, failureMaintenanceReport.reportedDate)
				.map(REPORTED_BY, failureMaintenanceReport.reportedBy)
				.map(DESCRIPTION, failureMaintenanceReport.description)
				.map(LONG_TEXT, failureMaintenanceReport.longText)
				.map(SYSTEM_STATUS, failureMaintenanceReport.systemStatus)
				.map(USER_STATUS, failureMaintenanceReport.userStatus).map(PRIORITY, failureMaintenanceReport.priority)
				.map(TECHNICAL_OBJECT, failureMaintenanceReport.technicalObject)
				.map(PLANT_LOCATION, failureMaintenanceReport.plantLocation)
				.map(PLANT_SECTION, failureMaintenanceReport.plantSection)
				.map(COST_CENTER, failureMaintenanceReport.costCenter)
				.map(PLANNER_GROUP, failureMaintenanceReport.plannerGroup)
				.map(MAIN_WORK_CENTER, failureMaintenanceReport.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, failureMaintenanceReport.workCenterResponsible)
				.map(BREAKDOWN, failureMaintenanceReport.breakdown)
				.map(REQUIRED_START, failureMaintenanceReport.requiredStart)
				.map(REQUIRED_END, failureMaintenanceReport.requiredEnd)
				.map(WORKORDER_HEADER, failureMaintenanceReport.workorderHeader)
				.map(RECORD_STATUS, failureMaintenanceReport.recordStatus)
				.map(CREATED_DATE, failureMaintenanceReport.createdDate)
				.map(CREATED_BY, failureMaintenanceReport.createdBy)
				.map(LAST_MODIFIED_DATE, failureMaintenanceReport.lastModifiedDate)
				.map(LAST_MODIFIED_BY, failureMaintenanceReport.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, failureMaintenanceReport);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<FailureMaintenanceReport> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QFailureMaintenanceReport failureMaintenanceReport = QFailureMaintenanceReport.failureMaintenanceReport;
		JPQLQuery<FailureMaintenanceReport> query = from(failureMaintenanceReport);
		Path<?>[] paths = new Path<?>[] { failureMaintenanceReport.notificationCode,
				failureMaintenanceReport.notificationType, failureMaintenanceReport.reportedDate,
				failureMaintenanceReport.reportedBy, failureMaintenanceReport.description,
				failureMaintenanceReport.longText, failureMaintenanceReport.systemStatus,
				failureMaintenanceReport.userStatus, failureMaintenanceReport.priority,
				failureMaintenanceReport.technicalObject, failureMaintenanceReport.plantLocation,
				failureMaintenanceReport.plantSection, failureMaintenanceReport.costCenter,
				failureMaintenanceReport.plannerGroup, failureMaintenanceReport.mainWorkCenter,
				failureMaintenanceReport.workCenterResponsible, failureMaintenanceReport.breakdown,
				failureMaintenanceReport.requiredStart, failureMaintenanceReport.requiredEnd,
				failureMaintenanceReport.workorderHeader, failureMaintenanceReport.recordStatus,
				failureMaintenanceReport.createdDate, failureMaintenanceReport.createdBy,
				failureMaintenanceReport.lastModifiedDate, failureMaintenanceReport.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(failureMaintenanceReport.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(NOTIFICATION_CODE, failureMaintenanceReport.notificationCode)
				.map(NOTIFICATION_TYPE, failureMaintenanceReport.notificationType)
				.map(REPORTED_DATE, failureMaintenanceReport.reportedDate)
				.map(REPORTED_BY, failureMaintenanceReport.reportedBy)
				.map(DESCRIPTION, failureMaintenanceReport.description)
				.map(LONG_TEXT, failureMaintenanceReport.longText)
				.map(SYSTEM_STATUS, failureMaintenanceReport.systemStatus)
				.map(USER_STATUS, failureMaintenanceReport.userStatus).map(PRIORITY, failureMaintenanceReport.priority)
				.map(TECHNICAL_OBJECT, failureMaintenanceReport.technicalObject)
				.map(PLANT_LOCATION, failureMaintenanceReport.plantLocation)
				.map(PLANT_SECTION, failureMaintenanceReport.plantSection)
				.map(COST_CENTER, failureMaintenanceReport.costCenter)
				.map(PLANNER_GROUP, failureMaintenanceReport.plannerGroup)
				.map(MAIN_WORK_CENTER, failureMaintenanceReport.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, failureMaintenanceReport.workCenterResponsible)
				.map(BREAKDOWN, failureMaintenanceReport.breakdown)
				.map(REQUIRED_START, failureMaintenanceReport.requiredStart)
				.map(REQUIRED_END, failureMaintenanceReport.requiredEnd)
				.map(WORKORDER_HEADER, failureMaintenanceReport.workorderHeader)
				.map(RECORD_STATUS, failureMaintenanceReport.recordStatus)
				.map(CREATED_DATE, failureMaintenanceReport.createdDate)
				.map(CREATED_BY, failureMaintenanceReport.createdBy)
				.map(LAST_MODIFIED_DATE, failureMaintenanceReport.lastModifiedDate)
				.map(LAST_MODIFIED_BY, failureMaintenanceReport.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, failureMaintenanceReport);
	}
}
