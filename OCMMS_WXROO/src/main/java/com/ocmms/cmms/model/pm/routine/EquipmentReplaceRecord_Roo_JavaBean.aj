// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.routine;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

privileged aspect EquipmentReplaceRecord_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long EquipmentReplaceRecord.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets technicalObject value
     * 
     * @return TechnicalObject
     */
    public TechnicalObject EquipmentReplaceRecord.getTechnicalObject() {
        return this.technicalObject;
    }
    
    /**
     * Sets technicalObject value
     * 
     * @param technicalObject
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setTechnicalObject(TechnicalObject technicalObject) {
        this.technicalObject = technicalObject;
        return this;
    }
    
    /**
     * Gets equipment value
     * 
     * @return Equipment
     */
    public Equipment EquipmentReplaceRecord.getEquipment() {
        return this.equipment;
    }
    
    /**
     * Sets equipment value
     * 
     * @param equipment
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setEquipment(Equipment equipment) {
        this.equipment = equipment;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String EquipmentReplaceRecord.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets onlineDate value
     * 
     * @return Calendar
     */
    public Calendar EquipmentReplaceRecord.getOnlineDate() {
        return this.onlineDate;
    }
    
    /**
     * Sets onlineDate value
     * 
     * @param onlineDate
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setOnlineDate(Calendar onlineDate) {
        this.onlineDate = onlineDate;
        return this;
    }
    
    /**
     * Gets onlinePlan value
     * 
     * @return Boolean
     */
    public Boolean EquipmentReplaceRecord.getOnlinePlan() {
        return this.onlinePlan;
    }
    
    /**
     * Sets onlinePlan value
     * 
     * @param onlinePlan
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setOnlinePlan(Boolean onlinePlan) {
        this.onlinePlan = onlinePlan;
        return this;
    }
    
    /**
     * Gets onlineMaintainer value
     * 
     * @return Employee
     */
    public Employee EquipmentReplaceRecord.getOnlineMaintainer() {
        return this.onlineMaintainer;
    }
    
    /**
     * Sets onlineMaintainer value
     * 
     * @param onlineMaintainer
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setOnlineMaintainer(Employee onlineMaintainer) {
        this.onlineMaintainer = onlineMaintainer;
        return this;
    }
    
    /**
     * Gets offlineDate value
     * 
     * @return Calendar
     */
    public Calendar EquipmentReplaceRecord.getOfflineDate() {
        return this.offlineDate;
    }
    
    /**
     * Sets offlineDate value
     * 
     * @param offlineDate
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setOfflineDate(Calendar offlineDate) {
        this.offlineDate = offlineDate;
        return this;
    }
    
    /**
     * Gets offlinePlan value
     * 
     * @return Boolean
     */
    public Boolean EquipmentReplaceRecord.getOfflinePlan() {
        return this.offlinePlan;
    }
    
    /**
     * Sets offlinePlan value
     * 
     * @param offlinePlan
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setOfflinePlan(Boolean offlinePlan) {
        this.offlinePlan = offlinePlan;
        return this;
    }
    
    /**
     * Gets offlineMaintainer value
     * 
     * @return Employee
     */
    public Employee EquipmentReplaceRecord.getOfflineMaintainer() {
        return this.offlineMaintainer;
    }
    
    /**
     * Sets offlineMaintainer value
     * 
     * @param offlineMaintainer
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setOfflineMaintainer(Employee offlineMaintainer) {
        this.offlineMaintainer = offlineMaintainer;
        return this;
    }
    
    /**
     * Gets memo value
     * 
     * @return String
     */
    public String EquipmentReplaceRecord.getMemo() {
        return this.memo;
    }
    
    /**
     * Sets memo value
     * 
     * @param memo
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    
    /**
     * Gets documents value
     * 
     * @return Set
     */
    public Set<Document> EquipmentReplaceRecord.getDocuments() {
        return this.documents;
    }
    
    /**
     * Sets documents value
     * 
     * @param documents
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setDocuments(Set<Document> documents) {
        this.documents = documents;
        return this;
    }
    
    /**
     * Gets images value
     * 
     * @return Set
     */
    public Set<ImageDocument> EquipmentReplaceRecord.getImages() {
        return this.images;
    }
    
    /**
     * Sets images value
     * 
     * @param images
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setImages(Set<ImageDocument> images) {
        this.images = images;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus EquipmentReplaceRecord.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long EquipmentReplaceRecord.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar EquipmentReplaceRecord.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String EquipmentReplaceRecord.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar EquipmentReplaceRecord.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String EquipmentReplaceRecord.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return EquipmentReplaceRecord
     */
    public EquipmentReplaceRecord EquipmentReplaceRecord.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean EquipmentReplaceRecord.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof EquipmentReplaceRecord)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((EquipmentReplaceRecord) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int EquipmentReplaceRecord.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String EquipmentReplaceRecord.toString() {
        return "EquipmentReplaceRecord {" + 
                "id='" + id + '\'' + 
                ", description='" + description + '\'' + 

                ", onlinePlan='" + onlinePlan + '\'' + 

                ", offlinePlan='" + offlinePlan + '\'' + 
                ", memo='" + memo + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
