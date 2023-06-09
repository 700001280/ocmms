// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.pm.configuration.OperationRelationship;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.ocmms.cmms.model.pm.workorder.WorkOrderTimeSheet;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.OperationRelationshipDeserializer;
import com.ocmms.cmms.web.OperationalWorkCenterDeserializer;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.WorkOrderHeaderDeserializer;
import com.ocmms.cmms.web.WorkOrderOperationJsonMixin;
import java.util.Set;

privileged aspect WorkOrderOperationJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<WorkOrderTimeSheet> WorkOrderOperationJsonMixin.timeSheets;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = OperationRelationshipDeserializer.class)
    private OperationRelationship WorkOrderOperationJsonMixin.operationRelationship;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = OperationalWorkCenterDeserializer.class)
    private OperationalWorkCenter WorkOrderOperationJsonMixin.operationalWorkCenter;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus WorkOrderOperationJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = WorkOrderHeaderDeserializer.class)
    private WorkOrderHeader WorkOrderOperationJsonMixin.workOrder;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<WorkOrderTimeSheet> WorkOrderOperationJsonMixin.getTimeSheets() {
        return timeSheets;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param timeSheets
     */
    public void WorkOrderOperationJsonMixin.setTimeSheets(Set<WorkOrderTimeSheet> timeSheets) {
        this.timeSheets = timeSheets;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return OperationRelationship
     */
    public OperationRelationship WorkOrderOperationJsonMixin.getOperationRelationship() {
        return operationRelationship;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param operationRelationship
     */
    public void WorkOrderOperationJsonMixin.setOperationRelationship(OperationRelationship operationRelationship) {
        this.operationRelationship = operationRelationship;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter WorkOrderOperationJsonMixin.getOperationalWorkCenter() {
        return operationalWorkCenter;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param operationalWorkCenter
     */
    public void WorkOrderOperationJsonMixin.setOperationalWorkCenter(OperationalWorkCenter operationalWorkCenter) {
        this.operationalWorkCenter = operationalWorkCenter;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus WorkOrderOperationJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void WorkOrderOperationJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderHeader
     */
    public WorkOrderHeader WorkOrderOperationJsonMixin.getWorkOrder() {
        return workOrder;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrder
     */
    public void WorkOrderOperationJsonMixin.setWorkOrder(WorkOrderHeader workOrder) {
        this.workOrder = workOrder;
    }
    
}
