package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.mm.master.InstockType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = InstockTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "instocktype", path = "instocktype")
public interface InstockTypeRepository extends  InstockTypeRepositoryCustom,
		PagingAndSortingRepository<InstockType, Long> {
}
