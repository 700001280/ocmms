package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;

import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WorkOrderMaterialRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface WorkOrderMaterialRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrder
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderMaterial> findByWorkOrder(WorkOrderHeader workOrder, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderMaterial> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderMaterial> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
