package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithoutNumber;

import com.ocmms.cmms.model.pm.notification.NotificationHeader;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = NotificationUserStatusWithoutNumberRepositoryCustom TODO Auto-generated
 * class documentation
 *
 */

public interface NotificationUserStatusWithoutNumberRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeaders
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationUserStatusWithoutNumber> findByNotificationHeadersContains(
			NotificationHeader notificationHeaders, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationUserStatusWithoutNumber> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationUserStatusWithoutNumber> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
