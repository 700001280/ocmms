// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.service.api.AssetClassificationService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect AssetClassificationService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     */
    public abstract void AssetClassificationService.delete(AssetClassification assetClassification);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<AssetClassification> AssetClassificationService.save(Iterable<AssetClassification> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void AssetClassificationService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.save(AssetClassification entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<AssetClassification> AssetClassificationService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<AssetClassification> AssetClassificationService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long AssetClassificationService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<AssetClassification> AssetClassificationService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<AssetClassification> AssetClassificationService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param documentsToAdd
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.addToDocuments(AssetClassification assetClassification, Iterable<Long> documentsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param documentsToRemove
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.removeFromDocuments(AssetClassification assetClassification, Iterable<Long> documentsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param documents
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.setDocuments(AssetClassification assetClassification, Iterable<Long> documents);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param equipmentsToAdd
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.addToEquipments(AssetClassification assetClassification, Iterable<Long> equipmentsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param equipmentsToRemove
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.removeFromEquipments(AssetClassification assetClassification, Iterable<Long> equipmentsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param equipments
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.setEquipments(AssetClassification assetClassification, Iterable<Long> equipments);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param imagesToAdd
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.addToImages(AssetClassification assetClassification, Iterable<Long> imagesToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param imagesToRemove
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.removeFromImages(AssetClassification assetClassification, Iterable<Long> imagesToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param images
     * @return AssetClassification
     */
    public abstract AssetClassification AssetClassificationService.setImages(AssetClassification assetClassification, Iterable<Long> images);
    
}
