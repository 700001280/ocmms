package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationSystemStatus;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = NotificationSystemStatusRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "notificationsystemstatus", path = "notificationsystemstatus")
public interface NotificationSystemStatusRepository extends  NotificationSystemStatusRepositoryCustom,
		PagingAndSortingRepository<NotificationSystemStatus, Long> {
}
