// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.configuration;

import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.Calendar;
import java.util.Objects;

privileged aspect OperationalWorkCenter_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long OperationalWorkCenter.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets organization value
     * 
     * @return Organization
     */
    public Organization OperationalWorkCenter.getOrganization() {
        return this.organization;
    }
    
    /**
     * Sets organization value
     * 
     * @param organization
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }
    
    /**
     * Gets mainWorkCenter value
     * 
     * @return MainWorkCenter
     */
    public MainWorkCenter OperationalWorkCenter.getMainWorkCenter() {
        return this.mainWorkCenter;
    }
    
    /**
     * Sets mainWorkCenter value
     * 
     * @param mainWorkCenter
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setMainWorkCenter(MainWorkCenter mainWorkCenter) {
        this.mainWorkCenter = mainWorkCenter;
        return this;
    }
    
    /**
     * Gets code value
     * 
     * @return String
     */
    public String OperationalWorkCenter.getCode() {
        return this.code;
    }
    
    /**
     * Sets code value
     * 
     * @param code
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * Gets category value
     * 
     * @return String
     */
    public String OperationalWorkCenter.getCategory() {
        return this.category;
    }
    
    /**
     * Sets category value
     * 
     * @param category
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setCategory(String category) {
        this.category = category;
        return this;
    }
    
    /**
     * Gets name value
     * 
     * @return String
     */
    public String OperationalWorkCenter.getName() {
        return this.name;
    }
    
    /**
     * Sets name value
     * 
     * @param name
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Gets responsible value
     * 
     * @return WorkCenterResponsible
     */
    public WorkCenterResponsible OperationalWorkCenter.getResponsible() {
        return this.responsible;
    }
    
    /**
     * Sets responsible value
     * 
     * @param responsible
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setResponsible(WorkCenterResponsible responsible) {
        this.responsible = responsible;
        return this;
    }
    
    /**
     * Gets controlKey value
     * 
     * @return String
     */
    public String OperationalWorkCenter.getControlKey() {
        return this.controlKey;
    }
    
    /**
     * Sets controlKey value
     * 
     * @param controlKey
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setControlKey(String controlKey) {
        this.controlKey = controlKey;
        return this;
    }
    
    /**
     * Gets plannerGroup value
     * 
     * @return PlannerGroup
     */
    public PlannerGroup OperationalWorkCenter.getPlannerGroup() {
        return this.plannerGroup;
    }
    
    /**
     * Sets plannerGroup value
     * 
     * @param plannerGroup
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setPlannerGroup(PlannerGroup plannerGroup) {
        this.plannerGroup = plannerGroup;
        return this;
    }
    
    /**
     * Gets capacityUnitOfMeasure value
     * 
     * @return UnitOfMeasure
     */
    public UnitOfMeasure OperationalWorkCenter.getCapacityUnitOfMeasure() {
        return this.capacityUnitOfMeasure;
    }
    
    /**
     * Sets capacityUnitOfMeasure value
     * 
     * @param capacityUnitOfMeasure
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setCapacityUnitOfMeasure(UnitOfMeasure capacityUnitOfMeasure) {
        this.capacityUnitOfMeasure = capacityUnitOfMeasure;
        return this;
    }
    
    /**
     * Gets capacityStartTime value
     * 
     * @return Calendar
     */
    public Calendar OperationalWorkCenter.getCapacityStartTime() {
        return this.capacityStartTime;
    }
    
    /**
     * Sets capacityStartTime value
     * 
     * @param capacityStartTime
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setCapacityStartTime(Calendar capacityStartTime) {
        this.capacityStartTime = capacityStartTime;
        return this;
    }
    
    /**
     * Gets capacityEndTime value
     * 
     * @return Calendar
     */
    public Calendar OperationalWorkCenter.getCapacityEndTime() {
        return this.capacityEndTime;
    }
    
    /**
     * Sets capacityEndTime value
     * 
     * @param capacityEndTime
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setCapacityEndTime(Calendar capacityEndTime) {
        this.capacityEndTime = capacityEndTime;
        return this;
    }
    
    /**
     * Gets capacityUtilization value
     * 
     * @return Integer
     */
    public Integer OperationalWorkCenter.getCapacityUtilization() {
        return this.capacityUtilization;
    }
    
    /**
     * Sets capacityUtilization value
     * 
     * @param capacityUtilization
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setCapacityUtilization(Integer capacityUtilization) {
        this.capacityUtilization = capacityUtilization;
        return this;
    }
    
    /**
     * Gets numberofCapacities value
     * 
     * @return Integer
     */
    public Integer OperationalWorkCenter.getNumberofCapacities() {
        return this.numberofCapacities;
    }
    
    /**
     * Sets numberofCapacities value
     * 
     * @param numberofCapacities
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setNumberofCapacities(Integer numberofCapacities) {
        this.numberofCapacities = numberofCapacities;
        return this;
    }
    
    /**
     * Gets validityStartDate value
     * 
     * @return Calendar
     */
    public Calendar OperationalWorkCenter.getValidityStartDate() {
        return this.validityStartDate;
    }
    
    /**
     * Sets validityStartDate value
     * 
     * @param validityStartDate
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setValidityStartDate(Calendar validityStartDate) {
        this.validityStartDate = validityStartDate;
        return this;
    }
    
    /**
     * Gets validityEndDate value
     * 
     * @return Calendar
     */
    public Calendar OperationalWorkCenter.getValidityEndDate() {
        return this.validityEndDate;
    }
    
    /**
     * Sets validityEndDate value
     * 
     * @param validityEndDate
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setValidityEndDate(Calendar validityEndDate) {
        this.validityEndDate = validityEndDate;
        return this;
    }
    
    /**
     * Gets costCenter value
     * 
     * @return CostCenter
     */
    public CostCenter OperationalWorkCenter.getCostCenter() {
        return this.costCenter;
    }
    
    /**
     * Sets costCenter value
     * 
     * @param costCenter
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setCostCenter(CostCenter costCenter) {
        this.costCenter = costCenter;
        return this;
    }
    
    /**
     * Gets activityType value
     * 
     * @return String
     */
    public String OperationalWorkCenter.getActivityType() {
        return this.activityType;
    }
    
    /**
     * Sets activityType value
     * 
     * @param activityType
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setActivityType(String activityType) {
        this.activityType = activityType;
        return this;
    }
    
    /**
     * Gets recordStatus value
     * 
     * @return RecordStatus
     */
    public RecordStatus OperationalWorkCenter.getRecordStatus() {
        return this.recordStatus;
    }
    
    /**
     * Sets recordStatus value
     * 
     * @param recordStatus
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Long
     */
    public Long OperationalWorkCenter.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setVersion(Long version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets createdDate value
     * 
     * @return Calendar
     */
    public Calendar OperationalWorkCenter.getCreatedDate() {
        return this.createdDate;
    }
    
    /**
     * Sets createdDate value
     * 
     * @param createdDate
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    
    /**
     * Gets createdBy value
     * 
     * @return String
     */
    public String OperationalWorkCenter.getCreatedBy() {
        return this.createdBy;
    }
    
    /**
     * Sets createdBy value
     * 
     * @param createdBy
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Gets lastModifiedDate value
     * 
     * @return Calendar
     */
    public Calendar OperationalWorkCenter.getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    /**
     * Sets lastModifiedDate value
     * 
     * @param lastModifiedDate
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
    
    /**
     * Gets lastModifiedBy value
     * 
     * @return String
     */
    public String OperationalWorkCenter.getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    /**
     * Sets lastModifiedBy value
     * 
     * @param lastModifiedBy
     * @return OperationalWorkCenter
     */
    public OperationalWorkCenter OperationalWorkCenter.setLastModifiedBy(String lastModifiedBy) {
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
    public boolean OperationalWorkCenter.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof OperationalWorkCenter)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((OperationalWorkCenter) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int OperationalWorkCenter.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String OperationalWorkCenter.toString() {
        return "OperationalWorkCenter {" + 
                "id='" + id + '\'' + 
                ", code='" + code + '\'' + 
                ", category='" + category + '\'' + 
                ", name='" + name + '\'' + 
                ", controlKey='" + controlKey + '\'' + 


                ", capacityUtilization='" + capacityUtilization + '\'' + 
                ", numberofCapacities='" + numberofCapacities + '\'' + 


                ", activityType='" + activityType + '\'' + 
                ", version='" + version + '\'' + 

                ", createdBy='" + createdBy + '\'' + 

                ", lastModifiedBy='" + lastModifiedBy + '\'' + "}" + super.toString();
    }
    
}
