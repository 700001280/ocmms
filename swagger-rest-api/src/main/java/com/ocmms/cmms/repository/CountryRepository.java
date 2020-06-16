package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Country;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CountryRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface CountryRepository extends  CountryRepositoryCustom,
		PagingAndSortingRepository<Country, Long>{
}
