package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;

import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = EquipmentReplaceRecordRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface EquipmentReplaceRecordRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<EquipmentReplaceRecord> findByEquipment(Equipment equipment, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<EquipmentReplaceRecord> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<EquipmentReplaceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
