package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PreventiveMaintenancePlanRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface PreventiveMaintenancePlanRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenancePlan> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenancePlan> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
