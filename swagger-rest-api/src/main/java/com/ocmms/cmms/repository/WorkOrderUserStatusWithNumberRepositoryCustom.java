package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WorkOrderUserStatusWithNumberRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface WorkOrderUserStatusWithNumberRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderUserStatusWithNumber> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderUserStatusWithNumber> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
