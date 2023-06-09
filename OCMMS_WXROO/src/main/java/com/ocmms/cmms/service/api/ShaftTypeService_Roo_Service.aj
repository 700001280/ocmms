// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.pp.configuration.ShaftType;
import com.ocmms.cmms.service.api.ShaftTypeService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect ShaftTypeService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return ShaftType
     */
    public abstract ShaftType ShaftTypeService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shaftType
     */
    public abstract void ShaftTypeService.delete(ShaftType shaftType);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<ShaftType> ShaftTypeService.save(Iterable<ShaftType> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void ShaftTypeService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return ShaftType
     */
    public abstract ShaftType ShaftTypeService.save(ShaftType entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return ShaftType
     */
    public abstract ShaftType ShaftTypeService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<ShaftType> ShaftTypeService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<ShaftType> ShaftTypeService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long ShaftTypeService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ShaftType> ShaftTypeService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ShaftType> ShaftTypeService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shaftType
     * @param productMasterDatasToAdd
     * @return ShaftType
     */
    public abstract ShaftType ShaftTypeService.addToProductMasterDatas(ShaftType shaftType, Iterable<Long> productMasterDatasToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shaftType
     * @param productMasterDatasToRemove
     * @return ShaftType
     */
    public abstract ShaftType ShaftTypeService.removeFromProductMasterDatas(ShaftType shaftType, Iterable<Long> productMasterDatasToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shaftType
     * @param productMasterDatas
     * @return ShaftType
     */
    public abstract ShaftType ShaftTypeService.setProductMasterDatas(ShaftType shaftType, Iterable<Long> productMasterDatas);
    
}
