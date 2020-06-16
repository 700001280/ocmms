package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.hrm.Organization;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PlantLocationRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "plantlocation", path = "plantlocation")
public interface PlantLocationRepository extends  PlantLocationRepositoryCustom,
		PagingAndSortingRepository<PlantLocation, Long>{

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);
}
