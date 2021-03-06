// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.PartScrappingOutstockDetail;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.EmployeeDeserializer;
import com.ocmms.cmms.web.MaterialCatalogDeserializer;
import com.ocmms.cmms.web.PartScrappingRecordJsonMixin;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.StorageLocationDeserializer;
import java.util.Set;

privileged aspect PartScrappingRecordJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<Document> PartScrappingRecordJsonMixin.documents;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<ImageDocument> PartScrappingRecordJsonMixin.images;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<PartScrappingOutstockDetail> PartScrappingRecordJsonMixin.partScrappingOutstockDetails;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MaterialCatalogDeserializer.class)
    private MaterialCatalog PartScrappingRecordJsonMixin.materialCatalog;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = EmployeeDeserializer.class)
    private Employee PartScrappingRecordJsonMixin.partKeeper;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus PartScrappingRecordJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = StorageLocationDeserializer.class)
    private StorageLocation PartScrappingRecordJsonMixin.storageLocation;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<Document> PartScrappingRecordJsonMixin.getDocuments() {
        return documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documents
     */
    public void PartScrappingRecordJsonMixin.setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<ImageDocument> PartScrappingRecordJsonMixin.getImages() {
        return images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param images
     */
    public void PartScrappingRecordJsonMixin.setImages(Set<ImageDocument> images) {
        this.images = images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<PartScrappingOutstockDetail> PartScrappingRecordJsonMixin.getPartScrappingOutstockDetails() {
        return partScrappingOutstockDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partScrappingOutstockDetails
     */
    public void PartScrappingRecordJsonMixin.setPartScrappingOutstockDetails(Set<PartScrappingOutstockDetail> partScrappingOutstockDetails) {
        this.partScrappingOutstockDetails = partScrappingOutstockDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialCatalog
     */
    public MaterialCatalog PartScrappingRecordJsonMixin.getMaterialCatalog() {
        return materialCatalog;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     */
    public void PartScrappingRecordJsonMixin.setMaterialCatalog(MaterialCatalog materialCatalog) {
        this.materialCatalog = materialCatalog;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Employee
     */
    public Employee PartScrappingRecordJsonMixin.getPartKeeper() {
        return partKeeper;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partKeeper
     */
    public void PartScrappingRecordJsonMixin.setPartKeeper(Employee partKeeper) {
        this.partKeeper = partKeeper;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus PartScrappingRecordJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void PartScrappingRecordJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return StorageLocation
     */
    public StorageLocation PartScrappingRecordJsonMixin.getStorageLocation() {
        return storageLocation;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storageLocation
     */
    public void PartScrappingRecordJsonMixin.setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }
    
}
