package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.City;

import com.ocmms.cmms.model.common.Province;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = CityRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface CityRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param province
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<City> findByProvince(Province province, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<City> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<City> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
