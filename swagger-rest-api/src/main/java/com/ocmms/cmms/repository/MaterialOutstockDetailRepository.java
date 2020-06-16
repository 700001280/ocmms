package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;

import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialOutstockDetailRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "materialoutstockdetail", path = "materialoutstockdetail")
public interface MaterialOutstockDetailRepository extends  MaterialOutstockDetailRepositoryCustom,
		PagingAndSortingRepository<MaterialOutstockDetail, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentMaintenanceRecord
	 * @return Long
	 */
	public abstract long countByEquipmentMaintenanceRecord(EquipmentMaintenanceRecord equipmentMaintenanceRecord);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partMaintenanceRecord
	 * @return Long
	 */
	public abstract long countByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord);
}
