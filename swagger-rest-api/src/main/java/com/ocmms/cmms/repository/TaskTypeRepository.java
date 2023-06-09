package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "tasktype", path = "tasktype")
public interface TaskTypeRepository extends  TaskTypeRepositoryCustom,
		PagingAndSortingRepository<TaskType, Long>  {
}
