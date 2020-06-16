package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.MovementType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = MovementTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface MovementTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MovementType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MovementType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
