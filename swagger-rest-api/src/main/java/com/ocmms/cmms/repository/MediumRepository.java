package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.measuringpoint.Medium;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MediumRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "medium", path = "medium")
public interface MediumRepository extends  MediumRepositoryCustom,
		PagingAndSortingRepository<Medium, Long>{
}
