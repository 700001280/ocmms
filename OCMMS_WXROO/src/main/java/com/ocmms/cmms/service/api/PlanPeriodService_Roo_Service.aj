// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.pm.plan.PlanPeriod;
import com.ocmms.cmms.service.api.PlanPeriodService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect PlanPeriodService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PlanPeriod
     */
    public abstract PlanPeriod PlanPeriodService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param planPeriod
     */
    public abstract void PlanPeriodService.delete(PlanPeriod planPeriod);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<PlanPeriod> PlanPeriodService.save(Iterable<PlanPeriod> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void PlanPeriodService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PlanPeriod
     */
    public abstract PlanPeriod PlanPeriodService.save(PlanPeriod entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PlanPeriod
     */
    public abstract PlanPeriod PlanPeriodService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<PlanPeriod> PlanPeriodService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<PlanPeriod> PlanPeriodService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long PlanPeriodService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PlanPeriod> PlanPeriodService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PlanPeriod> PlanPeriodService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
