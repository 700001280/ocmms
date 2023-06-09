// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.ocmms.cmms.service.api.WorkCenterResponsibleService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect WorkCenterResponsibleService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     */
    public abstract void WorkCenterResponsibleService.delete(WorkCenterResponsible workCenterResponsible);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<WorkCenterResponsible> WorkCenterResponsibleService.save(Iterable<WorkCenterResponsible> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void WorkCenterResponsibleService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.save(WorkCenterResponsible entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<WorkCenterResponsible> WorkCenterResponsibleService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<WorkCenterResponsible> WorkCenterResponsibleService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long WorkCenterResponsibleService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<WorkCenterResponsible> WorkCenterResponsibleService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<WorkCenterResponsible> WorkCenterResponsibleService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param hierarchyWorkCentersToAdd
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.addToHierarchyWorkCenters(WorkCenterResponsible workCenterResponsible, Iterable<Long> hierarchyWorkCentersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param hierarchyWorkCentersToRemove
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.removeFromHierarchyWorkCenters(WorkCenterResponsible workCenterResponsible, Iterable<Long> hierarchyWorkCentersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param hierarchyWorkCenters
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.setHierarchyWorkCenters(WorkCenterResponsible workCenterResponsible, Iterable<Long> hierarchyWorkCenters);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param mainWorkCentersToAdd
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.addToMainWorkCenters(WorkCenterResponsible workCenterResponsible, Iterable<Long> mainWorkCentersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param mainWorkCentersToRemove
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.removeFromMainWorkCenters(WorkCenterResponsible workCenterResponsible, Iterable<Long> mainWorkCentersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param mainWorkCenters
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.setMainWorkCenters(WorkCenterResponsible workCenterResponsible, Iterable<Long> mainWorkCenters);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param operationalWorkCentersToAdd
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.addToOperationalWorkCenters(WorkCenterResponsible workCenterResponsible, Iterable<Long> operationalWorkCentersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param operationalWorkCentersToRemove
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.removeFromOperationalWorkCenters(WorkCenterResponsible workCenterResponsible, Iterable<Long> operationalWorkCentersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param operationalWorkCenters
     * @return WorkCenterResponsible
     */
    public abstract WorkCenterResponsible WorkCenterResponsibleService.setOperationalWorkCenters(WorkCenterResponsible workCenterResponsible, Iterable<Long> operationalWorkCenters);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<WorkCenterResponsible> WorkCenterResponsibleService.findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @return Long
     */
    public abstract long WorkCenterResponsibleService.countByOrganization(Organization organization);
    
}
