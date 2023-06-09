// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.system.TreeMenu;
import com.ocmms.cmms.repository.TreeMenuRepository;
import com.ocmms.cmms.service.impl.TreeMenuServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TreeMenuServiceImpl_Roo_Service_Impl {
    
    declare @type: TreeMenuServiceImpl: @Service;
    
    declare @type: TreeMenuServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private TreeMenuRepository TreeMenuServiceImpl.treeMenuRepository;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param treeMenuRepository
     */
    @Autowired
    public TreeMenuServiceImpl.new(TreeMenuRepository treeMenuRepository) {
        setTreeMenuRepository(treeMenuRepository);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return TreeMenuRepository
     */
    public TreeMenuRepository TreeMenuServiceImpl.getTreeMenuRepository() {
        return treeMenuRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param treeMenuRepository
     */
    public void TreeMenuServiceImpl.setTreeMenuRepository(TreeMenuRepository treeMenuRepository) {
        this.treeMenuRepository = treeMenuRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param treemenu
     * @return Map
     */
    public Map<String, List<MessageI18n>> TreeMenuServiceImpl.validate(TreeMenu treemenu) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param treeMenu
     */
    @Transactional
    public void TreeMenuServiceImpl.delete(TreeMenu treeMenu) {
        getTreeMenuRepository().delete(treeMenu);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<TreeMenu> TreeMenuServiceImpl.save(Iterable<TreeMenu> entities) {
        return getTreeMenuRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void TreeMenuServiceImpl.delete(Iterable<Long> ids) {
        List<TreeMenu> toDelete = getTreeMenuRepository().findAll(ids);
        getTreeMenuRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return TreeMenu
     */
    @Transactional
    public TreeMenu TreeMenuServiceImpl.save(TreeMenu entity) {
        return getTreeMenuRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return TreeMenu
     */
    public TreeMenu TreeMenuServiceImpl.findOne(Long id) {
        return getTreeMenuRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return TreeMenu
     */
    public TreeMenu TreeMenuServiceImpl.findOneForUpdate(Long id) {
        return getTreeMenuRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<TreeMenu> TreeMenuServiceImpl.findAll(Iterable<Long> ids) {
        return getTreeMenuRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<TreeMenu> TreeMenuServiceImpl.findAll() {
        return getTreeMenuRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long TreeMenuServiceImpl.count() {
        return getTreeMenuRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<TreeMenu> TreeMenuServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getTreeMenuRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<TreeMenu> TreeMenuServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getTreeMenuRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<TreeMenu> TreeMenuServiceImpl.getEntityType() {
        return TreeMenu.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> TreeMenuServiceImpl.getIdType() {
        return Long.class;
    }
    
}
