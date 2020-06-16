package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.ProjectMemo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProjectMemoRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "projectmemo", path = "projectmemo")
public interface ProjectMemoRepository extends  ProjectMemoRepositoryCustom,
		PagingAndSortingRepository<ProjectMemo, Long>  {
}
