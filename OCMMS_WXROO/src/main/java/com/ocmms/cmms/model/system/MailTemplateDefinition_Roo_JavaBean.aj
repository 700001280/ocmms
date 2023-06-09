// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.system;

import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.system.MailTemplateDefinition;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;

privileged aspect MailTemplateDefinition_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long MailTemplateDefinition.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets template value
     * 
     * @return String
     */
    public String MailTemplateDefinition.getTemplate() {
        return this.template;
    }
    
    /**
     * Sets template value
     * 
     * @param template
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setTemplate(String template) {
        this.template = template;
        return this;
    }
    
    /**
     * Gets className value
     * 
     * @return String
     */
    public String MailTemplateDefinition.getClassName() {
        return this.className;
    }
    
    /**
     * Sets className value
     * 
     * @param className
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setClassName(String className) {
        this.className = className;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String MailTemplateDefinition.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets title value
     * 
     * @return String
     */
    public String MailTemplateDefinition.getTitle() {
        return this.title;
    }
    
    /**
     * Sets title value
     * 
     * @param title
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setTitle(String title) {
        this.title = title;
        return this;
    }
    
    /**
     * Gets toReceivers value
     * 
     * @return String
     */
    public String MailTemplateDefinition.getToReceivers() {
        return this.toReceivers;
    }
    
    /**
     * Sets toReceivers value
     * 
     * @param toReceivers
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setToReceivers(String toReceivers) {
        this.toReceivers = toReceivers;
        return this;
    }
    
    /**
     * Gets ccReceivers value
     * 
     * @return String
     */
    public String MailTemplateDefinition.getCcReceivers() {
        return this.ccReceivers;
    }
    
    /**
     * Sets ccReceivers value
     * 
     * @param ccReceivers
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setCcReceivers(String ccReceivers) {
        this.ccReceivers = ccReceivers;
        return this;
    }
    
    /**
     * Gets receiverName value
     * 
     * @return String
     */
    public String MailTemplateDefinition.getReceiverName() {
        return this.receiverName;
    }
    
    /**
     * Sets receiverName value
     * 
     * @param receiverName
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
    
    /**
     * Gets Owner value
     * 
     * @return Employee
     */
    public Employee MailTemplateDefinition.getOwner() {
        return this.Owner;
    }
    
    /**
     * Sets Owner value
     * 
     * @param Owner
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setOwner(Employee Owner) {
        this.Owner = Owner;
        return this;
    }
    
    /**
     * Gets systemDefault value
     * 
     * @return Boolean
     */
    public Boolean MailTemplateDefinition.getSystemDefault() {
        return this.systemDefault;
    }
    
    /**
     * Sets systemDefault value
     * 
     * @param systemDefault
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setSystemDefault(Boolean systemDefault) {
        this.systemDefault = systemDefault;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus MailTemplateDefinition.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long MailTemplateDefinition.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar MailTemplateDefinition.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String MailTemplateDefinition.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar MailTemplateDefinition.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String MailTemplateDefinition.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return MailTemplateDefinition
     */
    public MailTemplateDefinition MailTemplateDefinition.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean MailTemplateDefinition.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof MailTemplateDefinition)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((MailTemplateDefinition) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int MailTemplateDefinition.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String MailTemplateDefinition.toString() {
        return "MailTemplateDefinition {" + 
                "id='" + id + '\'' + 
                ", template='" + template + '\'' + 
                ", className='" + className + '\'' + 
                ", description='" + description + '\'' + 
                ", title='" + title + '\'' + 
                ", toReceivers='" + toReceivers + '\'' + 
                ", ccReceivers='" + ccReceivers + '\'' + 
                ", receiverName='" + receiverName + '\'' + 
                ", systemDefault='" + systemDefault + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
