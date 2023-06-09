// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.ocmms.cmms.service.api.HierarchyWorkCenterService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect HierarchyWorkCenterService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return HierarchyWorkCenter
     */
    public abstract HierarchyWorkCenter HierarchyWorkCenterService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hierarchyWorkCenter
     */
    public abstract void HierarchyWorkCenterService.delete(HierarchyWorkCenter hierarchyWorkCenter);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<HierarchyWorkCenter> HierarchyWorkCenterService.save(Iterable<HierarchyWorkCenter> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void HierarchyWorkCenterService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return HierarchyWorkCenter
     */
    public abstract HierarchyWorkCenter HierarchyWorkCenterService.save(HierarchyWorkCenter entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return HierarchyWorkCenter
     */
    public abstract HierarchyWorkCenter HierarchyWorkCenterService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<HierarchyWorkCenter> HierarchyWorkCenterService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<HierarchyWorkCenter> HierarchyWorkCenterService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long HierarchyWorkCenterService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<HierarchyWorkCenter> HierarchyWorkCenterService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<HierarchyWorkCenter> HierarchyWorkCenterService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hierarchyWorkCenter
     * @param mainWorkCentersToAdd
     * @return HierarchyWorkCenter
     */
    public abstract HierarchyWorkCenter HierarchyWorkCenterService.addToMainWorkCenters(HierarchyWorkCenter hierarchyWorkCenter, Iterable<Long> mainWorkCentersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hierarchyWorkCenter
     * @param mainWorkCentersToRemove
     * @return HierarchyWorkCenter
     */
    public abstract HierarchyWorkCenter HierarchyWorkCenterService.removeFromMainWorkCenters(HierarchyWorkCenter hierarchyWorkCenter, Iterable<Long> mainWorkCentersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hierarchyWorkCenter
     * @param mainWorkCenters
     * @return HierarchyWorkCenter
     */
    public abstract HierarchyWorkCenter HierarchyWorkCenterService.setMainWorkCenters(HierarchyWorkCenter hierarchyWorkCenter, Iterable<Long> mainWorkCenters);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<HierarchyWorkCenter> HierarchyWorkCenterService.findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param responsible
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<HierarchyWorkCenter> HierarchyWorkCenterService.findByResponsible(WorkCenterResponsible responsible, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @return Long
     */
    public abstract long HierarchyWorkCenterService.countByOrganization(Organization organization);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param responsible
     * @return Long
     */
    public abstract long HierarchyWorkCenterService.countByResponsible(WorkCenterResponsible responsible);
    
}
