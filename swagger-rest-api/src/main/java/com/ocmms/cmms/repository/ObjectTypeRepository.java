package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.configuration.ObjectType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ObjectTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "objecttype", path = "objecttype")
public interface ObjectTypeRepository extends  ObjectTypeRepositoryCustom,
		PagingAndSortingRepository<ObjectType, Long>  {
}
