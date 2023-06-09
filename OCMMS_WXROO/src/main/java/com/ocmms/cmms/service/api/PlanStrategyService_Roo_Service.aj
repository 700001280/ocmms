// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.pm.plan.PlanStrategy;
import com.ocmms.cmms.service.api.PlanStrategyService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect PlanStrategyService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PlanStrategy
     */
    public abstract PlanStrategy PlanStrategyService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param planStrategy
     */
    public abstract void PlanStrategyService.delete(PlanStrategy planStrategy);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<PlanStrategy> PlanStrategyService.save(Iterable<PlanStrategy> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void PlanStrategyService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PlanStrategy
     */
    public abstract PlanStrategy PlanStrategyService.save(PlanStrategy entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PlanStrategy
     */
    public abstract PlanStrategy PlanStrategyService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<PlanStrategy> PlanStrategyService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<PlanStrategy> PlanStrategyService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long PlanStrategyService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PlanStrategy> PlanStrategyService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PlanStrategy> PlanStrategyService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
