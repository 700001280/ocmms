package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationItem;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = NotificationItemRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "notificationitem", path = "notificationitem")
public interface NotificationItemRepository extends  NotificationItemRepositoryCustom,
		PagingAndSortingRepository<NotificationItem, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeader
	 * @return Long
	 */
	public abstract long countByNotificationHeader(NotificationHeader notificationHeader);
}
