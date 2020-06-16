package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithoutNumber;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = NotificationUserStatusWithoutNumberRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "notificationuserstatuswithoutnumber", path = "notificationuserstatuswithoutnumber")
public interface NotificationUserStatusWithoutNumberRepository extends  NotificationUserStatusWithoutNumberRepositoryCustom,
		PagingAndSortingRepository<NotificationUserStatusWithoutNumber, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeaders
	 * @return Long
	 */
	public abstract long countByNotificationHeadersContains(NotificationHeader notificationHeaders);
}
