// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.TaskTrackingTypeJsonMixin;
import java.util.Set;

privileged aspect TaskTrackingTypeJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<TaskTracking> TaskTrackingTypeJsonMixin.taskTrackings;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus TaskTrackingTypeJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<TaskTracking> TaskTrackingTypeJsonMixin.getTaskTrackings() {
        return taskTrackings;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskTrackings
     */
    public void TaskTrackingTypeJsonMixin.setTaskTrackings(Set<TaskTracking> taskTrackings) {
        this.taskTrackings = taskTrackings;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus TaskTrackingTypeJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void TaskTrackingTypeJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
}
