package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.task.TaskActivityType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskActivityTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "taskactivitytype", path = "taskactivitytype")
public interface TaskActivityTypeRepository extends  TaskActivityTypeRepositoryCustom,
		PagingAndSortingRepository<TaskActivityType, Long>  {
}
