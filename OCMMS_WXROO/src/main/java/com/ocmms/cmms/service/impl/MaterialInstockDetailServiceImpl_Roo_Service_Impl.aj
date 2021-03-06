// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.repository.MaterialInstockDetailRepository;
import com.ocmms.cmms.service.impl.MaterialInstockDetailServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MaterialInstockDetailServiceImpl_Roo_Service_Impl {
    
    declare @type: MaterialInstockDetailServiceImpl: @Service;
    
    declare @type: MaterialInstockDetailServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialInstockDetailRepository MaterialInstockDetailServiceImpl.materialInstockDetailRepository;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param materialInstockDetailRepository
     */
    @Autowired
    public MaterialInstockDetailServiceImpl.new(MaterialInstockDetailRepository materialInstockDetailRepository) {
        setMaterialInstockDetailRepository(materialInstockDetailRepository);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialInstockDetailRepository
     */
    public MaterialInstockDetailRepository MaterialInstockDetailServiceImpl.getMaterialInstockDetailRepository() {
        return materialInstockDetailRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialInstockDetailRepository
     */
    public void MaterialInstockDetailServiceImpl.setMaterialInstockDetailRepository(MaterialInstockDetailRepository materialInstockDetailRepository) {
        this.materialInstockDetailRepository = materialInstockDetailRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialinstockdetail
     * @return Map
     */
    public Map<String, List<MessageI18n>> MaterialInstockDetailServiceImpl.validate(MaterialInstockDetail materialinstockdetail) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialInstockDetail
     */
    @Transactional
    public void MaterialInstockDetailServiceImpl.delete(MaterialInstockDetail materialInstockDetail) {
        // Clear bidirectional many-to-one child relationship with MaterialProcurementItemDetail
        if (materialInstockDetail.getMaterialProcurementItemDetail() != null) {
            materialInstockDetail.getMaterialProcurementItemDetail().getMaterialInstockDetails().remove(materialInstockDetail);
        }
        
        getMaterialInstockDetailRepository().delete(materialInstockDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<MaterialInstockDetail> MaterialInstockDetailServiceImpl.save(Iterable<MaterialInstockDetail> entities) {
        return getMaterialInstockDetailRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void MaterialInstockDetailServiceImpl.delete(Iterable<Long> ids) {
        List<MaterialInstockDetail> toDelete = getMaterialInstockDetailRepository().findAll(ids);
        getMaterialInstockDetailRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return MaterialInstockDetail
     */
    @Transactional
    public MaterialInstockDetail MaterialInstockDetailServiceImpl.save(MaterialInstockDetail entity) {
        return getMaterialInstockDetailRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialInstockDetail
     */
    public MaterialInstockDetail MaterialInstockDetailServiceImpl.findOne(Long id) {
        return getMaterialInstockDetailRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialInstockDetail
     */
    public MaterialInstockDetail MaterialInstockDetailServiceImpl.findOneForUpdate(Long id) {
        return getMaterialInstockDetailRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<MaterialInstockDetail> MaterialInstockDetailServiceImpl.findAll(Iterable<Long> ids) {
        return getMaterialInstockDetailRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<MaterialInstockDetail> MaterialInstockDetailServiceImpl.findAll() {
        return getMaterialInstockDetailRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long MaterialInstockDetailServiceImpl.count() {
        return getMaterialInstockDetailRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialInstockDetail> MaterialInstockDetailServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getMaterialInstockDetailRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialInstockDetail> MaterialInstockDetailServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getMaterialInstockDetailRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialProcurementItemDetail
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<MaterialInstockDetail> MaterialInstockDetailServiceImpl.findByMaterialProcurementItemDetail(MaterialProcurementItemDetail materialProcurementItemDetail, GlobalSearch globalSearch, Pageable pageable) {
        return getMaterialInstockDetailRepository().findByMaterialProcurementItemDetail(materialProcurementItemDetail, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialProcurementItemDetail
     * @return Long
     */
    public long MaterialInstockDetailServiceImpl.countByMaterialProcurementItemDetail(MaterialProcurementItemDetail materialProcurementItemDetail) {
        return getMaterialInstockDetailRepository().countByMaterialProcurementItemDetail(materialProcurementItemDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<MaterialInstockDetail> MaterialInstockDetailServiceImpl.getEntityType() {
        return MaterialInstockDetail.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> MaterialInstockDetailServiceImpl.getIdType() {
        return Long.class;
    }
    
}
