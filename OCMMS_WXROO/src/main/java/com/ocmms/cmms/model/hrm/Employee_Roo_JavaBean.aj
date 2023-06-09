// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.hrm;

import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

privileged aspect Employee_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long Employee.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return Employee
     */
    public Employee Employee.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets organization value
     * 
     * @return Organization
     */
    public Organization Employee.getOrganization() {
        return this.organization;
    }
    
    /**
     * Sets organization value
     * 
     * @param organization
     * @return Employee
     */
    public Employee Employee.setOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }
    
    /**
     * Gets costCenter value
     * 
     * @return CostCenter
     */
    public CostCenter Employee.getCostCenter() {
        return this.costCenter;
    }
    
    /**
     * Sets costCenter value
     * 
     * @param costCenter
     * @return Employee
     */
    public Employee Employee.setCostCenter(CostCenter costCenter) {
        this.costCenter = costCenter;
        return this;
    }
    
    /**
     * Gets maintWorkCenter value
     * 
     * @return MainWorkCenter
     */
    public MainWorkCenter Employee.getMaintWorkCenter() {
        return this.maintWorkCenter;
    }
    
    /**
     * Sets maintWorkCenter value
     * 
     * @param maintWorkCenter
     * @return Employee
     */
    public Employee Employee.setMaintWorkCenter(MainWorkCenter maintWorkCenter) {
        this.maintWorkCenter = maintWorkCenter;
        return this;
    }
    
    /**
     * Gets personNumber value
     * 
     * @return String
     */
    public String Employee.getPersonNumber() {
        return this.personNumber;
    }
    
    /**
     * Sets personNumber value
     * 
     * @param personNumber
     * @return Employee
     */
    public Employee Employee.setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
        return this;
    }
    
    /**
     * Gets username value
     * 
     * @return String
     */
    public String Employee.getUsername() {
        return this.username;
    }
    
    /**
     * Sets username value
     * 
     * @param username
     * @return Employee
     */
    public Employee Employee.setUsername(String username) {
        this.username = username;
        return this;
    }
    
    /**
     * Gets email value
     * 
     * @return String
     */
    public String Employee.getEmail() {
        return this.email;
    }
    
    /**
     * Sets email value
     * 
     * @param email
     * @return Employee
     */
    public Employee Employee.setEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * Gets phone value
     * 
     * @return String
     */
    public String Employee.getPhone() {
        return this.phone;
    }
    
    /**
     * Sets phone value
     * 
     * @param phone
     * @return Employee
     */
    public Employee Employee.setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    
    /**
     * Gets firstName value
     * 
     * @return String
     */
    public String Employee.getFirstName() {
        return this.firstName;
    }
    
    /**
     * Sets firstName value
     * 
     * @param firstName
     * @return Employee
     */
    public Employee Employee.setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    /**
     * Gets lastName value
     * 
     * @return String
     */
    public String Employee.getLastName() {
        return this.lastName;
    }
    
    /**
     * Sets lastName value
     * 
     * @param lastName
     * @return Employee
     */
    public Employee Employee.setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    /**
     * Gets title value
     * 
     * @return String
     */
    public String Employee.getTitle() {
        return this.title;
    }
    
    /**
     * Sets title value
     * 
     * @param title
     * @return Employee
     */
    public Employee Employee.setTitle(String title) {
        this.title = title;
        return this;
    }
    
    /**
     * Gets fax value
     * 
     * @return String
     */
    public String Employee.getFax() {
        return this.fax;
    }
    
    /**
     * Sets fax value
     * 
     * @param fax
     * @return Employee
     */
    public Employee Employee.setFax(String fax) {
        this.fax = fax;
        return this;
    }
    
    /**
     * Gets sex value
     * 
     * @return String
     */
    public String Employee.getSex() {
        return this.sex;
    }
    
    /**
     * Sets sex value
     * 
     * @param sex
     * @return Employee
     */
    public Employee Employee.setSex(String sex) {
        this.sex = sex;
        return this;
    }
    
    /**
     * Gets birthday value
     * 
     * @return Calendar
     */
    public Calendar Employee.getBirthday() {
        return this.birthday;
    }
    
    /**
     * Sets birthday value
     * 
     * @param birthday
     * @return Employee
     */
    public Employee Employee.setBirthday(Calendar birthday) {
        this.birthday = birthday;
        return this;
    }
    
    /**
     * Gets memo value
     * 
     * @return String
     */
    public String Employee.getMemo() {
        return this.memo;
    }
    
    /**
     * Sets memo value
     * 
     * @param memo
     * @return Employee
     */
    public Employee Employee.setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    
    /**
     * Gets notificationHeaders value
     * 
     * @return Set
     */
    public Set<NotificationHeader> Employee.getNotificationHeaders() {
        return this.notificationHeaders;
    }
    
    /**
     * Sets notificationHeaders value
     * 
     * @param notificationHeaders
     * @return Employee
     */
    public Employee Employee.setNotificationHeaders(Set<NotificationHeader> notificationHeaders) {
        this.notificationHeaders = notificationHeaders;
        return this;
    }
    
    /**
     * Gets documents value
     * 
     * @return Set
     */
    public Set<Document> Employee.getDocuments() {
        return this.documents;
    }
    
    /**
     * Sets documents value
     * 
     * @param documents
     * @return Employee
     */
    public Employee Employee.setDocuments(Set<Document> documents) {
        this.documents = documents;
        return this;
    }
    
    /**
     * Gets images value
     * 
     * @return Set
     */
    public Set<ImageDocument> Employee.getImages() {
        return this.images;
    }
    
    /**
     * Sets images value
     * 
     * @param images
     * @return Employee
     */
    public Employee Employee.setImages(Set<ImageDocument> images) {
        this.images = images;
        return this;
    }
    
    /**
     * Gets taskTrackings value
     * 
     * @return Set
     */
    public Set<TaskTracking> Employee.getTaskTrackings() {
        return this.taskTrackings;
    }
    
    /**
     * Sets taskTrackings value
     * 
     * @param taskTrackings
     * @return Employee
     */
    public Employee Employee.setTaskTrackings(Set<TaskTracking> taskTrackings) {
        this.taskTrackings = taskTrackings;
        return this;
    }
    
    /**
     * Gets workLogs value
     * 
     * @return Set
     */
    public Set<WorkLog> Employee.getWorkLogs() {
        return this.workLogs;
    }
    
    /**
     * Sets workLogs value
     * 
     * @param workLogs
     * @return Employee
     */
    public Employee Employee.setWorkLogs(Set<WorkLog> workLogs) {
        this.workLogs = workLogs;
        return this;
    }
    
    /**
     * Gets procurementItemDetails value
     * 
     * @return Set
     */
    public Set<ProcurementItemDetail> Employee.getProcurementItemDetails() {
        return this.procurementItemDetails;
    }
    
    /**
     * Sets procurementItemDetails value
     * 
     * @param procurementItemDetails
     * @return Employee
     */
    public Employee Employee.setProcurementItemDetails(Set<ProcurementItemDetail> procurementItemDetails) {
        this.procurementItemDetails = procurementItemDetails;
        return this;
    }
    
    /**
     * Gets procurementRequests value
     * 
     * @return Set
     */
    public Set<ProcurementRequest> Employee.getProcurementRequests() {
        return this.procurementRequests;
    }
    
    /**
     * Sets procurementRequests value
     * 
     * @param procurementRequests
     * @return Employee
     */
    public Employee Employee.setProcurementRequests(Set<ProcurementRequest> procurementRequests) {
        this.procurementRequests = procurementRequests;
        return this;
    }
    
    /**
     * Gets preventiveMaintenanceStandards value
     * 
     * @return Set
     */
    public Set<PreventiveMaintenanceStandard> Employee.getPreventiveMaintenanceStandards() {
        return this.preventiveMaintenanceStandards;
    }
    
    /**
     * Sets preventiveMaintenanceStandards value
     * 
     * @param preventiveMaintenanceStandards
     * @return Employee
     */
    public Employee Employee.setPreventiveMaintenanceStandards(Set<PreventiveMaintenanceStandard> preventiveMaintenanceStandards) {
        this.preventiveMaintenanceStandards = preventiveMaintenanceStandards;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus Employee.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return Employee
     */
    public Employee Employee.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long Employee.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return Employee
     */
    public Employee Employee.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar Employee.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return Employee
     */
    public Employee Employee.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String Employee.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return Employee
     */
    public Employee Employee.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar Employee.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return Employee
     */
    public Employee Employee.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String Employee.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return Employee
     */
    public Employee Employee.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean Employee.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof Employee)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Employee) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int Employee.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Employee.toString() {
        return "Employee {" + 
                "id='" + id + '\'' + 
                ", personNumber='" + personNumber + '\'' + 
                ", username='" + username + '\'' + 
                ", email='" + email + '\'' + 
                ", phone='" + phone + '\'' + 
                ", firstName='" + firstName + '\'' + 
                ", lastName='" + lastName + '\'' + 
                ", title='" + title + '\'' + 
                ", fax='" + fax + '\'' + 
                ", sex='" + sex + '\'' + 

                ", memo='" + memo + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
