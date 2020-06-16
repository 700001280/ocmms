package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.mm.master.MaterialType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "materialtype", path = "materialtype")
public interface MaterialTypeRepository extends  MaterialTypeRepositoryCustom,
		PagingAndSortingRepository<MaterialType, Long>  {
}
