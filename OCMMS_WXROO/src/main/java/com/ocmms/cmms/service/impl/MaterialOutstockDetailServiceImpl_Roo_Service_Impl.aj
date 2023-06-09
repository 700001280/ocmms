// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import com.ocmms.cmms.repository.MaterialOutstockDetailRepository;
import com.ocmms.cmms.service.impl.MaterialOutstockDetailServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MaterialOutstockDetailServiceImpl_Roo_Service_Impl {
    
    declare @type: MaterialOutstockDetailServiceImpl: @Service;
    
    declare @type: MaterialOutstockDetailServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialOutstockDetailRepository MaterialOutstockDetailServiceImpl.materialOutstockDetailRepository;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param materialOutstockDetailRepository
     */
    @Autowired
    public MaterialOutstockDetailServiceImpl.new(MaterialOutstockDetailRepository materialOutstockDetailRepository) {
        setMaterialOutstockDetailRepository(materialOutstockDetailRepository);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialOutstockDetailRepository
     */
    public MaterialOutstockDetailRepository MaterialOutstockDetailServiceImpl.getMaterialOutstockDetailRepository() {
        return materialOutstockDetailRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialOutstockDetailRepository
     */
    public void MaterialOutstockDetailServiceImpl.setMaterialOutstockDetailRepository(MaterialOutstockDetailRepository materialOutstockDetailRepository) {
        this.materialOutstockDetailRepository = materialOutstockDetailRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialoutstockdetail
     * @return Map
     */
    public Map<String, List<MessageI18n>> MaterialOutstockDetailServiceImpl.validate(MaterialOutstockDetail materialoutstockdetail) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialOutstockDetail
     */
    @Transactional
    public void MaterialOutstockDetailServiceImpl.delete(MaterialOutstockDetail materialOutstockDetail) {
        // Clear bidirectional many-to-one child relationship with EquipmentMaintenanceRecord
        if (materialOutstockDetail.getEquipmentMaintenanceRecord() != null) {
            materialOutstockDetail.getEquipmentMaintenanceRecord().getMaterialOutstockDetails().remove(materialOutstockDetail);
        }
        
        // Clear bidirectional many-to-one child relationship with PartMaintenanceRecord
        if (materialOutstockDetail.getPartMaintenanceRecord() != null) {
            materialOutstockDetail.getPartMaintenanceRecord().getMaterialOutstockDetails().remove(materialOutstockDetail);
        }
        
        getMaterialOutstockDetailRepository().delete(materialOutstockDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<MaterialOutstockDetail> MaterialOutstockDetailServiceImpl.save(Iterable<MaterialOutstockDetail> entities) {
        return getMaterialOutstockDetailRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void MaterialOutstockDetailServiceImpl.delete(Iterable<Long> ids) {
        List<MaterialOutstockDetail> toDelete = getMaterialOutstockDetailRepository().findAll(ids);
        getMaterialOutstockDetailRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return MaterialOutstockDetail
     */
    @Transactional
    public MaterialOutstockDetail MaterialOutstockDetailServiceImpl.save(MaterialOutstockDetail entity) {
        return getMaterialOutstockDetailRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialOutstockDetail
     */
    public MaterialOutstockDetail MaterialOutstockDetailServiceImpl.findOne(Long id) {
        return getMaterialOutstockDetailRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialOutstockDetail
     */
    public MaterialOutstockDetail MaterialOutstockDetailServiceImpl.findOneForUpdate(Long id) {
        return getMaterialOutstockDetailRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<MaterialOutstockDetail> MaterialOutstockDetailServiceImpl.findAll(Iterable<Long> ids) {
        return getMaterialOutstockDetailRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<MaterialOutstockDetail> MaterialOutstockDetailServiceImpl.findAll() {
        return getMaterialOutstockDetailRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long MaterialOutstockDetailServiceImpl.count() {
        return getMaterialOutstockDetailRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialOutstockDetail> MaterialOutstockDetailServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getMaterialOutstockDetailRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialOutstockDetail> MaterialOutstockDetailServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getMaterialOutstockDetailRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialOutstockDetail> MaterialOutstockDetailServiceImpl.findByEquipmentMaintenanceRecord(EquipmentMaintenanceRecord equipmentMaintenanceRecord, GlobalSearch globalSearch, Pageable pageable) {
        return getMaterialOutstockDetailRepository().findByEquipmentMaintenanceRecord(equipmentMaintenanceRecord, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partMaintenanceRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialOutstockDetail> MaterialOutstockDetailServiceImpl.findByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord, GlobalSearch globalSearch, Pageable pageable) {
        return getMaterialOutstockDetailRepository().findByPartMaintenanceRecord(partMaintenanceRecord, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @return Long
     */
    public long MaterialOutstockDetailServiceImpl.countByEquipmentMaintenanceRecord(EquipmentMaintenanceRecord equipmentMaintenanceRecord) {
        return getMaterialOutstockDetailRepository().countByEquipmentMaintenanceRecord(equipmentMaintenanceRecord);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partMaintenanceRecord
     * @return Long
     */
    public long MaterialOutstockDetailServiceImpl.countByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord) {
        return getMaterialOutstockDetailRepository().countByPartMaintenanceRecord(partMaintenanceRecord);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<MaterialOutstockDetail> MaterialOutstockDetailServiceImpl.getEntityType() {
        return MaterialOutstockDetail.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> MaterialOutstockDetailServiceImpl.getIdType() {
        return Long.class;
    }
    
}
