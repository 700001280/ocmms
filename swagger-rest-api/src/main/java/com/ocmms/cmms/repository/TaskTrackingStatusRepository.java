package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTrackingStatus;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskTrackingStatusRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "tasktrackingstatus", path = "tasktrackingstatus")
public interface TaskTrackingStatusRepository extends  TaskTrackingStatusRepositoryCustom,
		PagingAndSortingRepository<TaskTrackingStatus, Long> {
}
