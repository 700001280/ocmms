// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.MeasuringTypeJsonMixin;
import com.ocmms.cmms.web.RecordStatusDeserializer;

privileged aspect MeasuringTypeJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus MeasuringTypeJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus MeasuringTypeJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void MeasuringTypeJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
}
