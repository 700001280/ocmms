package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;

import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PreventiveMaintenanceStandardRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface PreventiveMaintenanceStandardRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param owner
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenanceStandard> findByOwner(Employee owner, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObjects
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenanceStandard> findByTechnicalObjectsContains(TechnicalObject technicalObjects,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenanceStandard> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PreventiveMaintenanceStandard> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
