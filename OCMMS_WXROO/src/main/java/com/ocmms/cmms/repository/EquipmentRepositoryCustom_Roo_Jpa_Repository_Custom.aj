// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentCategory;
import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.repository.EquipmentRepositoryCustom;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect EquipmentRepositoryCustom_Roo_Jpa_Repository_Custom {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plannerGroup
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findByPlannerGroup(PlannerGroup plannerGroup, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSection
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findByPlantSection(PlantSection plantSection, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findByAssetClassification(AssetClassification assetClassification, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantLocation
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findByPlantLocation(PlantLocation plantLocation, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentCategory
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findByEquipmentCategory(EquipmentCategory equipmentCategory, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param objectType
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findByObjectType(ObjectType objectType, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mainWorkCenter
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findByMainWorkCenter(MainWorkCenter mainWorkCenter, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param criticalClassification
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findByCriticalClassification(CriticalClassification criticalClassification, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param functionalLocation
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findByFunctionalLocation(FunctionalLocation functionalLocation, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param superiorEquipment
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findBySuperiorEquipment(TechnicalObject superiorEquipment, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Equipment> EquipmentRepositoryCustom.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
