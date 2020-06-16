package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTrackingType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskTrackingTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "tasktrackingtype", path = "tasktrackingtype")
public interface TaskTrackingTypeRepository extends  TaskTrackingTypeRepositoryCustom,
		PagingAndSortingRepository<TaskTrackingType, Long> {
}
