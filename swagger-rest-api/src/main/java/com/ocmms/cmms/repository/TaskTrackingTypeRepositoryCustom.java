package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTrackingType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TaskTrackingTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface TaskTrackingTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskTrackingType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskTrackingType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
