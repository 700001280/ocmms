package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Region;

import com.ocmms.cmms.model.common.Country;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = RegionRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface RegionRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param country
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Region> findByCountry(Country country, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Region> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Region> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
