// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;
import com.ocmms.cmms.service.api.ProcurementOrderFinanceTrackingService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect ProcurementOrderFinanceTrackingService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return ProcurementOrderFinanceTracking
     */
    public abstract ProcurementOrderFinanceTracking ProcurementOrderFinanceTrackingService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderFinanceTracking
     */
    public abstract void ProcurementOrderFinanceTrackingService.delete(ProcurementOrderFinanceTracking procurementOrderFinanceTracking);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<ProcurementOrderFinanceTracking> ProcurementOrderFinanceTrackingService.save(Iterable<ProcurementOrderFinanceTracking> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void ProcurementOrderFinanceTrackingService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return ProcurementOrderFinanceTracking
     */
    public abstract ProcurementOrderFinanceTracking ProcurementOrderFinanceTrackingService.save(ProcurementOrderFinanceTracking entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return ProcurementOrderFinanceTracking
     */
    public abstract ProcurementOrderFinanceTracking ProcurementOrderFinanceTrackingService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<ProcurementOrderFinanceTracking> ProcurementOrderFinanceTrackingService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<ProcurementOrderFinanceTracking> ProcurementOrderFinanceTrackingService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long ProcurementOrderFinanceTrackingService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ProcurementOrderFinanceTracking> ProcurementOrderFinanceTrackingService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ProcurementOrderFinanceTracking> ProcurementOrderFinanceTrackingService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderFinanceTracking
     * @param documentsToAdd
     * @return ProcurementOrderFinanceTracking
     */
    public abstract ProcurementOrderFinanceTracking ProcurementOrderFinanceTrackingService.addToDocuments(ProcurementOrderFinanceTracking procurementOrderFinanceTracking, Iterable<Long> documentsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderFinanceTracking
     * @param documentsToRemove
     * @return ProcurementOrderFinanceTracking
     */
    public abstract ProcurementOrderFinanceTracking ProcurementOrderFinanceTrackingService.removeFromDocuments(ProcurementOrderFinanceTracking procurementOrderFinanceTracking, Iterable<Long> documentsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderFinanceTracking
     * @param documents
     * @return ProcurementOrderFinanceTracking
     */
    public abstract ProcurementOrderFinanceTracking ProcurementOrderFinanceTrackingService.setDocuments(ProcurementOrderFinanceTracking procurementOrderFinanceTracking, Iterable<Long> documents);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderFinanceTracking
     * @param imagesToAdd
     * @return ProcurementOrderFinanceTracking
     */
    public abstract ProcurementOrderFinanceTracking ProcurementOrderFinanceTrackingService.addToImages(ProcurementOrderFinanceTracking procurementOrderFinanceTracking, Iterable<Long> imagesToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderFinanceTracking
     * @param imagesToRemove
     * @return ProcurementOrderFinanceTracking
     */
    public abstract ProcurementOrderFinanceTracking ProcurementOrderFinanceTrackingService.removeFromImages(ProcurementOrderFinanceTracking procurementOrderFinanceTracking, Iterable<Long> imagesToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderFinanceTracking
     * @param images
     * @return ProcurementOrderFinanceTracking
     */
    public abstract ProcurementOrderFinanceTracking ProcurementOrderFinanceTrackingService.setImages(ProcurementOrderFinanceTracking procurementOrderFinanceTracking, Iterable<Long> images);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ProcurementOrderFinanceTracking> ProcurementOrderFinanceTrackingService.findByProcurementOrder(ProcurementOrder procurementOrder, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @return Long
     */
    public abstract long ProcurementOrderFinanceTrackingService.countByProcurementOrder(ProcurementOrder procurementOrder);
    
}
