package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithoutNumber;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.notification.QNotificationUserStatusWithoutNumber;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = NotificationUserStatusWithoutNumberRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class NotificationUserStatusWithoutNumberRepositoryImpl
		extends QueryDslRepositorySupportExt<NotificationUserStatusWithoutNumber>
		implements NotificationUserStatusWithoutNumberRepositoryCustom {

	/**
	 * Default constructor
	 */
	NotificationUserStatusWithoutNumberRepositoryImpl() {
		super(NotificationUserStatusWithoutNumber.class);
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
	public Page<NotificationUserStatusWithoutNumber> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QNotificationUserStatusWithoutNumber notificationUserStatusWithoutNumber = QNotificationUserStatusWithoutNumber.notificationUserStatusWithoutNumber;
		JPQLQuery<NotificationUserStatusWithoutNumber> query = from(notificationUserStatusWithoutNumber);
		Path<?>[] paths = new Path<?>[] { notificationUserStatusWithoutNumber.code,
				notificationUserStatusWithoutNumber.description, notificationUserStatusWithoutNumber.recordStatus,
				notificationUserStatusWithoutNumber.createdDate, notificationUserStatusWithoutNumber.createdBy,
				notificationUserStatusWithoutNumber.lastModifiedDate,
				notificationUserStatusWithoutNumber.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, notificationUserStatusWithoutNumber.code)
				.map(DESCRIPTION, notificationUserStatusWithoutNumber.description)
				.map(RECORD_STATUS, notificationUserStatusWithoutNumber.recordStatus)
				.map(CREATED_DATE, notificationUserStatusWithoutNumber.createdDate)
				.map(CREATED_BY, notificationUserStatusWithoutNumber.createdBy)
				.map(LAST_MODIFIED_DATE, notificationUserStatusWithoutNumber.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationUserStatusWithoutNumber.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationUserStatusWithoutNumber);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationUserStatusWithoutNumber> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QNotificationUserStatusWithoutNumber notificationUserStatusWithoutNumber = QNotificationUserStatusWithoutNumber.notificationUserStatusWithoutNumber;
		JPQLQuery<NotificationUserStatusWithoutNumber> query = from(notificationUserStatusWithoutNumber);
		Path<?>[] paths = new Path<?>[] { notificationUserStatusWithoutNumber.code,
				notificationUserStatusWithoutNumber.description, notificationUserStatusWithoutNumber.recordStatus,
				notificationUserStatusWithoutNumber.createdDate, notificationUserStatusWithoutNumber.createdBy,
				notificationUserStatusWithoutNumber.lastModifiedDate,
				notificationUserStatusWithoutNumber.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(notificationUserStatusWithoutNumber.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, notificationUserStatusWithoutNumber.code)
				.map(DESCRIPTION, notificationUserStatusWithoutNumber.description)
				.map(RECORD_STATUS, notificationUserStatusWithoutNumber.recordStatus)
				.map(CREATED_DATE, notificationUserStatusWithoutNumber.createdDate)
				.map(CREATED_BY, notificationUserStatusWithoutNumber.createdBy)
				.map(LAST_MODIFIED_DATE, notificationUserStatusWithoutNumber.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationUserStatusWithoutNumber.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationUserStatusWithoutNumber);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeaders
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationUserStatusWithoutNumber> findByNotificationHeadersContains(
			NotificationHeader notificationHeaders, GlobalSearch globalSearch, Pageable pageable) {
		QNotificationUserStatusWithoutNumber notificationUserStatusWithoutNumber = QNotificationUserStatusWithoutNumber.notificationUserStatusWithoutNumber;
		JPQLQuery<NotificationUserStatusWithoutNumber> query = from(notificationUserStatusWithoutNumber);
		Assert.notNull(notificationHeaders, "notificationHeaders is required");
		query.where(notificationUserStatusWithoutNumber.notificationHeaders.contains(notificationHeaders));
		Path<?>[] paths = new Path<?>[] { notificationUserStatusWithoutNumber.code,
				notificationUserStatusWithoutNumber.description, notificationUserStatusWithoutNumber.recordStatus,
				notificationUserStatusWithoutNumber.createdDate, notificationUserStatusWithoutNumber.createdBy,
				notificationUserStatusWithoutNumber.lastModifiedDate,
				notificationUserStatusWithoutNumber.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, notificationUserStatusWithoutNumber.code)
				.map(DESCRIPTION, notificationUserStatusWithoutNumber.description)
				.map(RECORD_STATUS, notificationUserStatusWithoutNumber.recordStatus)
				.map(CREATED_DATE, notificationUserStatusWithoutNumber.createdDate)
				.map(CREATED_BY, notificationUserStatusWithoutNumber.createdBy)
				.map(LAST_MODIFIED_DATE, notificationUserStatusWithoutNumber.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationUserStatusWithoutNumber.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationUserStatusWithoutNumber);
	}
}
