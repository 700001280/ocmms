// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.assistance.WorkLogType;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.service.api.WorkLogService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect WorkLogService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return WorkLog
     */
    public abstract WorkLog WorkLogService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLog
     */
    public abstract void WorkLogService.delete(WorkLog workLog);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<WorkLog> WorkLogService.save(Iterable<WorkLog> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void WorkLogService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return WorkLog
     */
    public abstract WorkLog WorkLogService.save(WorkLog entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return WorkLog
     */
    public abstract WorkLog WorkLogService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<WorkLog> WorkLogService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<WorkLog> WorkLogService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long WorkLogService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<WorkLog> WorkLogService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<WorkLog> WorkLogService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLog
     * @param documentsToAdd
     * @return WorkLog
     */
    public abstract WorkLog WorkLogService.addToDocuments(WorkLog workLog, Iterable<Long> documentsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLog
     * @param documentsToRemove
     * @return WorkLog
     */
    public abstract WorkLog WorkLogService.removeFromDocuments(WorkLog workLog, Iterable<Long> documentsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLog
     * @param documents
     * @return WorkLog
     */
    public abstract WorkLog WorkLogService.setDocuments(WorkLog workLog, Iterable<Long> documents);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLog
     * @param imagesToAdd
     * @return WorkLog
     */
    public abstract WorkLog WorkLogService.addToImages(WorkLog workLog, Iterable<Long> imagesToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLog
     * @param imagesToRemove
     * @return WorkLog
     */
    public abstract WorkLog WorkLogService.removeFromImages(WorkLog workLog, Iterable<Long> imagesToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLog
     * @param images
     * @return WorkLog
     */
    public abstract WorkLog WorkLogService.setImages(WorkLog workLog, Iterable<Long> images);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param logger
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<WorkLog> WorkLogService.findByLogger(Employee logger, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLogType
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<WorkLog> WorkLogService.findByWorkLogType(WorkLogType workLogType, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param logger
     * @return Long
     */
    public abstract long WorkLogService.countByLogger(Employee logger);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLogType
     * @return Long
     */
    public abstract long WorkLogService.countByWorkLogType(WorkLogType workLogType);
    
}
