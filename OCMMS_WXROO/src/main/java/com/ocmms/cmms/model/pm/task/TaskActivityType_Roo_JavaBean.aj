// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.task;

import com.ocmms.cmms.model.pm.task.TaskActivityType;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;

privileged aspect TaskActivityType_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long TaskActivityType.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return TaskActivityType
     */
    public TaskActivityType TaskActivityType.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets code value
     * 
     * @return String
     */
    public String TaskActivityType.getCode() {
        return this.code;
    }
    
    /**
     * Sets code value
     * 
     * @param code
     * @return TaskActivityType
     */
    public TaskActivityType TaskActivityType.setCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String TaskActivityType.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return TaskActivityType
     */
    public TaskActivityType TaskActivityType.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus TaskActivityType.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return TaskActivityType
     */
    public TaskActivityType TaskActivityType.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long TaskActivityType.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return TaskActivityType
     */
    public TaskActivityType TaskActivityType.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar TaskActivityType.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return TaskActivityType
     */
    public TaskActivityType TaskActivityType.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String TaskActivityType.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return TaskActivityType
     */
    public TaskActivityType TaskActivityType.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar TaskActivityType.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return TaskActivityType
     */
    public TaskActivityType TaskActivityType.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String TaskActivityType.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return TaskActivityType
     */
    public TaskActivityType TaskActivityType.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean TaskActivityType.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof TaskActivityType)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((TaskActivityType) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int TaskActivityType.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String TaskActivityType.toString() {
        return "TaskActivityType {" + 
                "id='" + id + '\'' + 
                ", code='" + code + '\'' + 
                ", description='" + description + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
