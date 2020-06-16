package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationItem;

import com.ocmms.cmms.model.pm.notification.NotificationHeader;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = NotificationItemRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface NotificationItemRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeader
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationItem> findByNotificationHeader(NotificationHeader notificationHeader,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationItem> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationItem> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
