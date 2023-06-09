// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.loto.LotoDetailType;
import com.ocmms.cmms.service.api.LotoDetailTypeService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect LotoDetailTypeService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return LotoDetailType
     */
    public abstract LotoDetailType LotoDetailTypeService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoDetailType
     */
    public abstract void LotoDetailTypeService.delete(LotoDetailType lotoDetailType);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<LotoDetailType> LotoDetailTypeService.save(Iterable<LotoDetailType> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void LotoDetailTypeService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return LotoDetailType
     */
    public abstract LotoDetailType LotoDetailTypeService.save(LotoDetailType entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return LotoDetailType
     */
    public abstract LotoDetailType LotoDetailTypeService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<LotoDetailType> LotoDetailTypeService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<LotoDetailType> LotoDetailTypeService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long LotoDetailTypeService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<LotoDetailType> LotoDetailTypeService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<LotoDetailType> LotoDetailTypeService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
