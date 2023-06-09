// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.asset.AssetStatus;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.AssetStatusChangeRecordJsonMixin;
import com.ocmms.cmms.web.AssetStatusDeserializer;
import com.ocmms.cmms.web.EquipmentDeserializer;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import java.util.Set;

privileged aspect AssetStatusChangeRecordJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<Document> AssetStatusChangeRecordJsonMixin.documents;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<ImageDocument> AssetStatusChangeRecordJsonMixin.images;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = AssetStatusDeserializer.class)
    private AssetStatus AssetStatusChangeRecordJsonMixin.assetStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = EquipmentDeserializer.class)
    private Equipment AssetStatusChangeRecordJsonMixin.equipment;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus AssetStatusChangeRecordJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<Document> AssetStatusChangeRecordJsonMixin.getDocuments() {
        return documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documents
     */
    public void AssetStatusChangeRecordJsonMixin.setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<ImageDocument> AssetStatusChangeRecordJsonMixin.getImages() {
        return images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param images
     */
    public void AssetStatusChangeRecordJsonMixin.setImages(Set<ImageDocument> images) {
        this.images = images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return AssetStatus
     */
    public AssetStatus AssetStatusChangeRecordJsonMixin.getAssetStatus() {
        return assetStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetStatus
     */
    public void AssetStatusChangeRecordJsonMixin.setAssetStatus(AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Equipment
     */
    public Equipment AssetStatusChangeRecordJsonMixin.getEquipment() {
        return equipment;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     */
    public void AssetStatusChangeRecordJsonMixin.setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus AssetStatusChangeRecordJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void AssetStatusChangeRecordJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
}
