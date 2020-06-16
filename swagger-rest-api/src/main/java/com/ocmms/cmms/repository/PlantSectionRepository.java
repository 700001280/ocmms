package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.hrm.Organization;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PlantSectionRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "plantsection", path = "plantsection")
public interface PlantSectionRepository extends  PlantSectionRepositoryCustom,
		PagingAndSortingRepository<PlantSection, Long>{

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);
}
