package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.configuration.ShaftType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ShaftTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "shafttype", path = "shafttype")
public interface ShaftTypeRepository extends  ShaftTypeRepositoryCustom,
		PagingAndSortingRepository<ShaftType, Long>  {
}
