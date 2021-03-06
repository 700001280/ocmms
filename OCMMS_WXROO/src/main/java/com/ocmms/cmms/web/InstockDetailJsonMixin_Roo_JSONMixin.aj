// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.MovementType;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.mm.storage.StorageType;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.EmployeeDeserializer;
import com.ocmms.cmms.web.InstockDetailJsonMixin;
import com.ocmms.cmms.web.MaterialCatalogDeserializer;
import com.ocmms.cmms.web.MovementTypeDeserializer;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.StorageLocationDeserializer;
import com.ocmms.cmms.web.StorageTypeDeserializer;
import java.util.Set;

privileged aspect InstockDetailJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<Document> InstockDetailJsonMixin.documents;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<ImageDocument> InstockDetailJsonMixin.images;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = EmployeeDeserializer.class)
    private Employee InstockDetailJsonMixin.keeper;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MaterialCatalogDeserializer.class)
    private MaterialCatalog InstockDetailJsonMixin.materialCatalog;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MovementTypeDeserializer.class)
    private MovementType InstockDetailJsonMixin.movementType;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = EmployeeDeserializer.class)
    private Employee InstockDetailJsonMixin.receiver;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus InstockDetailJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = StorageLocationDeserializer.class)
    private StorageLocation InstockDetailJsonMixin.storageLocation;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = StorageTypeDeserializer.class)
    private StorageType InstockDetailJsonMixin.storageType;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<Document> InstockDetailJsonMixin.getDocuments() {
        return documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documents
     */
    public void InstockDetailJsonMixin.setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<ImageDocument> InstockDetailJsonMixin.getImages() {
        return images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param images
     */
    public void InstockDetailJsonMixin.setImages(Set<ImageDocument> images) {
        this.images = images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Employee
     */
    public Employee InstockDetailJsonMixin.getKeeper() {
        return keeper;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param keeper
     */
    public void InstockDetailJsonMixin.setKeeper(Employee keeper) {
        this.keeper = keeper;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialCatalog
     */
    public MaterialCatalog InstockDetailJsonMixin.getMaterialCatalog() {
        return materialCatalog;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     */
    public void InstockDetailJsonMixin.setMaterialCatalog(MaterialCatalog materialCatalog) {
        this.materialCatalog = materialCatalog;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MovementType
     */
    public MovementType InstockDetailJsonMixin.getMovementType() {
        return movementType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementType
     */
    public void InstockDetailJsonMixin.setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Employee
     */
    public Employee InstockDetailJsonMixin.getReceiver() {
        return receiver;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param receiver
     */
    public void InstockDetailJsonMixin.setReceiver(Employee receiver) {
        this.receiver = receiver;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus InstockDetailJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void InstockDetailJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return StorageLocation
     */
    public StorageLocation InstockDetailJsonMixin.getStorageLocation() {
        return storageLocation;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storageLocation
     */
    public void InstockDetailJsonMixin.setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return StorageType
     */
    public StorageType InstockDetailJsonMixin.getStorageType() {
        return storageType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storageType
     */
    public void InstockDetailJsonMixin.setStorageType(StorageType storageType) {
        this.storageType = storageType;
    }
    
}
