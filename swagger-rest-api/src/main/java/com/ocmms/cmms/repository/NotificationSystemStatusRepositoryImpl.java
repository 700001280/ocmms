package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationSystemStatus;
import com.ocmms.cmms.model.pm.notification.QNotificationSystemStatus;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = NotificationSystemStatusRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class NotificationSystemStatusRepositoryImpl extends QueryDslRepositorySupportExt<NotificationSystemStatus>
		implements NotificationSystemStatusRepositoryCustom {

	/**
	 * Default constructor
	 */
	NotificationSystemStatusRepositoryImpl() {
		super(NotificationSystemStatus.class);
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
	public static final String CODE = "code";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

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
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationSystemStatus> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QNotificationSystemStatus notificationSystemStatus = QNotificationSystemStatus.notificationSystemStatus;
		JPQLQuery<NotificationSystemStatus> query = from(notificationSystemStatus);
		Path<?>[] paths = new Path<?>[] { notificationSystemStatus.code, notificationSystemStatus.description,
				notificationSystemStatus.recordStatus, notificationSystemStatus.createdDate,
				notificationSystemStatus.createdBy, notificationSystemStatus.lastModifiedDate,
				notificationSystemStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, notificationSystemStatus.code)
				.map(DESCRIPTION, notificationSystemStatus.description)
				.map(RECORD_STATUS, notificationSystemStatus.recordStatus)
				.map(CREATED_DATE, notificationSystemStatus.createdDate)
				.map(CREATED_BY, notificationSystemStatus.createdBy)
				.map(LAST_MODIFIED_DATE, notificationSystemStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationSystemStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationSystemStatus);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationSystemStatus> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QNotificationSystemStatus notificationSystemStatus = QNotificationSystemStatus.notificationSystemStatus;
		JPQLQuery<NotificationSystemStatus> query = from(notificationSystemStatus);
		Path<?>[] paths = new Path<?>[] { notificationSystemStatus.code, notificationSystemStatus.description,
				notificationSystemStatus.recordStatus, notificationSystemStatus.createdDate,
				notificationSystemStatus.createdBy, notificationSystemStatus.lastModifiedDate,
				notificationSystemStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(notificationSystemStatus.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, notificationSystemStatus.code)
				.map(DESCRIPTION, notificationSystemStatus.description)
				.map(RECORD_STATUS, notificationSystemStatus.recordStatus)
				.map(CREATED_DATE, notificationSystemStatus.createdDate)
				.map(CREATED_BY, notificationSystemStatus.createdBy)
				.map(LAST_MODIFIED_DATE, notificationSystemStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationSystemStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationSystemStatus);
	}
}
