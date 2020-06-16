package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskActivityType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TaskActivityTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface TaskActivityTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskActivityType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskActivityType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
