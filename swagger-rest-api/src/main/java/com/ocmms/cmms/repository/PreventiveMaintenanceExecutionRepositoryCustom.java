package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;

import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PreventiveMaintenanceExecutionRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface PreventiveMaintenanceExecutionRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenanceExecution> findByTechnicalObject(TechnicalObject technicalObject,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenanceExecution> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenanceExecution> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
