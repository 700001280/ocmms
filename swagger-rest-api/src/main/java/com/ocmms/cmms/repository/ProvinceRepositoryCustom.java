package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Province;

import com.ocmms.cmms.model.common.Region;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ProvinceRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface ProvinceRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param region
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Province> findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Province> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Province> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
