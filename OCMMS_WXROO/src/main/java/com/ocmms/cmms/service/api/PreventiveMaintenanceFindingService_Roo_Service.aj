// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.pm.routine.PreventiveMaintenanceFinding;
import com.ocmms.cmms.service.api.PreventiveMaintenanceFindingService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect PreventiveMaintenanceFindingService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PreventiveMaintenanceFinding
     */
    public abstract PreventiveMaintenanceFinding PreventiveMaintenanceFindingService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceFinding
     */
    public abstract void PreventiveMaintenanceFindingService.delete(PreventiveMaintenanceFinding preventiveMaintenanceFinding);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<PreventiveMaintenanceFinding> PreventiveMaintenanceFindingService.save(Iterable<PreventiveMaintenanceFinding> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void PreventiveMaintenanceFindingService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PreventiveMaintenanceFinding
     */
    public abstract PreventiveMaintenanceFinding PreventiveMaintenanceFindingService.save(PreventiveMaintenanceFinding entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PreventiveMaintenanceFinding
     */
    public abstract PreventiveMaintenanceFinding PreventiveMaintenanceFindingService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<PreventiveMaintenanceFinding> PreventiveMaintenanceFindingService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<PreventiveMaintenanceFinding> PreventiveMaintenanceFindingService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long PreventiveMaintenanceFindingService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PreventiveMaintenanceFinding> PreventiveMaintenanceFindingService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PreventiveMaintenanceFinding> PreventiveMaintenanceFindingService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceFinding
     * @param documentsToAdd
     * @return PreventiveMaintenanceFinding
     */
    public abstract PreventiveMaintenanceFinding PreventiveMaintenanceFindingService.addToDocuments(PreventiveMaintenanceFinding preventiveMaintenanceFinding, Iterable<Long> documentsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceFinding
     * @param documentsToRemove
     * @return PreventiveMaintenanceFinding
     */
    public abstract PreventiveMaintenanceFinding PreventiveMaintenanceFindingService.removeFromDocuments(PreventiveMaintenanceFinding preventiveMaintenanceFinding, Iterable<Long> documentsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceFinding
     * @param documents
     * @return PreventiveMaintenanceFinding
     */
    public abstract PreventiveMaintenanceFinding PreventiveMaintenanceFindingService.setDocuments(PreventiveMaintenanceFinding preventiveMaintenanceFinding, Iterable<Long> documents);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceFinding
     * @param imagesToAdd
     * @return PreventiveMaintenanceFinding
     */
    public abstract PreventiveMaintenanceFinding PreventiveMaintenanceFindingService.addToImages(PreventiveMaintenanceFinding preventiveMaintenanceFinding, Iterable<Long> imagesToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceFinding
     * @param imagesToRemove
     * @return PreventiveMaintenanceFinding
     */
    public abstract PreventiveMaintenanceFinding PreventiveMaintenanceFindingService.removeFromImages(PreventiveMaintenanceFinding preventiveMaintenanceFinding, Iterable<Long> imagesToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceFinding
     * @param images
     * @return PreventiveMaintenanceFinding
     */
    public abstract PreventiveMaintenanceFinding PreventiveMaintenanceFindingService.setImages(PreventiveMaintenanceFinding preventiveMaintenanceFinding, Iterable<Long> images);
    
}
