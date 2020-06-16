package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.TreeMenu;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TreeMenuRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "treemenu", path = "treemenu")
public interface TreeMenuRepository extends  TreeMenuRepositoryCustom,
		PagingAndSortingRepository<TreeMenu, Long>  {
}
