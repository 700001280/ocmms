package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.mm.storage.RepairMaterialInstockDetail;

import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = RepairMaterialInstockDetailRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "repairmaterialinstockdetail", path = "repairmaterialinstockdetail")
public interface RepairMaterialInstockDetailRepository extends  RepairMaterialInstockDetailRepositoryCustom,
		PagingAndSortingRepository<RepairMaterialInstockDetail, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partMaintenanceRecord
	 * @return Long
	 */
	public abstract long countByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord);
}
