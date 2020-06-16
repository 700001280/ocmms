package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.PlantLocation;

import com.ocmms.cmms.model.hrm.Organization;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PlantLocationRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface PlantLocationRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlantLocation> findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlantLocation> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlantLocation> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
