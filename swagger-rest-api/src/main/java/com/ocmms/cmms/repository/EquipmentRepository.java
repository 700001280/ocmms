package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentCategory;
import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EquipmentRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "equipment", path = "equipment")
public interface EquipmentRepository extends  EquipmentRepositoryCustom,
		PagingAndSortingRepository<Equipment, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plannerGroup
	 * @return Long
	 */
	public abstract long countByPlannerGroup(PlannerGroup plannerGroup);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plantSection
	 * @return Long
	 */
	public abstract long countByPlantSection(PlantSection plantSection);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetClassification
	 * @return Long
	 */
	public abstract long countByAssetClassification(AssetClassification assetClassification);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plantLocation
	 * @return Long
	 */
	public abstract long countByPlantLocation(PlantLocation plantLocation);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentCategory
	 * @return Long
	 */
	public abstract long countByEquipmentCategory(EquipmentCategory equipmentCategory);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param objectType
	 * @return Long
	 */
	public abstract long countByObjectType(ObjectType objectType);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param mainWorkCenter
	 * @return Long
	 */
	public abstract long countByMainWorkCenter(MainWorkCenter mainWorkCenter);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param criticalClassification
	 * @return Long
	 */
	public abstract long countByCriticalClassification(CriticalClassification criticalClassification);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param functionalLocation
	 * @return Long
	 */
	public abstract long countByFunctionalLocation(FunctionalLocation functionalLocation);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param superiorEquipment
	 * @return Long
	 */
	public abstract long countBySuperiorEquipment(TechnicalObject superiorEquipment);
}
