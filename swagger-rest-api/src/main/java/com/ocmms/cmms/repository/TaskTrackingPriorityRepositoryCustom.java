package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTrackingPriority;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TaskTrackingPriorityRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface TaskTrackingPriorityRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskTrackingPriority> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskTrackingPriority> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
