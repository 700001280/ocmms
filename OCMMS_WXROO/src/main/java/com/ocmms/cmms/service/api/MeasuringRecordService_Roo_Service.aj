// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.pm.measuringpoint.MeasuringRecord;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.service.api.MeasuringRecordService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect MeasuringRecordService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MeasuringRecord
     */
    public abstract MeasuringRecord MeasuringRecordService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringRecord
     */
    public abstract void MeasuringRecordService.delete(MeasuringRecord measuringRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<MeasuringRecord> MeasuringRecordService.save(Iterable<MeasuringRecord> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void MeasuringRecordService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return MeasuringRecord
     */
    public abstract MeasuringRecord MeasuringRecordService.save(MeasuringRecord entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MeasuringRecord
     */
    public abstract MeasuringRecord MeasuringRecordService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<MeasuringRecord> MeasuringRecordService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<MeasuringRecord> MeasuringRecordService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long MeasuringRecordService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MeasuringRecord> MeasuringRecordService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MeasuringRecord> MeasuringRecordService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringRecord
     * @param documentsToAdd
     * @return MeasuringRecord
     */
    public abstract MeasuringRecord MeasuringRecordService.addToDocuments(MeasuringRecord measuringRecord, Iterable<Long> documentsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringRecord
     * @param documentsToRemove
     * @return MeasuringRecord
     */
    public abstract MeasuringRecord MeasuringRecordService.removeFromDocuments(MeasuringRecord measuringRecord, Iterable<Long> documentsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringRecord
     * @param documents
     * @return MeasuringRecord
     */
    public abstract MeasuringRecord MeasuringRecordService.setDocuments(MeasuringRecord measuringRecord, Iterable<Long> documents);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringRecord
     * @param imagesToAdd
     * @return MeasuringRecord
     */
    public abstract MeasuringRecord MeasuringRecordService.addToImages(MeasuringRecord measuringRecord, Iterable<Long> imagesToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringRecord
     * @param imagesToRemove
     * @return MeasuringRecord
     */
    public abstract MeasuringRecord MeasuringRecordService.removeFromImages(MeasuringRecord measuringRecord, Iterable<Long> imagesToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringRecord
     * @param images
     * @return MeasuringRecord
     */
    public abstract MeasuringRecord MeasuringRecordService.setImages(MeasuringRecord measuringRecord, Iterable<Long> images);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MeasuringRecord> MeasuringRecordService.findByEquipment(Equipment equipment, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @return Long
     */
    public abstract long MeasuringRecordService.countByEquipment(Equipment equipment);
    
}
