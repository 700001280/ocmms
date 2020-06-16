package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.configuration.ShaftType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ShaftTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface ShaftTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ShaftType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ShaftType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
