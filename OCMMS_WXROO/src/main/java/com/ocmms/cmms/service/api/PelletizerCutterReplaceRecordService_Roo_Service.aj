// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.pm.routine.PelletizerCutterReplaceRecord;
import com.ocmms.cmms.service.api.PelletizerCutterReplaceRecordService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect PelletizerCutterReplaceRecordService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PelletizerCutterReplaceRecord
     */
    public abstract PelletizerCutterReplaceRecord PelletizerCutterReplaceRecordService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizerCutterReplaceRecord
     */
    public abstract void PelletizerCutterReplaceRecordService.delete(PelletizerCutterReplaceRecord pelletizerCutterReplaceRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<PelletizerCutterReplaceRecord> PelletizerCutterReplaceRecordService.save(Iterable<PelletizerCutterReplaceRecord> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void PelletizerCutterReplaceRecordService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PelletizerCutterReplaceRecord
     */
    public abstract PelletizerCutterReplaceRecord PelletizerCutterReplaceRecordService.save(PelletizerCutterReplaceRecord entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PelletizerCutterReplaceRecord
     */
    public abstract PelletizerCutterReplaceRecord PelletizerCutterReplaceRecordService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<PelletizerCutterReplaceRecord> PelletizerCutterReplaceRecordService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<PelletizerCutterReplaceRecord> PelletizerCutterReplaceRecordService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long PelletizerCutterReplaceRecordService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PelletizerCutterReplaceRecord> PelletizerCutterReplaceRecordService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PelletizerCutterReplaceRecord> PelletizerCutterReplaceRecordService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
