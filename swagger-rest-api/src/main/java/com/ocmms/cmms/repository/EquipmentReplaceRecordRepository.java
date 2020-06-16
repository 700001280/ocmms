package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;

import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EquipmentReplaceRecordRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "equipmentreplacerecord", path = "equipmentreplacerecord")
public interface EquipmentReplaceRecordRepository extends  EquipmentReplaceRecordRepositoryCustom,
		PagingAndSortingRepository<EquipmentReplaceRecord, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @return Long
	 */
	public abstract long countByEquipment(Equipment equipment);
}
