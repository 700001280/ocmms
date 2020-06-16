package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskHeader;

import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TaskHeaderRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface TaskHeaderRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskHeader> findByTechnicalObject(TechnicalObject technicalObject, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskHeader> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskHeader> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
