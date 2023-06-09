// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.system;

import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;

privileged aspect RecordStatus_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long RecordStatus.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return RecordStatus
     */
    public RecordStatus RecordStatus.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets code value
     * 
     * @return String
     */
    public String RecordStatus.getCode() {
        return this.code;
    }
    
    /**
     * Sets code value
     * 
     * @param code
     * @return RecordStatus
     */
    public RecordStatus RecordStatus.setCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String RecordStatus.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return RecordStatus
     */
    public RecordStatus RecordStatus.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long RecordStatus.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return RecordStatus
     */
    public RecordStatus RecordStatus.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar RecordStatus.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return RecordStatus
     */
    public RecordStatus RecordStatus.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String RecordStatus.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return RecordStatus
     */
    public RecordStatus RecordStatus.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar RecordStatus.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return RecordStatus
     */
    public RecordStatus RecordStatus.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String RecordStatus.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return RecordStatus
     */
    public RecordStatus RecordStatus.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean RecordStatus.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof RecordStatus)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((RecordStatus) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int RecordStatus.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String RecordStatus.toString() {
        return "RecordStatus {" + 
                "id='" + id + '\'' + 
                ", code='" + code + '\'' + 
                ", description='" + description + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
