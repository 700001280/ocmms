// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringType;
import com.ocmms.cmms.model.pm.measuringpoint.Medium;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.EquipmentDeserializer;
import com.ocmms.cmms.web.MeasuringPointJsonMixin;
import com.ocmms.cmms.web.MeasuringTypeDeserializer;
import com.ocmms.cmms.web.MediumDeserializer;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.UnitOfMeasureDeserializer;
import java.util.Set;

privileged aspect MeasuringPointJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<Document> MeasuringPointJsonMixin.documents;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<ImageDocument> MeasuringPointJsonMixin.images;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = EquipmentDeserializer.class)
    private Equipment MeasuringPointJsonMixin.equipment;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MeasuringTypeDeserializer.class)
    private MeasuringType MeasuringPointJsonMixin.measuringType;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MediumDeserializer.class)
    private Medium MeasuringPointJsonMixin.medium;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus MeasuringPointJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = UnitOfMeasureDeserializer.class)
    private UnitOfMeasure MeasuringPointJsonMixin.unitOfMeasure;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<Document> MeasuringPointJsonMixin.getDocuments() {
        return documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documents
     */
    public void MeasuringPointJsonMixin.setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<ImageDocument> MeasuringPointJsonMixin.getImages() {
        return images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param images
     */
    public void MeasuringPointJsonMixin.setImages(Set<ImageDocument> images) {
        this.images = images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Equipment
     */
    public Equipment MeasuringPointJsonMixin.getEquipment() {
        return equipment;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     */
    public void MeasuringPointJsonMixin.setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MeasuringType
     */
    public MeasuringType MeasuringPointJsonMixin.getMeasuringType() {
        return measuringType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringType
     */
    public void MeasuringPointJsonMixin.setMeasuringType(MeasuringType measuringType) {
        this.measuringType = measuringType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Medium
     */
    public Medium MeasuringPointJsonMixin.getMedium() {
        return medium;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param medium
     */
    public void MeasuringPointJsonMixin.setMedium(Medium medium) {
        this.medium = medium;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus MeasuringPointJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void MeasuringPointJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UnitOfMeasure
     */
    public UnitOfMeasure MeasuringPointJsonMixin.getUnitOfMeasure() {
        return unitOfMeasure;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param unitOfMeasure
     */
    public void MeasuringPointJsonMixin.setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
    
}
