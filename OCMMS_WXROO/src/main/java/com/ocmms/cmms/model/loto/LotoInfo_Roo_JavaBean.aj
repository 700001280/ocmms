// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.loto;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.loto.LotoBaseInfo;
import com.ocmms.cmms.model.loto.LotoDetail;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.loto.LotoIssueReport;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

privileged aspect LotoInfo_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long LotoInfo.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets lotoTag value
     * 
     * @return String
     */
    public String LotoInfo.getLotoTag() {
        return this.lotoTag;
    }
    
    /**
     * Sets lotoTag value
     * 
     * @param lotoTag
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setLotoTag(String lotoTag) {
        this.lotoTag = lotoTag;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String LotoInfo.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets equipment value
     * 
     * @return Equipment
     */
    public Equipment LotoInfo.getEquipment() {
        return this.equipment;
    }
    
    /**
     * Sets equipment value
     * 
     * @param equipment
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setEquipment(Equipment equipment) {
        this.equipment = equipment;
        return this;
    }
    
    /**
     * Gets lotoDetails value
     * 
     * @return Set
     */
    public Set<LotoDetail> LotoInfo.getLotoDetails() {
        return this.lotoDetails;
    }
    
    /**
     * Sets lotoDetails value
     * 
     * @param lotoDetails
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setLotoDetails(Set<LotoDetail> lotoDetails) {
        this.lotoDetails = lotoDetails;
        return this;
    }
    
    /**
     * Gets documents value
     * 
     * @return Set
     */
    public Set<Document> LotoInfo.getDocuments() {
        return this.documents;
    }
    
    /**
     * Sets documents value
     * 
     * @param documents
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setDocuments(Set<Document> documents) {
        this.documents = documents;
        return this;
    }
    
    /**
     * Gets images value
     * 
     * @return Set
     */
    public Set<ImageDocument> LotoInfo.getImages() {
        return this.images;
    }
    
    /**
     * Sets images value
     * 
     * @param images
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setImages(Set<ImageDocument> images) {
        this.images = images;
        return this;
    }
    
    /**
     * Gets lotoIssueReports value
     * 
     * @return Set
     */
    public Set<LotoIssueReport> LotoInfo.getLotoIssueReports() {
        return this.lotoIssueReports;
    }
    
    /**
     * Sets lotoIssueReports value
     * 
     * @param lotoIssueReports
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setLotoIssueReports(Set<LotoIssueReport> lotoIssueReports) {
        this.lotoIssueReports = lotoIssueReports;
        return this;
    }
    
    /**
     * Gets developedBy value
     * 
     * @return Employee
     */
    public Employee LotoInfo.getDevelopedBy() {
        return this.developedBy;
    }
    
    /**
     * Sets developedBy value
     * 
     * @param developedBy
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setDevelopedBy(Employee developedBy) {
        this.developedBy = developedBy;
        return this;
    }
    
    /**
     * Gets reviewedBy value
     * 
     * @return Employee
     */
    public Employee LotoInfo.getReviewedBy() {
        return this.reviewedBy;
    }
    
    /**
     * Sets reviewedBy value
     * 
     * @param reviewedBy
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setReviewedBy(Employee reviewedBy) {
        this.reviewedBy = reviewedBy;
        return this;
    }
    
    /**
     * Gets revisedBy value
     * 
     * @return Employee
     */
    public Employee LotoInfo.getRevisedBy() {
        return this.revisedBy;
    }
    
    /**
     * Sets revisedBy value
     * 
     * @param revisedBy
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setRevisedBy(Employee revisedBy) {
        this.revisedBy = revisedBy;
        return this;
    }
    
    /**
     * Gets note value
     * 
     * @return String
     */
    public String LotoInfo.getNote() {
        return this.note;
    }
    
    /**
     * Sets note value
     * 
     * @param note
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setNote(String note) {
        this.note = note;
        return this;
    }
    
    /**
     * Gets nextAuditDate value
     * 
     * @return Calendar
     */
    public Calendar LotoInfo.getNextAuditDate() {
        return this.nextAuditDate;
    }
    
    /**
     * Sets nextAuditDate value
     * 
     * @param nextAuditDate
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setNextAuditDate(Calendar nextAuditDate) {
        this.nextAuditDate = nextAuditDate;
        return this;
    }
    
    /**
     * Gets barUrl value
     * 
     * @return String
     */
    public String LotoInfo.getBarUrl() {
        return this.barUrl;
    }
    
    /**
     * Sets barUrl value
     * 
     * @param barUrl
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setBarUrl(String barUrl) {
        this.barUrl = barUrl;
        return this;
    }
    
    /**
     * Gets lotoBaseInfo value
     * 
     * @return LotoBaseInfo
     */
    public LotoBaseInfo LotoInfo.getLotoBaseInfo() {
        return this.lotoBaseInfo;
    }
    
    /**
     * Sets lotoBaseInfo value
     * 
     * @param lotoBaseInfo
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setLotoBaseInfo(LotoBaseInfo lotoBaseInfo) {
        this.lotoBaseInfo = lotoBaseInfo;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus LotoInfo.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long LotoInfo.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar LotoInfo.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String LotoInfo.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar LotoInfo.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String LotoInfo.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return LotoInfo
     */
    public LotoInfo LotoInfo.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean LotoInfo.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof LotoInfo)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((LotoInfo) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int LotoInfo.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String LotoInfo.toString() {
        return "LotoInfo {" + 
                "id='" + id + '\'' + 
                ", lotoTag='" + lotoTag + '\'' + 
                ", description='" + description + '\'' + 
                ", note='" + note + '\'' + 

                ", barUrl='" + barUrl + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
