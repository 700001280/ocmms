package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.PlannerGroup;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PlannerGroupRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface PlannerGroupRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlannerGroup> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlannerGroup> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
