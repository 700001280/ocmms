// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.pm;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

privileged aspect PreventiveMaintenanceStandard_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long PreventiveMaintenanceStandard.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets code value
     * 
     * @return String
     */
    public String PreventiveMaintenanceStandard.getCode() {
        return this.code;
    }
    
    /**
     * Sets code value
     * 
     * @param code
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String PreventiveMaintenanceStandard.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets owner value
     * 
     * @return Employee
     */
    public Employee PreventiveMaintenanceStandard.getOwner() {
        return this.owner;
    }
    
    /**
     * Sets owner value
     * 
     * @param owner
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setOwner(Employee owner) {
        this.owner = owner;
        return this;
    }
    
    /**
     * Gets technicalObjects value
     * 
     * @return Set
     */
    public Set<TechnicalObject> PreventiveMaintenanceStandard.getTechnicalObjects() {
        return this.technicalObjects;
    }
    
    /**
     * Sets technicalObjects value
     * 
     * @param technicalObjects
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setTechnicalObjects(Set<TechnicalObject> technicalObjects) {
        this.technicalObjects = technicalObjects;
        return this;
    }
    
    /**
     * Gets preventiveMaintenanceContents value
     * 
     * @return Set
     */
    public Set<PreventiveMaintenanceContent> PreventiveMaintenanceStandard.getPreventiveMaintenanceContents() {
        return this.preventiveMaintenanceContents;
    }
    
    /**
     * Sets preventiveMaintenanceContents value
     * 
     * @param preventiveMaintenanceContents
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setPreventiveMaintenanceContents(Set<PreventiveMaintenanceContent> preventiveMaintenanceContents) {
        this.preventiveMaintenanceContents = preventiveMaintenanceContents;
        return this;
    }
    
    /**
     * Gets organization value
     * 
     * @return Organization
     */
    public Organization PreventiveMaintenanceStandard.getOrganization() {
        return this.organization;
    }
    
    /**
     * Sets organization value
     * 
     * @param organization
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }
    
    /**
     * Gets documents value
     * 
     * @return Set
     */
    public Set<Document> PreventiveMaintenanceStandard.getDocuments() {
        return this.documents;
    }
    
    /**
     * Sets documents value
     * 
     * @param documents
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setDocuments(Set<Document> documents) {
        this.documents = documents;
        return this;
    }
    
    /**
     * Gets images value
     * 
     * @return Set
     */
    public Set<ImageDocument> PreventiveMaintenanceStandard.getImages() {
        return this.images;
    }
    
    /**
     * Sets images value
     * 
     * @param images
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setImages(Set<ImageDocument> images) {
        this.images = images;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus PreventiveMaintenanceStandard.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long PreventiveMaintenanceStandard.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar PreventiveMaintenanceStandard.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String PreventiveMaintenanceStandard.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar PreventiveMaintenanceStandard.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String PreventiveMaintenanceStandard.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return PreventiveMaintenanceStandard
     */
    public PreventiveMaintenanceStandard PreventiveMaintenanceStandard.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean PreventiveMaintenanceStandard.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof PreventiveMaintenanceStandard)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((PreventiveMaintenanceStandard) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int PreventiveMaintenanceStandard.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String PreventiveMaintenanceStandard.toString() {
        return "PreventiveMaintenanceStandard {" + 
                "id='" + id + '\'' + 
                ", code='" + code + '\'' + 
                ", description='" + description + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
