package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskHeaderText;

import com.ocmms.cmms.model.pm.task.TaskHeader;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TaskHeaderTextRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface TaskHeaderTextRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskHeader
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskHeaderText> findByTaskHeader(TaskHeader taskHeader, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskHeaderText> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskHeaderText> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
