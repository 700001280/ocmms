package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = NotificationUserStatusWithNumberRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "notificationuserstatuswithnumber", path = "notificationuserstatuswithnumber")
public interface NotificationUserStatusWithNumberRepository extends  NotificationUserStatusWithNumberRepositoryCustom,
		PagingAndSortingRepository<NotificationUserStatusWithNumber, Long>  {
}
