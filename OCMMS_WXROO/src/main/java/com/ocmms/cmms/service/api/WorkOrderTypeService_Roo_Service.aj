// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import com.ocmms.cmms.service.api.WorkOrderTypeService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect WorkOrderTypeService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return WorkOrderType
     */
    public abstract WorkOrderType WorkOrderTypeService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderType
     */
    public abstract void WorkOrderTypeService.delete(WorkOrderType workOrderType);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<WorkOrderType> WorkOrderTypeService.save(Iterable<WorkOrderType> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void WorkOrderTypeService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return WorkOrderType
     */
    public abstract WorkOrderType WorkOrderTypeService.save(WorkOrderType entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return WorkOrderType
     */
    public abstract WorkOrderType WorkOrderTypeService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<WorkOrderType> WorkOrderTypeService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<WorkOrderType> WorkOrderTypeService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long WorkOrderTypeService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<WorkOrderType> WorkOrderTypeService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<WorkOrderType> WorkOrderTypeService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderType
     * @param workOrderHeadersToAdd
     * @return WorkOrderType
     */
    public abstract WorkOrderType WorkOrderTypeService.addToWorkOrderHeaders(WorkOrderType workOrderType, Iterable<Long> workOrderHeadersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderType
     * @param workOrderHeadersToRemove
     * @return WorkOrderType
     */
    public abstract WorkOrderType WorkOrderTypeService.removeFromWorkOrderHeaders(WorkOrderType workOrderType, Iterable<Long> workOrderHeadersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderType
     * @param workOrderHeaders
     * @return WorkOrderType
     */
    public abstract WorkOrderType WorkOrderTypeService.setWorkOrderHeaders(WorkOrderType workOrderType, Iterable<Long> workOrderHeaders);
    
}
