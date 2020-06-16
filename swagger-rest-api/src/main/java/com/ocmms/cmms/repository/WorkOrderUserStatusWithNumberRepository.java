package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderUserStatusWithNumberRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "workorderuserstatuswithnumber", path = "workorderuserstatuswithnumber")
public interface WorkOrderUserStatusWithNumberRepository extends  WorkOrderUserStatusWithNumberRepositoryCustom,
		PagingAndSortingRepository<WorkOrderUserStatusWithNumber, Long>  {
}
