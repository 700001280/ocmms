package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderOperationRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "workorderoperation", path = "workorderoperation")
public interface WorkOrderOperationRepository extends  WorkOrderOperationRepositoryCustom,
		PagingAndSortingRepository<WorkOrderOperation, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrder
	 * @return Long
	 */
	public abstract long countByWorkOrder(WorkOrderHeader workOrder);
}
