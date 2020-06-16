package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerMaintenanceRecord;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PelletizerMaintenanceRecordRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface PelletizerMaintenanceRecordRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PelletizerMaintenanceRecord> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PelletizerMaintenanceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
