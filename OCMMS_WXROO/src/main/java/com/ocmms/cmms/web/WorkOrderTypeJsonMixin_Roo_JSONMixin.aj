// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.WorkOrderTypeJsonMixin;
import java.util.Set;

privileged aspect WorkOrderTypeJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<WorkOrderHeader> WorkOrderTypeJsonMixin.workOrderHeaders;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus WorkOrderTypeJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<WorkOrderHeader> WorkOrderTypeJsonMixin.getWorkOrderHeaders() {
        return workOrderHeaders;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeaders
     */
    public void WorkOrderTypeJsonMixin.setWorkOrderHeaders(Set<WorkOrderHeader> workOrderHeaders) {
        this.workOrderHeaders = workOrderHeaders;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus WorkOrderTypeJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void WorkOrderTypeJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
}
