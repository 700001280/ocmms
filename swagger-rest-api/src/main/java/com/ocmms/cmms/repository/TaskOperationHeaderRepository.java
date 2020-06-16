package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskOperationHeader;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskOperationHeaderRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "taskoperationheader", path = "taskoperationheader")
public interface TaskOperationHeaderRepository extends  TaskOperationHeaderRepositoryCustom,
		PagingAndSortingRepository<TaskOperationHeader, Long>{
}
