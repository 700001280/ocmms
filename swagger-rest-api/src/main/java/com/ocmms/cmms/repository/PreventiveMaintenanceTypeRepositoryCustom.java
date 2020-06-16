package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PreventiveMaintenanceType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PreventiveMaintenanceTypeRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface PreventiveMaintenanceTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenanceType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenanceType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
