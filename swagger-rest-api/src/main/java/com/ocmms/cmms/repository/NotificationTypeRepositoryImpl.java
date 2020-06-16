package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationType;
import com.ocmms.cmms.model.pm.notification.QNotificationType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = NotificationTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class NotificationTypeRepositoryImpl extends QueryDslRepositorySupportExt<NotificationType>
		implements NotificationTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	NotificationTypeRepositoryImpl() {
		super(NotificationType.class);
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
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TYPE = "type";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QNotificationType notificationType = QNotificationType.notificationType;
		JPQLQuery<NotificationType> query = from(notificationType);
		Path<?>[] paths = new Path<?>[] { notificationType.code, notificationType.type, notificationType.description,
				notificationType.recordStatus, notificationType.createdDate, notificationType.createdBy,
				notificationType.lastModifiedDate, notificationType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, notificationType.code)
				.map(TYPE, notificationType.type).map(DESCRIPTION, notificationType.description)
				.map(RECORD_STATUS, notificationType.recordStatus).map(CREATED_DATE, notificationType.createdDate)
				.map(CREATED_BY, notificationType.createdBy).map(LAST_MODIFIED_DATE, notificationType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<NotificationType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QNotificationType notificationType = QNotificationType.notificationType;
		JPQLQuery<NotificationType> query = from(notificationType);
		Path<?>[] paths = new Path<?>[] { notificationType.code, notificationType.type, notificationType.description,
				notificationType.recordStatus, notificationType.createdDate, notificationType.createdBy,
				notificationType.lastModifiedDate, notificationType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(notificationType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, notificationType.code)
				.map(TYPE, notificationType.type).map(DESCRIPTION, notificationType.description)
				.map(RECORD_STATUS, notificationType.recordStatus).map(CREATED_DATE, notificationType.createdDate)
				.map(CREATED_BY, notificationType.createdBy).map(LAST_MODIFIED_DATE, notificationType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, notificationType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, notificationType);
	}
}
