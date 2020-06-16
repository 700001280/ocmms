package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.measuringpoint.MeasuringRecord;

import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MeasuringRecordRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "measuringrecord", path = "measuringrecord")
public interface MeasuringRecordRepository extends  MeasuringRecordRepositoryCustom,
		PagingAndSortingRepository<MeasuringRecord, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @return Long
	 */
	public abstract long countByEquipment(Equipment equipment);
}
