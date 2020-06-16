package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = FunctionalLocationRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "functionallocation", path = "functionallocation")
public interface FunctionalLocationRepository extends  FunctionalLocationRepositoryCustom,
		PagingAndSortingRepository<FunctionalLocation, Long>  {
}
