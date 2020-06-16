package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;

import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EquipmentMaintenanceRecordRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "equipmentmaintenancerecord", path = "equipmentmaintenancerecord")
public interface EquipmentMaintenanceRecordRepository extends  EquipmentMaintenanceRecordRepositoryCustom,
		PagingAndSortingRepository<EquipmentMaintenanceRecord, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @return Long
	 */
	public abstract long countByEquipment(Equipment equipment);
}
