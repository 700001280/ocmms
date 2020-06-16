package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "workordertype", path = "workordertype")
public interface WorkOrderTypeRepository extends  WorkOrderTypeRepositoryCustom,
		PagingAndSortingRepository<WorkOrderType, Long> {
}
