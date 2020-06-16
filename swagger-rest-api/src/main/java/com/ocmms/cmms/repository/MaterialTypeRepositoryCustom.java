package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = MaterialTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface MaterialTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
