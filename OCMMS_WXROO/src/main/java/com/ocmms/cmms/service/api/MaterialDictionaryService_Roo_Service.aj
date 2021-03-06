// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.mm.mdrm.MaterialDictionary;
import com.ocmms.cmms.service.api.MaterialDictionaryService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect MaterialDictionaryService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialDictionary
     */
    public abstract MaterialDictionary MaterialDictionaryService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialDictionary
     */
    public abstract void MaterialDictionaryService.delete(MaterialDictionary materialDictionary);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<MaterialDictionary> MaterialDictionaryService.save(Iterable<MaterialDictionary> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void MaterialDictionaryService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return MaterialDictionary
     */
    public abstract MaterialDictionary MaterialDictionaryService.save(MaterialDictionary entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialDictionary
     */
    public abstract MaterialDictionary MaterialDictionaryService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<MaterialDictionary> MaterialDictionaryService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<MaterialDictionary> MaterialDictionaryService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long MaterialDictionaryService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MaterialDictionary> MaterialDictionaryService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MaterialDictionary> MaterialDictionaryService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
