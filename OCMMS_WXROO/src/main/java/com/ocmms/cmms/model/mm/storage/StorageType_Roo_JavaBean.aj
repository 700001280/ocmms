// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.mm.storage;

import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import com.ocmms.cmms.model.mm.storage.StorageType;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

privileged aspect StorageType_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long StorageType.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return StorageType
     */
    public StorageType StorageType.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets code value
     * 
     * @return String
     */
    public String StorageType.getCode() {
        return this.code;
    }
    
    /**
     * Sets code value
     * 
     * @param code
     * @return StorageType
     */
    public StorageType StorageType.setCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * Gets memo value
     * 
     * @return String
     */
    public String StorageType.getMemo() {
        return this.memo;
    }
    
    /**
     * Sets memo value
     * 
     * @param memo
     * @return StorageType
     */
    public StorageType StorageType.setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String StorageType.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return StorageType
     */
    public StorageType StorageType.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets instockDetails value
     * 
     * @return Set
     */
    public Set<InstockDetail> StorageType.getInstockDetails() {
        return this.instockDetails;
    }
    
    /**
     * Sets instockDetails value
     * 
     * @param instockDetails
     * @return StorageType
     */
    public StorageType StorageType.setInstockDetails(Set<InstockDetail> instockDetails) {
        this.instockDetails = instockDetails;
        return this;
    }
    
    /**
     * Gets outstockDetails value
     * 
     * @return Set
     */
    public Set<OutstockDetail> StorageType.getOutstockDetails() {
        return this.outstockDetails;
    }
    
    /**
     * Sets outstockDetails value
     * 
     * @param outstockDetails
     * @return StorageType
     */
    public StorageType StorageType.setOutstockDetails(Set<OutstockDetail> outstockDetails) {
        this.outstockDetails = outstockDetails;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus StorageType.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return StorageType
     */
    public StorageType StorageType.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long StorageType.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return StorageType
     */
    public StorageType StorageType.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar StorageType.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return StorageType
     */
    public StorageType StorageType.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String StorageType.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return StorageType
     */
    public StorageType StorageType.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar StorageType.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return StorageType
     */
    public StorageType StorageType.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String StorageType.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return StorageType
     */
    public StorageType StorageType.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean StorageType.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof StorageType)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((StorageType) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int StorageType.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String StorageType.toString() {
        return "StorageType {" + 
                "id='" + id + '\'' + 
                ", code='" + code + '\'' + 
                ", memo='" + memo + '\'' + 
                ", description='" + description + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
