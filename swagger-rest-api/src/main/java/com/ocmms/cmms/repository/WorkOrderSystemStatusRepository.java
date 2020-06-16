package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderSystemStatusRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "workordersystemstatus", path = "workordersystemstatus")
public interface WorkOrderSystemStatusRepository extends  WorkOrderSystemStatusRepositoryCustom,
		PagingAndSortingRepository<WorkOrderSystemStatus, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderHeaders
	 * @return Long
	 */
	public abstract long countByWorkOrderHeadersContains(WorkOrderHeader workOrderHeaders);
}
