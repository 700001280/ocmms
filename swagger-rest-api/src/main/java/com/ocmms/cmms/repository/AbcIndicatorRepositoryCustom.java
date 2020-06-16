package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.AbcIndicator;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = AbcIndicatorRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface AbcIndicatorRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AbcIndicator> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AbcIndicator> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
