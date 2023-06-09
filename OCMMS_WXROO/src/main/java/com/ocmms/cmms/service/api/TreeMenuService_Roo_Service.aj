// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.system.TreeMenu;
import com.ocmms.cmms.service.api.TreeMenuService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect TreeMenuService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return TreeMenu
     */
    public abstract TreeMenu TreeMenuService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param treeMenu
     */
    public abstract void TreeMenuService.delete(TreeMenu treeMenu);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<TreeMenu> TreeMenuService.save(Iterable<TreeMenu> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void TreeMenuService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return TreeMenu
     */
    public abstract TreeMenu TreeMenuService.save(TreeMenu entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return TreeMenu
     */
    public abstract TreeMenu TreeMenuService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<TreeMenu> TreeMenuService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<TreeMenu> TreeMenuService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long TreeMenuService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<TreeMenu> TreeMenuService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<TreeMenu> TreeMenuService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
