package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PlanStrategy;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PlanStrategyRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface PlanStrategyRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlanStrategy> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlanStrategy> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
