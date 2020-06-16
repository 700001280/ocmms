package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationItem;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.notification.QNotificationItem;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = NotificationItemRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class NotificationItemRepositoryImpl extends QueryDslRepositorySupportExt<NotificationItem>
		implements NotificationItemRepositoryCustom {

	/**
	 * Default constructor
	 */
	NotificationItemRepositoryImpl() {
		super(NotificationItem.class);
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
	public static final String FAILURE_DAMAGE_CAUSE = "failureDamageCause";

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
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FAILURE_OBJECT_PART = "failureObjectPart";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FAILURE_DESCRIPTION = "failureDescription";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EXECUTION_FACTOR = "executionFactor";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NOTIFICATION_HEADER = "notificationHeader";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FAILURE_DAMAGE_TYPE = "failureDamageType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CAUSE_OF_DAMAGE = "causeOfDamage";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACTIVITY = "activity";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationItem> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QNotificationItem notificationItem = QNotificationItem.notificationItem;
		JPQLQuery<NotificationItem> query = from(notificationItem);
		Path<?>[] paths = new Path<?>[] { notificationItem.notificationHeader, notificationItem.failureObjectPart,
				notificationItem.failureDamageType, notificationItem.failureDamageCause,
				notificationItem.failureDescription, notificationItem.activity, notificationItem.executionFactor,
				notificationItem.causeOfDamage, notificationItem.memo, notificationItem.recordStatus,
				notificationItem.createdDate, notificationItem.createdBy, notificationItem.lastModifiedDate,
				notificationItem.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_HEADER, notificationItem.notificationHeader)
				.map(FAILURE_OBJECT_PART, notificationItem.failureObjectPart)
				.map(FAILURE_DAMAGE_TYPE, notificationItem.failureDamageType)
				.map(FAILURE_DAMAGE_CAUSE, notificationItem.failureDamageCause)
				.map(FAILURE_DESCRIPTION, notificationItem.failureDescription).map(ACTIVITY, notificationItem.activity)
				.map(EXECUTION_FACTOR, notificationItem.executionFactor)
				.map(CAUSE_OF_DAMAGE, notificationItem.causeOfDamage).map(MEMO, notificationItem.memo)
				.map(RECORD_STATUS, notificationItem.recordStatus).map(CREATED_DATE, notificationItem.createdDate)
				.map(CREATED_BY, notificationItem.createdBy).map(LAST_MODIFIED_DATE, notificationItem.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationItem.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationItem);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationItem> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QNotificationItem notificationItem = QNotificationItem.notificationItem;
		JPQLQuery<NotificationItem> query = from(notificationItem);
		Path<?>[] paths = new Path<?>[] { notificationItem.notificationHeader, notificationItem.failureObjectPart,
				notificationItem.failureDamageType, notificationItem.failureDamageCause,
				notificationItem.failureDescription, notificationItem.activity, notificationItem.executionFactor,
				notificationItem.causeOfDamage, notificationItem.memo, notificationItem.recordStatus,
				notificationItem.createdDate, notificationItem.createdBy, notificationItem.lastModifiedDate,
				notificationItem.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(notificationItem.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_HEADER, notificationItem.notificationHeader)
				.map(FAILURE_OBJECT_PART, notificationItem.failureObjectPart)
				.map(FAILURE_DAMAGE_TYPE, notificationItem.failureDamageType)
				.map(FAILURE_DAMAGE_CAUSE, notificationItem.failureDamageCause)
				.map(FAILURE_DESCRIPTION, notificationItem.failureDescription).map(ACTIVITY, notificationItem.activity)
				.map(EXECUTION_FACTOR, notificationItem.executionFactor)
				.map(CAUSE_OF_DAMAGE, notificationItem.causeOfDamage).map(MEMO, notificationItem.memo)
				.map(RECORD_STATUS, notificationItem.recordStatus).map(CREATED_DATE, notificationItem.createdDate)
				.map(CREATED_BY, notificationItem.createdBy).map(LAST_MODIFIED_DATE, notificationItem.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationItem.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationItem);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeader
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationItem> findByNotificationHeader(NotificationHeader notificationHeader,
			GlobalSearch globalSearch, Pageable pageable) {
		QNotificationItem notificationItem = QNotificationItem.notificationItem;
		JPQLQuery<NotificationItem> query = from(notificationItem);
		Assert.notNull(notificationHeader, "notificationHeader is required");
		query.where(notificationItem.notificationHeader.eq(notificationHeader));
		Path<?>[] paths = new Path<?>[] { notificationItem.notificationHeader, notificationItem.failureObjectPart,
				notificationItem.failureDamageType, notificationItem.failureDamageCause,
				notificationItem.failureDescription, notificationItem.activity, notificationItem.executionFactor,
				notificationItem.causeOfDamage, notificationItem.memo, notificationItem.recordStatus,
				notificationItem.createdDate, notificationItem.createdBy, notificationItem.lastModifiedDate,
				notificationItem.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(NOTIFICATION_HEADER, notificationItem.notificationHeader)
				.map(FAILURE_OBJECT_PART, notificationItem.failureObjectPart)
				.map(FAILURE_DAMAGE_TYPE, notificationItem.failureDamageType)
				.map(FAILURE_DAMAGE_CAUSE, notificationItem.failureDamageCause)
				.map(FAILURE_DESCRIPTION, notificationItem.failureDescription).map(ACTIVITY, notificationItem.activity)
				.map(EXECUTION_FACTOR, notificationItem.executionFactor)
				.map(CAUSE_OF_DAMAGE, notificationItem.causeOfDamage).map(MEMO, notificationItem.memo)
				.map(RECORD_STATUS, notificationItem.recordStatus).map(CREATED_DATE, notificationItem.createdDate)
				.map(CREATED_BY, notificationItem.createdBy).map(LAST_MODIFIED_DATE, notificationItem.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationItem.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationItem);
	}
}
