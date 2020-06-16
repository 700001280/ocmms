package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = FailureMaintenanceReportRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface FailureMaintenanceReportRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<FailureMaintenanceReport> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<FailureMaintenanceReport> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
