package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Country;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = CountryRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface CountryRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Country> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Country> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
