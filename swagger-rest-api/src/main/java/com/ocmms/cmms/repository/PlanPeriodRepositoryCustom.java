package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PlanPeriod;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PlanPeriodRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface PlanPeriodRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlanPeriod> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PlanPeriod> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
