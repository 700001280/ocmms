package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = NotificationTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface NotificationTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
