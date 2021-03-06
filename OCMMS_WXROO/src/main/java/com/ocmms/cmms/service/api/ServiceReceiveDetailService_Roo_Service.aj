// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
import com.ocmms.cmms.service.api.ServiceReceiveDetailService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect ServiceReceiveDetailService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return ServiceReceiveDetail
     */
    public abstract ServiceReceiveDetail ServiceReceiveDetailService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetail
     */
    public abstract void ServiceReceiveDetailService.delete(ServiceReceiveDetail serviceReceiveDetail);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<ServiceReceiveDetail> ServiceReceiveDetailService.save(Iterable<ServiceReceiveDetail> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void ServiceReceiveDetailService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return ServiceReceiveDetail
     */
    public abstract ServiceReceiveDetail ServiceReceiveDetailService.save(ServiceReceiveDetail entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return ServiceReceiveDetail
     */
    public abstract ServiceReceiveDetail ServiceReceiveDetailService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<ServiceReceiveDetail> ServiceReceiveDetailService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<ServiceReceiveDetail> ServiceReceiveDetailService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long ServiceReceiveDetailService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ServiceReceiveDetail> ServiceReceiveDetailService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ServiceReceiveDetail> ServiceReceiveDetailService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetail
     * @param documentsToAdd
     * @return ServiceReceiveDetail
     */
    public abstract ServiceReceiveDetail ServiceReceiveDetailService.addToDocuments(ServiceReceiveDetail serviceReceiveDetail, Iterable<Long> documentsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetail
     * @param documentsToRemove
     * @return ServiceReceiveDetail
     */
    public abstract ServiceReceiveDetail ServiceReceiveDetailService.removeFromDocuments(ServiceReceiveDetail serviceReceiveDetail, Iterable<Long> documentsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetail
     * @param documents
     * @return ServiceReceiveDetail
     */
    public abstract ServiceReceiveDetail ServiceReceiveDetailService.setDocuments(ServiceReceiveDetail serviceReceiveDetail, Iterable<Long> documents);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetail
     * @param imagesToAdd
     * @return ServiceReceiveDetail
     */
    public abstract ServiceReceiveDetail ServiceReceiveDetailService.addToImages(ServiceReceiveDetail serviceReceiveDetail, Iterable<Long> imagesToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetail
     * @param imagesToRemove
     * @return ServiceReceiveDetail
     */
    public abstract ServiceReceiveDetail ServiceReceiveDetailService.removeFromImages(ServiceReceiveDetail serviceReceiveDetail, Iterable<Long> imagesToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetail
     * @param images
     * @return ServiceReceiveDetail
     */
    public abstract ServiceReceiveDetail ServiceReceiveDetailService.setImages(ServiceReceiveDetail serviceReceiveDetail, Iterable<Long> images);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceProcurementItemDetail
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ServiceReceiveDetail> ServiceReceiveDetailService.findByServiceProcurementItemDetail(ServiceProcurementItemDetail serviceProcurementItemDetail, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceProcurementItemDetail
     * @return Long
     */
    public abstract long ServiceReceiveDetailService.countByServiceProcurementItemDetail(ServiceProcurementItemDetail serviceProcurementItemDetail);
    
}
