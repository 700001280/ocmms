package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderTimeSheet;
import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderTimeSheetRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "workordertimesheet", path = "workordertimesheet")
public interface WorkOrderTimeSheetRepository extends  WorkOrderTimeSheetRepositoryCustom,
		PagingAndSortingRepository<WorkOrderTimeSheet, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderOperation
	 * @return Long
	 */
	public abstract long countByWorkOrderOperation(WorkOrderOperation workOrderOperation);
}
