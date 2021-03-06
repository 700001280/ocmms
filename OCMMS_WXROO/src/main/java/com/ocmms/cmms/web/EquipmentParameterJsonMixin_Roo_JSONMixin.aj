// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.EquipmentParameterJsonMixin;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.UnitOfMeasureDeserializer;
import java.util.Set;

privileged aspect EquipmentParameterJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<Document> EquipmentParameterJsonMixin.documents;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<ImageDocument> EquipmentParameterJsonMixin.images;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus EquipmentParameterJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = UnitOfMeasureDeserializer.class)
    private UnitOfMeasure EquipmentParameterJsonMixin.unit;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<Document> EquipmentParameterJsonMixin.getDocuments() {
        return documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documents
     */
    public void EquipmentParameterJsonMixin.setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<ImageDocument> EquipmentParameterJsonMixin.getImages() {
        return images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param images
     */
    public void EquipmentParameterJsonMixin.setImages(Set<ImageDocument> images) {
        this.images = images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus EquipmentParameterJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void EquipmentParameterJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UnitOfMeasure
     */
    public UnitOfMeasure EquipmentParameterJsonMixin.getUnit() {
        return unit;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param unit
     */
    public void EquipmentParameterJsonMixin.setUnit(UnitOfMeasure unit) {
        this.unit = unit;
    }
    
}
