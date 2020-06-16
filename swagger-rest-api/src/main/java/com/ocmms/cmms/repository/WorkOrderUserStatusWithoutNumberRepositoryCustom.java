package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithoutNumber;

import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WorkOrderUserStatusWithoutNumberRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface WorkOrderUserStatusWithoutNumberRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderHeaders
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderUserStatusWithoutNumber> findByWorkOrderHeadersContains(
			WorkOrderHeader workOrderHeaders, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderUserStatusWithoutNumber> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderUserStatusWithoutNumber> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
