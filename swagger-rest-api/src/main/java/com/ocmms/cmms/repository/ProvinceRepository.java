package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Province;

import com.ocmms.cmms.model.common.Region;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProvinceRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "province", path = "province")
public interface ProvinceRepository extends  ProvinceRepositoryCustom,
		PagingAndSortingRepository<Province, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param region
	 * @return Long
	 */
	public abstract long countByRegion(Region region);
}
