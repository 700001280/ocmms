package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.City;
import com.ocmms.cmms.model.common.Province;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CityRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRepository extends  CityRepositoryCustom,
		PagingAndSortingRepository<City, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param province
	 * @return Long
	 */
	public abstract long countByProvince(Province province);
}
