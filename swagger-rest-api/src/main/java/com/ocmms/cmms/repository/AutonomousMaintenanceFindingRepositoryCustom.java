package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = AutonomousMaintenanceFindingRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface AutonomousMaintenanceFindingRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AutonomousMaintenanceFinding> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AutonomousMaintenanceFinding> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
