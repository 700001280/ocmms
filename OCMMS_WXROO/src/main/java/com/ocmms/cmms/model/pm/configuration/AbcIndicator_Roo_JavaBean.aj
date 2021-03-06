// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.configuration;

import com.ocmms.cmms.model.pm.configuration.AbcIndicator;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

privileged aspect AbcIndicator_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long AbcIndicator.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets riskLevel value
     * 
     * @return String
     */
    public String AbcIndicator.getRiskLevel() {
        return this.riskLevel;
    }
    
    /**
     * Sets riskLevel value
     * 
     * @param riskLevel
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String AbcIndicator.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets status value
     * 
     * @return String
     */
    public String AbcIndicator.getStatus() {
        return this.status;
    }
    
    /**
     * Sets status value
     * 
     * @param status
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setStatus(String status) {
        this.status = status;
        return this;
    }
    
    /**
     * Gets indicator value
     * 
     * @return String
     */
    public String AbcIndicator.getIndicator() {
        return this.indicator;
    }
    
    /**
     * Sets indicator value
     * 
     * @param indicator
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setIndicator(String indicator) {
        this.indicator = indicator;
        return this;
    }
    
    /**
     * Gets technicalObjects value
     * 
     * @return Set
     */
    public Set<TechnicalObject> AbcIndicator.getTechnicalObjects() {
        return this.technicalObjects;
    }
    
    /**
     * Sets technicalObjects value
     * 
     * @param technicalObjects
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setTechnicalObjects(Set<TechnicalObject> technicalObjects) {
        this.technicalObjects = technicalObjects;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus AbcIndicator.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long AbcIndicator.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar AbcIndicator.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String AbcIndicator.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar AbcIndicator.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String AbcIndicator.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return AbcIndicator
     */
    public AbcIndicator AbcIndicator.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean AbcIndicator.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof AbcIndicator)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((AbcIndicator) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int AbcIndicator.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String AbcIndicator.toString() {
        return "AbcIndicator {" + 
                "id='" + id + '\'' + 
                ", riskLevel='" + riskLevel + '\'' + 
                ", description='" + description + '\'' + 
                ", status='" + status + '\'' + 
                ", indicator='" + indicator + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
