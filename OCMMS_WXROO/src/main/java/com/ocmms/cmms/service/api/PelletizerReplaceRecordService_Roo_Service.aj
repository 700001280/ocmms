// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.pm.routine.PelletizerReplaceRecord;
import com.ocmms.cmms.service.api.PelletizerReplaceRecordService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect PelletizerReplaceRecordService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PelletizerReplaceRecord
     */
    public abstract PelletizerReplaceRecord PelletizerReplaceRecordService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizerReplaceRecord
     */
    public abstract void PelletizerReplaceRecordService.delete(PelletizerReplaceRecord pelletizerReplaceRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<PelletizerReplaceRecord> PelletizerReplaceRecordService.save(Iterable<PelletizerReplaceRecord> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void PelletizerReplaceRecordService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PelletizerReplaceRecord
     */
    public abstract PelletizerReplaceRecord PelletizerReplaceRecordService.save(PelletizerReplaceRecord entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PelletizerReplaceRecord
     */
    public abstract PelletizerReplaceRecord PelletizerReplaceRecordService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<PelletizerReplaceRecord> PelletizerReplaceRecordService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<PelletizerReplaceRecord> PelletizerReplaceRecordService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long PelletizerReplaceRecordService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PelletizerReplaceRecord> PelletizerReplaceRecordService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PelletizerReplaceRecord> PelletizerReplaceRecordService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
