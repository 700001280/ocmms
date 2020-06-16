package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;
import com.ocmms.cmms.model.pm.notification.QNotificationUserStatusWithNumber;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = NotificationUserStatusWithNumberRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class NotificationUserStatusWithNumberRepositoryImpl
		extends QueryDslRepositorySupportExt<NotificationUserStatusWithNumber>
		implements NotificationUserStatusWithNumberRepositoryCustom {

	/**
	 * Default constructor
	 */
	NotificationUserStatusWithNumberRepositoryImpl() {
		super(NotificationUserStatusWithNumber.class);
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
	public Page<NotificationUserStatusWithNumber> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QNotificationUserStatusWithNumber notificationUserStatusWithNumber = QNotificationUserStatusWithNumber.notificationUserStatusWithNumber;
		JPQLQuery<NotificationUserStatusWithNumber> query = from(notificationUserStatusWithNumber);
		Path<?>[] paths = new Path<?>[] { notificationUserStatusWithNumber.code,
				notificationUserStatusWithNumber.description, notificationUserStatusWithNumber.recordStatus,
				notificationUserStatusWithNumber.createdDate, notificationUserStatusWithNumber.createdBy,
				notificationUserStatusWithNumber.lastModifiedDate, notificationUserStatusWithNumber.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, notificationUserStatusWithNumber.code)
				.map(DESCRIPTION, notificationUserStatusWithNumber.description)
				.map(RECORD_STATUS, notificationUserStatusWithNumber.recordStatus)
				.map(CREATED_DATE, notificationUserStatusWithNumber.createdDate)
				.map(CREATED_BY, notificationUserStatusWithNumber.createdBy)
				.map(LAST_MODIFIED_DATE, notificationUserStatusWithNumber.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationUserStatusWithNumber.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationUserStatusWithNumber);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationUserStatusWithNumber> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QNotificationUserStatusWithNumber notificationUserStatusWithNumber = QNotificationUserStatusWithNumber.notificationUserStatusWithNumber;
		JPQLQuery<NotificationUserStatusWithNumber> query = from(notificationUserStatusWithNumber);
		Path<?>[] paths = new Path<?>[] { notificationUserStatusWithNumber.code,
				notificationUserStatusWithNumber.description, notificationUserStatusWithNumber.recordStatus,
				notificationUserStatusWithNumber.createdDate, notificationUserStatusWithNumber.createdBy,
				notificationUserStatusWithNumber.lastModifiedDate, notificationUserStatusWithNumber.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(notificationUserStatusWithNumber.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, notificationUserStatusWithNumber.code)
				.map(DESCRIPTION, notificationUserStatusWithNumber.description)
				.map(RECORD_STATUS, notificationUserStatusWithNumber.recordStatus)
				.map(CREATED_DATE, notificationUserStatusWithNumber.createdDate)
				.map(CREATED_BY, notificationUserStatusWithNumber.createdBy)
				.map(LAST_MODIFIED_DATE, notificationUserStatusWithNumber.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationUserStatusWithNumber.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationUserStatusWithNumber);
	}
}
