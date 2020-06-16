package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Region;
import com.ocmms.cmms.model.common.Country;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = RegionRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "region", path = "region")
public interface RegionRepository extends  RegionRepositoryCustom,
		PagingAndSortingRepository<Region, Long>{

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param country
	 * @return Long
	 */
	public abstract long countByCountry(Country country);
}
