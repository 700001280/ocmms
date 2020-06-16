package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = NotificationUserStatusWithNumberRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface NotificationUserStatusWithNumberRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationUserStatusWithNumber> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationUserStatusWithNumber> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
