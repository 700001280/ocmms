package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;

import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WorkOrderOperationRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface WorkOrderOperationRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrder
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderOperation> findByWorkOrder(WorkOrderHeader workOrder, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderOperation> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderOperation> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
