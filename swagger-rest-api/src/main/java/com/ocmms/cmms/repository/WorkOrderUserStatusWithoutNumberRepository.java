package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithoutNumber;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderUserStatusWithoutNumberRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "workorderuserstatuswithoutnumber", path = "workorderuserstatuswithoutnumber")
public interface WorkOrderUserStatusWithoutNumberRepository extends  WorkOrderUserStatusWithoutNumberRepositoryCustom,
		PagingAndSortingRepository<WorkOrderUserStatusWithoutNumber, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderHeaders
	 * @return Long
	 */
	public abstract long countByWorkOrderHeadersContains(WorkOrderHeader workOrderHeaders);
}
