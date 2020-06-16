package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.InstockType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = InstockTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface InstockTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<InstockType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<InstockType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
