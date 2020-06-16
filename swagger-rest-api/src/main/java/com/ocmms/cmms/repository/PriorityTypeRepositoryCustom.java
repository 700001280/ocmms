package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.PriorityType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PriorityTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface PriorityTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PriorityType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PriorityType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
