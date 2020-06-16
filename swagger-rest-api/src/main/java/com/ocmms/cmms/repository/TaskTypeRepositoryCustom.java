package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TaskTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface TaskTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
