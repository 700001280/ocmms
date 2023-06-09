// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.asset;

import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

privileged aspect AssetClassification_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long AssetClassification.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets code value
     * 
     * @return String
     */
    public String AssetClassification.getCode() {
        return this.code;
    }
    
    /**
     * Sets code value
     * 
     * @param code
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String AssetClassification.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets equipments value
     * 
     * @return Set
     */
    public Set<Equipment> AssetClassification.getEquipments() {
        return this.equipments;
    }
    
    /**
     * Sets equipments value
     * 
     * @param equipments
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
        return this;
    }
    
    /**
     * Gets documents value
     * 
     * @return Set
     */
    public Set<Document> AssetClassification.getDocuments() {
        return this.documents;
    }
    
    /**
     * Sets documents value
     * 
     * @param documents
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setDocuments(Set<Document> documents) {
        this.documents = documents;
        return this;
    }
    
    /**
     * Gets images value
     * 
     * @return Set
     */
    public Set<ImageDocument> AssetClassification.getImages() {
        return this.images;
    }
    
    /**
     * Sets images value
     * 
     * @param images
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setImages(Set<ImageDocument> images) {
        this.images = images;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus AssetClassification.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long AssetClassification.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar AssetClassification.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String AssetClassification.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar AssetClassification.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String AssetClassification.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return AssetClassification
     */
    public AssetClassification AssetClassification.setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    /**
     * This `equals` implementation is specific for JPA entities and uses 
     * the entity identifier for it, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @param obj
     * @return Boolean
     */
    public boolean AssetClassification.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof AssetClassification)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((AssetClassification) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int AssetClassification.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String AssetClassification.toString() {
        return "AssetClassification {" + 
                "id='" + id + '\'' + 
                ", code='" + code + '\'' + 
                ", description='" + description + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
