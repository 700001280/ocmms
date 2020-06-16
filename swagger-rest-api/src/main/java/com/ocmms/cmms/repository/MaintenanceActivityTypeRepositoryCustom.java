package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = MaintenanceActivityTypeRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface MaintenanceActivityTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaintenanceActivityType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaintenanceActivityType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
