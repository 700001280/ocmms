// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.pm.task.TaskOperationHeader;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.MaterialCatalogDeserializer;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.TaskOperationHeaderDeserializer;
import com.ocmms.cmms.web.TaskOperationMaterialJsonMixin;

privileged aspect TaskOperationMaterialJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MaterialCatalogDeserializer.class)
    private MaterialCatalog TaskOperationMaterialJsonMixin.material;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus TaskOperationMaterialJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = TaskOperationHeaderDeserializer.class)
    private TaskOperationHeader TaskOperationMaterialJsonMixin.taskOperationHeader;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialCatalog
     */
    public MaterialCatalog TaskOperationMaterialJsonMixin.getMaterial() {
        return material;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param material
     */
    public void TaskOperationMaterialJsonMixin.setMaterial(MaterialCatalog material) {
        this.material = material;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus TaskOperationMaterialJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void TaskOperationMaterialJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return TaskOperationHeader
     */
    public TaskOperationHeader TaskOperationMaterialJsonMixin.getTaskOperationHeader() {
        return taskOperationHeader;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationHeader
     */
    public void TaskOperationMaterialJsonMixin.setTaskOperationHeader(TaskOperationHeader taskOperationHeader) {
        this.taskOperationHeader = taskOperationHeader;
    }
    
}
