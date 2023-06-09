// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.technicalobject.regulatory;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureVessel;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Objects;

privileged aspect PressureVessel_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long PressureVessel.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return PressureVessel
     */
    public PressureVessel PressureVessel.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets lastInspectionDate value
     * 
     * @return Calendar
     */
    public Calendar PressureVessel.getLastInspectionDate() {
        return this.lastInspectionDate;
    }
    
    /**
     * Sets lastInspectionDate value
     * 
     * @param lastInspectionDate
     * @return PressureVessel
     */
    public PressureVessel PressureVessel.setLastInspectionDate(Calendar lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
        return this;
    }
    
    /**
     * Gets nextInspectionDate value
     * 
     * @return Calendar
     */
    public Calendar PressureVessel.getNextInspectionDate() {
        return this.nextInspectionDate;
    }
    
    /**
     * Sets nextInspectionDate value
     * 
     * @param nextInspectionDate
     * @return PressureVessel
     */
    public PressureVessel PressureVessel.setNextInspectionDate(Calendar nextInspectionDate) {
        this.nextInspectionDate = nextInspectionDate;
        return this;
    }
    
    /**
     * Gets serviceRegistrationNumber value
     * 
     * @return String
     */
    public String PressureVessel.getServiceRegistrationNumber() {
        return this.serviceRegistrationNumber;
    }
    
    /**
     * Sets serviceRegistrationNumber value
     * 
     * @param serviceRegistrationNumber
     * @return PressureVessel
     */
    public PressureVessel PressureVessel.setServiceRegistrationNumber(String serviceRegistrationNumber) {
        this.serviceRegistrationNumber = serviceRegistrationNumber;
        return this;
    }
    
    /**
     * Gets manufacturerName value
     * 
     * @return String
     */
    public String PressureVessel.getManufacturerName() {
        return this.manufacturerName;
    }
    
    /**
     * Sets manufacturerName value
     * 
     * @param manufacturerName
     * @return PressureVessel
     */
    public PressureVessel PressureVessel.setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
        return this;
    }
    
    /**
     * Gets manufactureDate value
     * 
     * @return Calendar
     */
    public Calendar PressureVessel.getManufactureDate() {
        return this.manufactureDate;
    }
    
    /**
     * Sets manufactureDate value
     * 
     * @param manufactureDate
     * @return PressureVessel
     */
    public PressureVessel PressureVessel.setManufactureDate(Calendar manufactureDate) {
        this.manufactureDate = manufactureDate;
        return this;
    }
    
    /**
     * Gets designedServiceLife value
     * 
     * @return BigDecimal
     */
    public BigDecimal PressureVessel.getDesignedServiceLife() {
        return this.designedServiceLife;
    }
    
    /**
     * Sets designedServiceLife value
     * 
     * @param designedServiceLife
     * @return PressureVessel
     */
    public PressureVessel PressureVessel.setDesignedServiceLife(BigDecimal designedServiceLife) {
        this.designedServiceLife = designedServiceLife;
        return this;
    }
    
    /**
     * Gets designPressure value
     * 
     * @return BigDecimal
     */
    public BigDecimal PressureVessel.getDesignPressure() {
        return this.designPressure;
    }
    
    /**
     * Sets designPressure value
     * 
     * @param designPressure
     * @return PressureVessel
     */
    public PressureVessel PressureVessel.setDesignPressure(BigDecimal designPressure) {
        this.designPressure = designPressure;
        return this;
    }
    
    /**
     * Gets maximumAllowableWorkingPressure value
     * 
     * @return BigDecimal
     */
    public BigDecimal PressureVessel.getMaximumAllowableWorkingPressure() {
        return this.maximumAllowableWorkingPressure;
    }
    
    /**
     * Sets maximumAllowableWorkingPressure value
     * 
     * @param maximumAllowableWorkingPressure
     * @return PressureVessel
     */
    public PressureVessel PressureVessel.setMaximumAllowableWorkingPressure(BigDecimal maximumAllowableWorkingPressure) {
        this.maximumAllowableWorkingPressure = maximumAllowableWorkingPressure;
        return this;
    }
    
    /**
     * Gets pressureVesselCategory value
     * 
     * @return String
     */
    public String PressureVessel.getPressureVesselCategory() {
        return this.pressureVesselCategory;
    }
    
    /**
     * Sets pressureVesselCategory value
     * 
     * @param pressureVesselCategory
     * @return PressureVessel
     */
    public PressureVessel PressureVessel.setPressureVesselCategory(String pressureVesselCategory) {
        this.pressureVesselCategory = pressureVesselCategory;
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
    public boolean PressureVessel.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof PressureVessel)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((PressureVessel) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int PressureVessel.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String PressureVessel.toString() {
        return "PressureVessel {" + 
                "id='" + id + '\'' + 


                ", serviceRegistrationNumber='" + serviceRegistrationNumber + '\'' + 
                ", manufacturerName='" + manufacturerName + '\'' + 

                ", designedServiceLife='" + designedServiceLife + '\'' + 
                ", designPressure='" + designPressure + '\'' + 
                ", maximumAllowableWorkingPressure='" + maximumAllowableWorkingPressure + '\'' + 
                ", pressureVesselCategory='" + pressureVesselCategory + '\'' + "}" + super.toString();
    }
    
}
