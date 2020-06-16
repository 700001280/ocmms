package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentLubrication;

import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = EquipmentLubricationRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface EquipmentLubricationRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipments
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<EquipmentLubrication> findByEquipmentsContains(Equipment equipments, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<EquipmentLubrication> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<EquipmentLubrication> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
