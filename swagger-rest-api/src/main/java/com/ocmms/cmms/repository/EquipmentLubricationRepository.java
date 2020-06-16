package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentLubrication;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EquipmentLubricationRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "equipmentlubrication", path = "equipmentlubrication")
public interface EquipmentLubricationRepository extends  EquipmentLubricationRepositoryCustom,
		PagingAndSortingRepository<EquipmentLubrication, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipments
	 * @return Long
	 */
	public abstract long countByEquipmentsContains(Equipment equipments);
}
