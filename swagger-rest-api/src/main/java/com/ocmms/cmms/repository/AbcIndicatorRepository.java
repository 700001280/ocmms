package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.configuration.AbcIndicator;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AbcIndicatorRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "abcindicator", path = "abcindicator")
public interface AbcIndicatorRepository extends  AbcIndicatorRepositoryCustom,
		PagingAndSortingRepository<AbcIndicator, Long>{
}
