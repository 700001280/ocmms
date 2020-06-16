package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskOperationMaterial;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskOperationMaterialRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "taskoperationmaterial", path = "taskoperationmaterial")
public interface TaskOperationMaterialRepository extends  TaskOperationMaterialRepositoryCustom,
		PagingAndSortingRepository<TaskOperationMaterial, Long>  {
}
