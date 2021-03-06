// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.StorageLocationJsonMixin;
import com.ocmms.cmms.web.WarehouseDeserializer;
import java.util.Set;

privileged aspect StorageLocationJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<InstockDetail> StorageLocationJsonMixin.instockDetails;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<MaterialStorageLocationInfo> StorageLocationJsonMixin.materialStorageLocationInfos;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<OutstockDetail> StorageLocationJsonMixin.outstockDetails;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus StorageLocationJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = WarehouseDeserializer.class)
    private Warehouse StorageLocationJsonMixin.warehouse;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<InstockDetail> StorageLocationJsonMixin.getInstockDetails() {
        return instockDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockDetails
     */
    public void StorageLocationJsonMixin.setInstockDetails(Set<InstockDetail> instockDetails) {
        this.instockDetails = instockDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<MaterialStorageLocationInfo> StorageLocationJsonMixin.getMaterialStorageLocationInfos() {
        return materialStorageLocationInfos;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialStorageLocationInfos
     */
    public void StorageLocationJsonMixin.setMaterialStorageLocationInfos(Set<MaterialStorageLocationInfo> materialStorageLocationInfos) {
        this.materialStorageLocationInfos = materialStorageLocationInfos;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<OutstockDetail> StorageLocationJsonMixin.getOutstockDetails() {
        return outstockDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param outstockDetails
     */
    public void StorageLocationJsonMixin.setOutstockDetails(Set<OutstockDetail> outstockDetails) {
        this.outstockDetails = outstockDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus StorageLocationJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void StorageLocationJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Warehouse
     */
    public Warehouse StorageLocationJsonMixin.getWarehouse() {
        return warehouse;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param warehouse
     */
    public void StorageLocationJsonMixin.setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    
}
