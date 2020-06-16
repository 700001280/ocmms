package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTrackingPriority;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskTrackingPriorityRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "tasktrackingpriority", path = "tasktrackingpriority")
public interface TaskTrackingPriorityRepository extends  TaskTrackingPriorityRepositoryCustom,
		PagingAndSortingRepository<TaskTrackingPriority, Long>  {
}
