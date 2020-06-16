package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationPriority;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = NotificationPriorityRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "notificationpriority", path = "notificationpriority")
public interface NotificationPriorityRepository extends  NotificationPriorityRepositoryCustom,
		PagingAndSortingRepository<NotificationPriority, Long> {
}
