// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.configuration;

import com.ocmms.cmms.model.pm.configuration.ObjectType;
import com.ocmms.cmms.model.pm.configuration.SubObjectType;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;

privileged aspect SubObjectType_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long SubObjectType.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return SubObjectType
     */
    public SubObjectType SubObjectType.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets code value
     * 
     * @return String
     */
    public String SubObjectType.getCode() {
        return this.code;
    }
    
    /**
     * Sets code value
     * 
     * @param code
     * @return SubObjectType
     */
    public SubObjectType SubObjectType.setCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String SubObjectType.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return SubObjectType
     */
    public SubObjectType SubObjectType.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets objectType value
     * 
     * @return ObjectType
     */
    public ObjectType SubObjectType.getObjectType() {
        return this.objectType;
    }
    
    /**
     * Sets objectType value
     * 
     * @param objectType
     * @return SubObjectType
     */
    public SubObjectType SubObjectType.setObjectType(ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus SubObjectType.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return SubObjectType
     */
    public SubObjectType SubObjectType.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long SubObjectType.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return SubObjectType
     */
    public SubObjectType SubObjectType.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar SubObjectType.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return SubObjectType
     */
    public SubObjectType SubObjectType.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String SubObjectType.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return SubObjectType
     */
    public SubObjectType SubObjectType.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar SubObjectType.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return SubObjectType
     */
    public SubObjectType SubObjectType.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String SubObjectType.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return SubObjectType
     */
    public SubObjectType SubObjectType.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean SubObjectType.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof SubObjectType)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((SubObjectType) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int SubObjectType.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String SubObjectType.toString() {
        return "SubObjectType {" + 
                "id='" + id + '\'' + 
                ", code='" + code + '\'' + 
                ", description='" + description + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
