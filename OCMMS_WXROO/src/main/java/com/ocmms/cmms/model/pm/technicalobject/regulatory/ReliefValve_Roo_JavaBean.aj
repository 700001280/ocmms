// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.technicalobject.regulatory;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.ReliefValve;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Objects;

privileged aspect ReliefValve_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long ReliefValve.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets lastInspectionDate value
     * 
     * @return Calendar
     */
    public Calendar ReliefValve.getLastInspectionDate() {
        return this.lastInspectionDate;
    }
    
    /**
     * Sets lastInspectionDate value
     * 
     * @param lastInspectionDate
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setLastInspectionDate(Calendar lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
        return this;
    }
    
    /**
     * Gets nextInspectionDate value
     * 
     * @return Calendar
     */
    public Calendar ReliefValve.getNextInspectionDate() {
        return this.nextInspectionDate;
    }
    
    /**
     * Sets nextInspectionDate value
     * 
     * @param nextInspectionDate
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setNextInspectionDate(Calendar nextInspectionDate) {
        this.nextInspectionDate = nextInspectionDate;
        return this;
    }
    
    /**
     * Gets nominalPressure value
     * 
     * @return BigDecimal
     */
    public BigDecimal ReliefValve.getNominalPressure() {
        return this.nominalPressure;
    }
    
    /**
     * Sets nominalPressure value
     * 
     * @param nominalPressure
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setNominalPressure(BigDecimal nominalPressure) {
        this.nominalPressure = nominalPressure;
        return this;
    }
    
    /**
     * Gets workingPressure value
     * 
     * @return BigDecimal
     */
    public BigDecimal ReliefValve.getWorkingPressure() {
        return this.workingPressure;
    }
    
    /**
     * Sets workingPressure value
     * 
     * @param workingPressure
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setWorkingPressure(BigDecimal workingPressure) {
        this.workingPressure = workingPressure;
        return this;
    }
    
    /**
     * Gets settingPressure value
     * 
     * @return BigDecimal
     */
    public BigDecimal ReliefValve.getSettingPressure() {
        return this.settingPressure;
    }
    
    /**
     * Sets settingPressure value
     * 
     * @param settingPressure
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setSettingPressure(BigDecimal settingPressure) {
        this.settingPressure = settingPressure;
        return this;
    }
    
    /**
     * Gets nominalDiameter value
     * 
     * @return BigDecimal
     */
    public BigDecimal ReliefValve.getNominalDiameter() {
        return this.nominalDiameter;
    }
    
    /**
     * Sets nominalDiameter value
     * 
     * @param nominalDiameter
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setNominalDiameter(BigDecimal nominalDiameter) {
        this.nominalDiameter = nominalDiameter;
        return this;
    }
    
    /**
     * Gets designTemperature value
     * 
     * @return BigDecimal
     */
    public BigDecimal ReliefValve.getDesignTemperature() {
        return this.designTemperature;
    }
    
    /**
     * Sets designTemperature value
     * 
     * @param designTemperature
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setDesignTemperature(BigDecimal designTemperature) {
        this.designTemperature = designTemperature;
        return this;
    }
    
    /**
     * Gets workingTemperature value
     * 
     * @return BigDecimal
     */
    public BigDecimal ReliefValve.getWorkingTemperature() {
        return this.workingTemperature;
    }
    
    /**
     * Sets workingTemperature value
     * 
     * @param workingTemperature
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setWorkingTemperature(BigDecimal workingTemperature) {
        this.workingTemperature = workingTemperature;
        return this;
    }
    
    /**
     * Gets connectionType value
     * 
     * @return String
     */
    public String ReliefValve.getConnectionType() {
        return this.connectionType;
    }
    
    /**
     * Sets connectionType value
     * 
     * @param connectionType
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    
    /**
     * Gets medium value
     * 
     * @return String
     */
    public String ReliefValve.getMedium() {
        return this.medium;
    }
    
    /**
     * Sets medium value
     * 
     * @param medium
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setMedium(String medium) {
        this.medium = medium;
        return this;
    }
    
    /**
     * Gets fluidState value
     * 
     * @return String
     */
    public String ReliefValve.getFluidState() {
        return this.fluidState;
    }
    
    /**
     * Sets fluidState value
     * 
     * @param fluidState
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setFluidState(String fluidState) {
        this.fluidState = fluidState;
        return this;
    }
    
    /**
     * Gets dischargeLocation value
     * 
     * @return String
     */
    public String ReliefValve.getDischargeLocation() {
        return this.dischargeLocation;
    }
    
    /**
     * Sets dischargeLocation value
     * 
     * @param dischargeLocation
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setDischargeLocation(String dischargeLocation) {
        this.dischargeLocation = dischargeLocation;
        return this;
    }
    
    /**
     * Gets manufactureDate value
     * 
     * @return Calendar
     */
    public Calendar ReliefValve.getManufactureDate() {
        return this.manufactureDate;
    }
    
    /**
     * Sets manufactureDate value
     * 
     * @param manufactureDate
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setManufactureDate(Calendar manufactureDate) {
        this.manufactureDate = manufactureDate;
        return this;
    }
    
    /**
     * Gets designedServiceLife value
     * 
     * @return BigDecimal
     */
    public BigDecimal ReliefValve.getDesignedServiceLife() {
        return this.designedServiceLife;
    }
    
    /**
     * Sets designedServiceLife value
     * 
     * @param designedServiceLife
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setDesignedServiceLife(BigDecimal designedServiceLife) {
        this.designedServiceLife = designedServiceLife;
        return this;
    }
    
    /**
     * Gets classificationCategory value
     * 
     * @return String
     */
    public String ReliefValve.getClassificationCategory() {
        return this.classificationCategory;
    }
    
    /**
     * Sets classificationCategory value
     * 
     * @param classificationCategory
     * @return ReliefValve
     */
    public ReliefValve ReliefValve.setClassificationCategory(String classificationCategory) {
        this.classificationCategory = classificationCategory;
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
    public boolean ReliefValve.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof ReliefValve)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((ReliefValve) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int ReliefValve.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String ReliefValve.toString() {
        return "ReliefValve {" + 
                "id='" + id + '\'' + 


                ", nominalPressure='" + nominalPressure + '\'' + 
                ", workingPressure='" + workingPressure + '\'' + 
                ", settingPressure='" + settingPressure + '\'' + 
                ", nominalDiameter='" + nominalDiameter + '\'' + 
                ", designTemperature='" + designTemperature + '\'' + 
                ", workingTemperature='" + workingTemperature + '\'' + 
                ", connectionType='" + connectionType + '\'' + 
                ", medium='" + medium + '\'' + 
                ", fluidState='" + fluidState + '\'' + 
                ", dischargeLocation='" + dischargeLocation + '\'' + 

                ", designedServiceLife='" + designedServiceLife + '\'' + 
                ", classificationCategory='" + classificationCategory + '\'' + "}" + super.toString();
    }
    
}
