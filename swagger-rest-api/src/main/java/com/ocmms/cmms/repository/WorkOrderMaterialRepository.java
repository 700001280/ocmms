package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderMaterialRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "workordermaterial", path = "workordermaterial")
public interface WorkOrderMaterialRepository extends  WorkOrderMaterialRepositoryCustom,
		PagingAndSortingRepository<WorkOrderMaterial, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrder
	 * @return Long
	 */
	public abstract long countByWorkOrder(WorkOrderHeader workOrder);
}
