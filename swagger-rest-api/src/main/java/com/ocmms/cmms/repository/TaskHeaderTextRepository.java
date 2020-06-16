package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskHeaderText;
import com.ocmms.cmms.model.pm.task.TaskHeader;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskHeaderTextRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "taskheadertext", path = "taskheadertext")
public interface TaskHeaderTextRepository extends  TaskHeaderTextRepositoryCustom,
		PagingAndSortingRepository<TaskHeaderText, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskHeader
	 * @return Long
	 */
	public abstract long countByTaskHeader(TaskHeader taskHeader);
}
