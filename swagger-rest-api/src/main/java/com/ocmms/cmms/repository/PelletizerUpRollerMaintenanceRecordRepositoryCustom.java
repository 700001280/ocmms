package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerMaintenanceRecord;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PelletizerUpRollerMaintenanceRecordRepositoryCustom TODO Auto-generated
 * class documentation
 *
 */

public interface PelletizerUpRollerMaintenanceRecordRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PelletizerUpRollerMaintenanceRecord> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PelletizerUpRollerMaintenanceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
