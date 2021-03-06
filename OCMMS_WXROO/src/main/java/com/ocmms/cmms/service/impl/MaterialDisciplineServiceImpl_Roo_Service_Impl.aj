// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.mm.master.MaterialDiscipline;
import com.ocmms.cmms.repository.MaterialDisciplineRepository;
import com.ocmms.cmms.service.impl.MaterialDisciplineServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MaterialDisciplineServiceImpl_Roo_Service_Impl {
    
    declare @type: MaterialDisciplineServiceImpl: @Service;
    
    declare @type: MaterialDisciplineServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialDisciplineRepository MaterialDisciplineServiceImpl.materialDisciplineRepository;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param materialDisciplineRepository
     */
    @Autowired
    public MaterialDisciplineServiceImpl.new(MaterialDisciplineRepository materialDisciplineRepository) {
        setMaterialDisciplineRepository(materialDisciplineRepository);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialDisciplineRepository
     */
    public MaterialDisciplineRepository MaterialDisciplineServiceImpl.getMaterialDisciplineRepository() {
        return materialDisciplineRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialDisciplineRepository
     */
    public void MaterialDisciplineServiceImpl.setMaterialDisciplineRepository(MaterialDisciplineRepository materialDisciplineRepository) {
        this.materialDisciplineRepository = materialDisciplineRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialdiscipline
     * @return Map
     */
    public Map<String, List<MessageI18n>> MaterialDisciplineServiceImpl.validate(MaterialDiscipline materialdiscipline) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialDiscipline
     */
    @Transactional
    public void MaterialDisciplineServiceImpl.delete(MaterialDiscipline materialDiscipline) {
        getMaterialDisciplineRepository().delete(materialDiscipline);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<MaterialDiscipline> MaterialDisciplineServiceImpl.save(Iterable<MaterialDiscipline> entities) {
        return getMaterialDisciplineRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void MaterialDisciplineServiceImpl.delete(Iterable<Long> ids) {
        List<MaterialDiscipline> toDelete = getMaterialDisciplineRepository().findAll(ids);
        getMaterialDisciplineRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return MaterialDiscipline
     */
    @Transactional
    public MaterialDiscipline MaterialDisciplineServiceImpl.save(MaterialDiscipline entity) {
        return getMaterialDisciplineRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialDiscipline
     */
    public MaterialDiscipline MaterialDisciplineServiceImpl.findOne(Long id) {
        return getMaterialDisciplineRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialDiscipline
     */
    public MaterialDiscipline MaterialDisciplineServiceImpl.findOneForUpdate(Long id) {
        return getMaterialDisciplineRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<MaterialDiscipline> MaterialDisciplineServiceImpl.findAll(Iterable<Long> ids) {
        return getMaterialDisciplineRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<MaterialDiscipline> MaterialDisciplineServiceImpl.findAll() {
        return getMaterialDisciplineRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long MaterialDisciplineServiceImpl.count() {
        return getMaterialDisciplineRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialDiscipline> MaterialDisciplineServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getMaterialDisciplineRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialDiscipline> MaterialDisciplineServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getMaterialDisciplineRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<MaterialDiscipline> MaterialDisciplineServiceImpl.getEntityType() {
        return MaterialDiscipline.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> MaterialDisciplineServiceImpl.getIdType() {
        return Long.class;
    }
    
}
