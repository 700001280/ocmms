package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.task.TaskHeader;

import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskHeaderRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "taskheader", path = "taskheader")
public interface TaskHeaderRepository extends  TaskHeaderRepositoryCustom,
		PagingAndSortingRepository<TaskHeader, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @return Long
	 */
	public abstract long countByTechnicalObject(TechnicalObject technicalObject);
}
