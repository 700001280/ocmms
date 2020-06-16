package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderTimeSheet;

import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WorkOrderTimeSheetRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface WorkOrderTimeSheetRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderOperation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderTimeSheet> findByWorkOrderOperation(WorkOrderOperation workOrderOperation,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderTimeSheet> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderTimeSheet> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
