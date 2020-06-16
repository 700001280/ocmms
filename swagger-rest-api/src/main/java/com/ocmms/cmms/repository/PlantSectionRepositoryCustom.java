package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.PlantSection;

import com.ocmms.cmms.model.hrm.Organization;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PlantSectionRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface PlantSectionRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlantSection> findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlantSection> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlantSection> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
