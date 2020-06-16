package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatusChangeRecord;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EquipmentStatusChangeRecordRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "equipmentstatuschangerecord", path = "equipmentstatuschangerecord")
public interface EquipmentStatusChangeRecordRepository extends  EquipmentStatusChangeRecordRepositoryCustom,
		PagingAndSortingRepository<EquipmentStatusChangeRecord, Long>{

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @return Long
	 */
	public abstract long countByEquipment(Equipment equipment);
}
