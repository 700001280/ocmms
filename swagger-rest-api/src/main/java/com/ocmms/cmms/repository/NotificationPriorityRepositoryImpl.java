package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import com.ocmms.cmms.model.pm.notification.QNotificationPriority;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = NotificationPriorityRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class NotificationPriorityRepositoryImpl extends QueryDslRepositorySupportExt<NotificationPriority>
		implements NotificationPriorityRepositoryCustom {

	/**
	 * Default constructor
	 */
	NotificationPriorityRepositoryImpl() {
		super(NotificationPriority.class);
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
	public static final String COMPLETE = "complete";

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
	public static final String SCHEDULE = "schedule";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NOTIFICATION_TYPE = "notificationType";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationPriority> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QNotificationPriority notificationPriority = QNotificationPriority.notificationPriority;
		JPQLQuery<NotificationPriority> query = from(notificationPriority);
		Path<?>[] paths = new Path<?>[] { notificationPriority.priority, notificationPriority.schedule,
				notificationPriority.complete, notificationPriority.notificationType, notificationPriority.recordStatus,
				notificationPriority.createdDate, notificationPriority.createdBy, notificationPriority.lastModifiedDate,
				notificationPriority.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PRIORITY, notificationPriority.priority)
				.map(SCHEDULE, notificationPriority.schedule).map(COMPLETE, notificationPriority.complete)
				.map(NOTIFICATION_TYPE, notificationPriority.notificationType)
				.map(RECORD_STATUS, notificationPriority.recordStatus)
				.map(CREATED_DATE, notificationPriority.createdDate).map(CREATED_BY, notificationPriority.createdBy)
				.map(LAST_MODIFIED_DATE, notificationPriority.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationPriority.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationPriority);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationPriority> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QNotificationPriority notificationPriority = QNotificationPriority.notificationPriority;
		JPQLQuery<NotificationPriority> query = from(notificationPriority);
		Path<?>[] paths = new Path<?>[] { notificationPriority.priority, notificationPriority.schedule,
				notificationPriority.complete, notificationPriority.notificationType, notificationPriority.recordStatus,
				notificationPriority.createdDate, notificationPriority.createdBy, notificationPriority.lastModifiedDate,
				notificationPriority.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(notificationPriority.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(PRIORITY, notificationPriority.priority)
				.map(SCHEDULE, notificationPriority.schedule).map(COMPLETE, notificationPriority.complete)
				.map(NOTIFICATION_TYPE, notificationPriority.notificationType)
				.map(RECORD_STATUS, notificationPriority.recordStatus)
				.map(CREATED_DATE, notificationPriority.createdDate).map(CREATED_BY, notificationPriority.createdBy)
				.map(LAST_MODIFIED_DATE, notificationPriority.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationPriority.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationPriority);
	}
}
