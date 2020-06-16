package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import com.ocmms.cmms.model.pm.notification.NotificationSystemStatus;
import com.ocmms.cmms.model.pm.notification.NotificationType;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;
import com.ocmms.cmms.model.pm.notification.QNotificationHeader;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = NotificationHeaderRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class NotificationHeaderRepositoryImpl extends QueryDslRepositorySupportExt<NotificationHeader>
		implements NotificationHeaderRepositoryCustom {

	/**
	 * Default constructor
	 */
	NotificationHeaderRepositoryImpl() {
		super(NotificationHeader.class);
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
	public Page<NotificationHeader> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QNotificationHeader notificationHeader = QNotificationHeader.notificationHeader;
		JPQLQuery<NotificationHeader> query = from(notificationHeader);
		Path<?>[] paths = new Path<?>[] { notificationHeader.notificationCode, notificationHeader.notificationType,
				notificationHeader.reportedDate, notificationHeader.reportedBy, notificationHeader.description,
				notificationHeader.longText, notificationHeader.systemStatus, notificationHeader.userStatus,
				notificationHeader.priority, notificationHeader.technicalObject, notificationHeader.plantLocation,
				notificationHeader.plantSection, notificationHeader.costCenter, notificationHeader.plannerGroup,
				notificationHeader.mainWorkCenter, notificationHeader.workCenterResponsible,
				notificationHeader.breakdown, notificationHeader.requiredStart, notificationHeader.requiredEnd,
				notificationHeader.workorderHeader, notificationHeader.recordStatus, notificationHeader.createdDate,
				notificationHeader.createdBy, notificationHeader.lastModifiedDate, notificationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_CODE, notificationHeader.notificationCode)
				.map(NOTIFICATION_TYPE, notificationHeader.notificationType)
				.map(REPORTED_DATE, notificationHeader.reportedDate).map(REPORTED_BY, notificationHeader.reportedBy)
				.map(DESCRIPTION, notificationHeader.description).map(LONG_TEXT, notificationHeader.longText)
				.map(SYSTEM_STATUS, notificationHeader.systemStatus).map(USER_STATUS, notificationHeader.userStatus)
				.map(PRIORITY, notificationHeader.priority).map(TECHNICAL_OBJECT, notificationHeader.technicalObject)
				.map(PLANT_LOCATION, notificationHeader.plantLocation)
				.map(PLANT_SECTION, notificationHeader.plantSection).map(COST_CENTER, notificationHeader.costCenter)
				.map(PLANNER_GROUP, notificationHeader.plannerGroup)
				.map(MAIN_WORK_CENTER, notificationHeader.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, notificationHeader.workCenterResponsible)
				.map(BREAKDOWN, notificationHeader.breakdown).map(REQUIRED_START, notificationHeader.requiredStart)
				.map(REQUIRED_END, notificationHeader.requiredEnd)
				.map(WORKORDER_HEADER, notificationHeader.workorderHeader)
				.map(RECORD_STATUS, notificationHeader.recordStatus).map(CREATED_DATE, notificationHeader.createdDate)
				.map(CREATED_BY, notificationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, notificationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationHeader> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QNotificationHeader notificationHeader = QNotificationHeader.notificationHeader;
		JPQLQuery<NotificationHeader> query = from(notificationHeader);
		Path<?>[] paths = new Path<?>[] { notificationHeader.notificationCode, notificationHeader.notificationType,
				notificationHeader.reportedDate, notificationHeader.reportedBy, notificationHeader.description,
				notificationHeader.longText, notificationHeader.systemStatus, notificationHeader.userStatus,
				notificationHeader.priority, notificationHeader.technicalObject, notificationHeader.plantLocation,
				notificationHeader.plantSection, notificationHeader.costCenter, notificationHeader.plannerGroup,
				notificationHeader.mainWorkCenter, notificationHeader.workCenterResponsible,
				notificationHeader.breakdown, notificationHeader.requiredStart, notificationHeader.requiredEnd,
				notificationHeader.workorderHeader, notificationHeader.recordStatus, notificationHeader.createdDate,
				notificationHeader.createdBy, notificationHeader.lastModifiedDate, notificationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(notificationHeader.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_CODE, notificationHeader.notificationCode)
				.map(NOTIFICATION_TYPE, notificationHeader.notificationType)
				.map(REPORTED_DATE, notificationHeader.reportedDate).map(REPORTED_BY, notificationHeader.reportedBy)
				.map(DESCRIPTION, notificationHeader.description).map(LONG_TEXT, notificationHeader.longText)
				.map(SYSTEM_STATUS, notificationHeader.systemStatus).map(USER_STATUS, notificationHeader.userStatus)
				.map(PRIORITY, notificationHeader.priority).map(TECHNICAL_OBJECT, notificationHeader.technicalObject)
				.map(PLANT_LOCATION, notificationHeader.plantLocation)
				.map(PLANT_SECTION, notificationHeader.plantSection).map(COST_CENTER, notificationHeader.costCenter)
				.map(PLANNER_GROUP, notificationHeader.plannerGroup)
				.map(MAIN_WORK_CENTER, notificationHeader.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, notificationHeader.workCenterResponsible)
				.map(BREAKDOWN, notificationHeader.breakdown).map(REQUIRED_START, notificationHeader.requiredStart)
				.map(REQUIRED_END, notificationHeader.requiredEnd)
				.map(WORKORDER_HEADER, notificationHeader.workorderHeader)
				.map(RECORD_STATUS, notificationHeader.recordStatus).map(CREATED_DATE, notificationHeader.createdDate)
				.map(CREATED_BY, notificationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, notificationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationHeader> findByNotificationType(NotificationType notificationType, GlobalSearch globalSearch,
			Pageable pageable) {
		QNotificationHeader notificationHeader = QNotificationHeader.notificationHeader;
		JPQLQuery<NotificationHeader> query = from(notificationHeader);
		Assert.notNull(notificationType, "notificationType is required");
		query.where(notificationHeader.notificationType.eq(notificationType));
		Path<?>[] paths = new Path<?>[] { notificationHeader.notificationCode, notificationHeader.notificationType,
				notificationHeader.reportedDate, notificationHeader.reportedBy, notificationHeader.description,
				notificationHeader.longText, notificationHeader.systemStatus, notificationHeader.userStatus,
				notificationHeader.priority, notificationHeader.technicalObject, notificationHeader.plantLocation,
				notificationHeader.plantSection, notificationHeader.costCenter, notificationHeader.plannerGroup,
				notificationHeader.mainWorkCenter, notificationHeader.workCenterResponsible,
				notificationHeader.breakdown, notificationHeader.requiredStart, notificationHeader.requiredEnd,
				notificationHeader.workorderHeader, notificationHeader.recordStatus, notificationHeader.createdDate,
				notificationHeader.createdBy, notificationHeader.lastModifiedDate, notificationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_CODE, notificationHeader.notificationCode)
				.map(NOTIFICATION_TYPE, notificationHeader.notificationType)
				.map(REPORTED_DATE, notificationHeader.reportedDate).map(REPORTED_BY, notificationHeader.reportedBy)
				.map(DESCRIPTION, notificationHeader.description).map(LONG_TEXT, notificationHeader.longText)
				.map(SYSTEM_STATUS, notificationHeader.systemStatus).map(USER_STATUS, notificationHeader.userStatus)
				.map(PRIORITY, notificationHeader.priority).map(TECHNICAL_OBJECT, notificationHeader.technicalObject)
				.map(PLANT_LOCATION, notificationHeader.plantLocation)
				.map(PLANT_SECTION, notificationHeader.plantSection).map(COST_CENTER, notificationHeader.costCenter)
				.map(PLANNER_GROUP, notificationHeader.plannerGroup)
				.map(MAIN_WORK_CENTER, notificationHeader.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, notificationHeader.workCenterResponsible)
				.map(BREAKDOWN, notificationHeader.breakdown).map(REQUIRED_START, notificationHeader.requiredStart)
				.map(REQUIRED_END, notificationHeader.requiredEnd)
				.map(WORKORDER_HEADER, notificationHeader.workorderHeader)
				.map(RECORD_STATUS, notificationHeader.recordStatus).map(CREATED_DATE, notificationHeader.createdDate)
				.map(CREATED_BY, notificationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, notificationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plantLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationHeader> findByPlantLocation(PlantLocation plantLocation, GlobalSearch globalSearch,
			Pageable pageable) {
		QNotificationHeader notificationHeader = QNotificationHeader.notificationHeader;
		JPQLQuery<NotificationHeader> query = from(notificationHeader);
		Assert.notNull(plantLocation, "plantLocation is required");
		query.where(notificationHeader.plantLocation.eq(plantLocation));
		Path<?>[] paths = new Path<?>[] { notificationHeader.notificationCode, notificationHeader.notificationType,
				notificationHeader.reportedDate, notificationHeader.reportedBy, notificationHeader.description,
				notificationHeader.longText, notificationHeader.systemStatus, notificationHeader.userStatus,
				notificationHeader.priority, notificationHeader.technicalObject, notificationHeader.plantLocation,
				notificationHeader.plantSection, notificationHeader.costCenter, notificationHeader.plannerGroup,
				notificationHeader.mainWorkCenter, notificationHeader.workCenterResponsible,
				notificationHeader.breakdown, notificationHeader.requiredStart, notificationHeader.requiredEnd,
				notificationHeader.workorderHeader, notificationHeader.recordStatus, notificationHeader.createdDate,
				notificationHeader.createdBy, notificationHeader.lastModifiedDate, notificationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_CODE, notificationHeader.notificationCode)
				.map(NOTIFICATION_TYPE, notificationHeader.notificationType)
				.map(REPORTED_DATE, notificationHeader.reportedDate).map(REPORTED_BY, notificationHeader.reportedBy)
				.map(DESCRIPTION, notificationHeader.description).map(LONG_TEXT, notificationHeader.longText)
				.map(SYSTEM_STATUS, notificationHeader.systemStatus).map(USER_STATUS, notificationHeader.userStatus)
				.map(PRIORITY, notificationHeader.priority).map(TECHNICAL_OBJECT, notificationHeader.technicalObject)
				.map(PLANT_LOCATION, notificationHeader.plantLocation)
				.map(PLANT_SECTION, notificationHeader.plantSection).map(COST_CENTER, notificationHeader.costCenter)
				.map(PLANNER_GROUP, notificationHeader.plannerGroup)
				.map(MAIN_WORK_CENTER, notificationHeader.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, notificationHeader.workCenterResponsible)
				.map(BREAKDOWN, notificationHeader.breakdown).map(REQUIRED_START, notificationHeader.requiredStart)
				.map(REQUIRED_END, notificationHeader.requiredEnd)
				.map(WORKORDER_HEADER, notificationHeader.workorderHeader)
				.map(RECORD_STATUS, notificationHeader.recordStatus).map(CREATED_DATE, notificationHeader.createdDate)
				.map(CREATED_BY, notificationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, notificationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plantSection
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationHeader> findByPlantSection(PlantSection plantSection, GlobalSearch globalSearch,
			Pageable pageable) {
		QNotificationHeader notificationHeader = QNotificationHeader.notificationHeader;
		JPQLQuery<NotificationHeader> query = from(notificationHeader);
		Assert.notNull(plantSection, "plantSection is required");
		query.where(notificationHeader.plantSection.eq(plantSection));
		Path<?>[] paths = new Path<?>[] { notificationHeader.notificationCode, notificationHeader.notificationType,
				notificationHeader.reportedDate, notificationHeader.reportedBy, notificationHeader.description,
				notificationHeader.longText, notificationHeader.systemStatus, notificationHeader.userStatus,
				notificationHeader.priority, notificationHeader.technicalObject, notificationHeader.plantLocation,
				notificationHeader.plantSection, notificationHeader.costCenter, notificationHeader.plannerGroup,
				notificationHeader.mainWorkCenter, notificationHeader.workCenterResponsible,
				notificationHeader.breakdown, notificationHeader.requiredStart, notificationHeader.requiredEnd,
				notificationHeader.workorderHeader, notificationHeader.recordStatus, notificationHeader.createdDate,
				notificationHeader.createdBy, notificationHeader.lastModifiedDate, notificationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_CODE, notificationHeader.notificationCode)
				.map(NOTIFICATION_TYPE, notificationHeader.notificationType)
				.map(REPORTED_DATE, notificationHeader.reportedDate).map(REPORTED_BY, notificationHeader.reportedBy)
				.map(DESCRIPTION, notificationHeader.description).map(LONG_TEXT, notificationHeader.longText)
				.map(SYSTEM_STATUS, notificationHeader.systemStatus).map(USER_STATUS, notificationHeader.userStatus)
				.map(PRIORITY, notificationHeader.priority).map(TECHNICAL_OBJECT, notificationHeader.technicalObject)
				.map(PLANT_LOCATION, notificationHeader.plantLocation)
				.map(PLANT_SECTION, notificationHeader.plantSection).map(COST_CENTER, notificationHeader.costCenter)
				.map(PLANNER_GROUP, notificationHeader.plannerGroup)
				.map(MAIN_WORK_CENTER, notificationHeader.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, notificationHeader.workCenterResponsible)
				.map(BREAKDOWN, notificationHeader.breakdown).map(REQUIRED_START, notificationHeader.requiredStart)
				.map(REQUIRED_END, notificationHeader.requiredEnd)
				.map(WORKORDER_HEADER, notificationHeader.workorderHeader)
				.map(RECORD_STATUS, notificationHeader.recordStatus).map(CREATED_DATE, notificationHeader.createdDate)
				.map(CREATED_BY, notificationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, notificationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param priority
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationHeader> findByPriority(NotificationPriority priority, GlobalSearch globalSearch,
			Pageable pageable) {
		QNotificationHeader notificationHeader = QNotificationHeader.notificationHeader;
		JPQLQuery<NotificationHeader> query = from(notificationHeader);
		Assert.notNull(priority, "priority is required");
		query.where(notificationHeader.priority.eq(priority));
		Path<?>[] paths = new Path<?>[] { notificationHeader.notificationCode, notificationHeader.notificationType,
				notificationHeader.reportedDate, notificationHeader.reportedBy, notificationHeader.description,
				notificationHeader.longText, notificationHeader.systemStatus, notificationHeader.userStatus,
				notificationHeader.priority, notificationHeader.technicalObject, notificationHeader.plantLocation,
				notificationHeader.plantSection, notificationHeader.costCenter, notificationHeader.plannerGroup,
				notificationHeader.mainWorkCenter, notificationHeader.workCenterResponsible,
				notificationHeader.breakdown, notificationHeader.requiredStart, notificationHeader.requiredEnd,
				notificationHeader.workorderHeader, notificationHeader.recordStatus, notificationHeader.createdDate,
				notificationHeader.createdBy, notificationHeader.lastModifiedDate, notificationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_CODE, notificationHeader.notificationCode)
				.map(NOTIFICATION_TYPE, notificationHeader.notificationType)
				.map(REPORTED_DATE, notificationHeader.reportedDate).map(REPORTED_BY, notificationHeader.reportedBy)
				.map(DESCRIPTION, notificationHeader.description).map(LONG_TEXT, notificationHeader.longText)
				.map(SYSTEM_STATUS, notificationHeader.systemStatus).map(USER_STATUS, notificationHeader.userStatus)
				.map(PRIORITY, notificationHeader.priority).map(TECHNICAL_OBJECT, notificationHeader.technicalObject)
				.map(PLANT_LOCATION, notificationHeader.plantLocation)
				.map(PLANT_SECTION, notificationHeader.plantSection).map(COST_CENTER, notificationHeader.costCenter)
				.map(PLANNER_GROUP, notificationHeader.plannerGroup)
				.map(MAIN_WORK_CENTER, notificationHeader.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, notificationHeader.workCenterResponsible)
				.map(BREAKDOWN, notificationHeader.breakdown).map(REQUIRED_START, notificationHeader.requiredStart)
				.map(REQUIRED_END, notificationHeader.requiredEnd)
				.map(WORKORDER_HEADER, notificationHeader.workorderHeader)
				.map(RECORD_STATUS, notificationHeader.recordStatus).map(CREATED_DATE, notificationHeader.createdDate)
				.map(CREATED_BY, notificationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, notificationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param reportedBy
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationHeader> findByReportedBy(Employee reportedBy, GlobalSearch globalSearch,
			Pageable pageable) {
		QNotificationHeader notificationHeader = QNotificationHeader.notificationHeader;
		JPQLQuery<NotificationHeader> query = from(notificationHeader);
		Assert.notNull(reportedBy, "reportedBy is required");
		query.where(notificationHeader.reportedBy.eq(reportedBy));
		Path<?>[] paths = new Path<?>[] { notificationHeader.notificationCode, notificationHeader.notificationType,
				notificationHeader.reportedDate, notificationHeader.reportedBy, notificationHeader.description,
				notificationHeader.longText, notificationHeader.systemStatus, notificationHeader.userStatus,
				notificationHeader.priority, notificationHeader.technicalObject, notificationHeader.plantLocation,
				notificationHeader.plantSection, notificationHeader.costCenter, notificationHeader.plannerGroup,
				notificationHeader.mainWorkCenter, notificationHeader.workCenterResponsible,
				notificationHeader.breakdown, notificationHeader.requiredStart, notificationHeader.requiredEnd,
				notificationHeader.workorderHeader, notificationHeader.recordStatus, notificationHeader.createdDate,
				notificationHeader.createdBy, notificationHeader.lastModifiedDate, notificationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_CODE, notificationHeader.notificationCode)
				.map(NOTIFICATION_TYPE, notificationHeader.notificationType)
				.map(REPORTED_DATE, notificationHeader.reportedDate).map(REPORTED_BY, notificationHeader.reportedBy)
				.map(DESCRIPTION, notificationHeader.description).map(LONG_TEXT, notificationHeader.longText)
				.map(SYSTEM_STATUS, notificationHeader.systemStatus).map(USER_STATUS, notificationHeader.userStatus)
				.map(PRIORITY, notificationHeader.priority).map(TECHNICAL_OBJECT, notificationHeader.technicalObject)
				.map(PLANT_LOCATION, notificationHeader.plantLocation)
				.map(PLANT_SECTION, notificationHeader.plantSection).map(COST_CENTER, notificationHeader.costCenter)
				.map(PLANNER_GROUP, notificationHeader.plannerGroup)
				.map(MAIN_WORK_CENTER, notificationHeader.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, notificationHeader.workCenterResponsible)
				.map(BREAKDOWN, notificationHeader.breakdown).map(REQUIRED_START, notificationHeader.requiredStart)
				.map(REQUIRED_END, notificationHeader.requiredEnd)
				.map(WORKORDER_HEADER, notificationHeader.workorderHeader)
				.map(RECORD_STATUS, notificationHeader.recordStatus).map(CREATED_DATE, notificationHeader.createdDate)
				.map(CREATED_BY, notificationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, notificationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationHeader> findBySystemStatus(NotificationSystemStatus systemStatus, GlobalSearch globalSearch,
			Pageable pageable) {
		QNotificationHeader notificationHeader = QNotificationHeader.notificationHeader;
		JPQLQuery<NotificationHeader> query = from(notificationHeader);
		Assert.notNull(systemStatus, "systemStatus is required");
		query.where(notificationHeader.systemStatus.eq(systemStatus));
		Path<?>[] paths = new Path<?>[] { notificationHeader.notificationCode, notificationHeader.notificationType,
				notificationHeader.reportedDate, notificationHeader.reportedBy, notificationHeader.description,
				notificationHeader.longText, notificationHeader.systemStatus, notificationHeader.userStatus,
				notificationHeader.priority, notificationHeader.technicalObject, notificationHeader.plantLocation,
				notificationHeader.plantSection, notificationHeader.costCenter, notificationHeader.plannerGroup,
				notificationHeader.mainWorkCenter, notificationHeader.workCenterResponsible,
				notificationHeader.breakdown, notificationHeader.requiredStart, notificationHeader.requiredEnd,
				notificationHeader.workorderHeader, notificationHeader.recordStatus, notificationHeader.createdDate,
				notificationHeader.createdBy, notificationHeader.lastModifiedDate, notificationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_CODE, notificationHeader.notificationCode)
				.map(NOTIFICATION_TYPE, notificationHeader.notificationType)
				.map(REPORTED_DATE, notificationHeader.reportedDate).map(REPORTED_BY, notificationHeader.reportedBy)
				.map(DESCRIPTION, notificationHeader.description).map(LONG_TEXT, notificationHeader.longText)
				.map(SYSTEM_STATUS, notificationHeader.systemStatus).map(USER_STATUS, notificationHeader.userStatus)
				.map(PRIORITY, notificationHeader.priority).map(TECHNICAL_OBJECT, notificationHeader.technicalObject)
				.map(PLANT_LOCATION, notificationHeader.plantLocation)
				.map(PLANT_SECTION, notificationHeader.plantSection).map(COST_CENTER, notificationHeader.costCenter)
				.map(PLANNER_GROUP, notificationHeader.plannerGroup)
				.map(MAIN_WORK_CENTER, notificationHeader.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, notificationHeader.workCenterResponsible)
				.map(BREAKDOWN, notificationHeader.breakdown).map(REQUIRED_START, notificationHeader.requiredStart)
				.map(REQUIRED_END, notificationHeader.requiredEnd)
				.map(WORKORDER_HEADER, notificationHeader.workorderHeader)
				.map(RECORD_STATUS, notificationHeader.recordStatus).map(CREATED_DATE, notificationHeader.createdDate)
				.map(CREATED_BY, notificationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, notificationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationHeader> findByTechnicalObject(TechnicalObject technicalObject, GlobalSearch globalSearch,
			Pageable pageable) {
		QNotificationHeader notificationHeader = QNotificationHeader.notificationHeader;
		JPQLQuery<NotificationHeader> query = from(notificationHeader);
		Assert.notNull(technicalObject, "technicalObject is required");
		query.where(notificationHeader.technicalObject.eq(technicalObject));
		Path<?>[] paths = new Path<?>[] { notificationHeader.notificationCode, notificationHeader.notificationType,
				notificationHeader.reportedDate, notificationHeader.reportedBy, notificationHeader.description,
				notificationHeader.longText, notificationHeader.systemStatus, notificationHeader.userStatus,
				notificationHeader.priority, notificationHeader.technicalObject, notificationHeader.plantLocation,
				notificationHeader.plantSection, notificationHeader.costCenter, notificationHeader.plannerGroup,
				notificationHeader.mainWorkCenter, notificationHeader.workCenterResponsible,
				notificationHeader.breakdown, notificationHeader.requiredStart, notificationHeader.requiredEnd,
				notificationHeader.workorderHeader, notificationHeader.recordStatus, notificationHeader.createdDate,
				notificationHeader.createdBy, notificationHeader.lastModifiedDate, notificationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_CODE, notificationHeader.notificationCode)
				.map(NOTIFICATION_TYPE, notificationHeader.notificationType)
				.map(REPORTED_DATE, notificationHeader.reportedDate).map(REPORTED_BY, notificationHeader.reportedBy)
				.map(DESCRIPTION, notificationHeader.description).map(LONG_TEXT, notificationHeader.longText)
				.map(SYSTEM_STATUS, notificationHeader.systemStatus).map(USER_STATUS, notificationHeader.userStatus)
				.map(PRIORITY, notificationHeader.priority).map(TECHNICAL_OBJECT, notificationHeader.technicalObject)
				.map(PLANT_LOCATION, notificationHeader.plantLocation)
				.map(PLANT_SECTION, notificationHeader.plantSection).map(COST_CENTER, notificationHeader.costCenter)
				.map(PLANNER_GROUP, notificationHeader.plannerGroup)
				.map(MAIN_WORK_CENTER, notificationHeader.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, notificationHeader.workCenterResponsible)
				.map(BREAKDOWN, notificationHeader.breakdown).map(REQUIRED_START, notificationHeader.requiredStart)
				.map(REQUIRED_END, notificationHeader.requiredEnd)
				.map(WORKORDER_HEADER, notificationHeader.workorderHeader)
				.map(RECORD_STATUS, notificationHeader.recordStatus).map(CREATED_DATE, notificationHeader.createdDate)
				.map(CREATED_BY, notificationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, notificationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param userStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationHeader> findByUserStatus(NotificationUserStatusWithNumber userStatus,
			GlobalSearch globalSearch, Pageable pageable) {
		QNotificationHeader notificationHeader = QNotificationHeader.notificationHeader;
		JPQLQuery<NotificationHeader> query = from(notificationHeader);
		Assert.notNull(userStatus, "userStatus is required");
		query.where(notificationHeader.userStatus.eq(userStatus));
		Path<?>[] paths = new Path<?>[] { notificationHeader.notificationCode, notificationHeader.notificationType,
				notificationHeader.reportedDate, notificationHeader.reportedBy, notificationHeader.description,
				notificationHeader.longText, notificationHeader.systemStatus, notificationHeader.userStatus,
				notificationHeader.priority, notificationHeader.technicalObject, notificationHeader.plantLocation,
				notificationHeader.plantSection, notificationHeader.costCenter, notificationHeader.plannerGroup,
				notificationHeader.mainWorkCenter, notificationHeader.workCenterResponsible,
				notificationHeader.breakdown, notificationHeader.requiredStart, notificationHeader.requiredEnd,
				notificationHeader.workorderHeader, notificationHeader.recordStatus, notificationHeader.createdDate,
				notificationHeader.createdBy, notificationHeader.lastModifiedDate, notificationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_CODE, notificationHeader.notificationCode)
				.map(NOTIFICATION_TYPE, notificationHeader.notificationType)
				.map(REPORTED_DATE, notificationHeader.reportedDate).map(REPORTED_BY, notificationHeader.reportedBy)
				.map(DESCRIPTION, notificationHeader.description).map(LONG_TEXT, notificationHeader.longText)
				.map(SYSTEM_STATUS, notificationHeader.systemStatus).map(USER_STATUS, notificationHeader.userStatus)
				.map(PRIORITY, notificationHeader.priority).map(TECHNICAL_OBJECT, notificationHeader.technicalObject)
				.map(PLANT_LOCATION, notificationHeader.plantLocation)
				.map(PLANT_SECTION, notificationHeader.plantSection).map(COST_CENTER, notificationHeader.costCenter)
				.map(PLANNER_GROUP, notificationHeader.plannerGroup)
				.map(MAIN_WORK_CENTER, notificationHeader.mainWorkCenter)
				.map(WORK_CENTER_RESPONSIBLE, notificationHeader.workCenterResponsible)
				.map(BREAKDOWN, notificationHeader.breakdown).map(REQUIRED_START, notificationHeader.requiredStart)
				.map(REQUIRED_END, notificationHeader.requiredEnd)
				.map(WORKORDER_HEADER, notificationHeader.workorderHeader)
				.map(RECORD_STATUS, notificationHeader.recordStatus).map(CREATED_DATE, notificationHeader.createdDate)
				.map(CREATED_BY, notificationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, notificationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationHeader);
	}
}
