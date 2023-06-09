// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.technicalobject.regulatory;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureGage;
import java.util.Calendar;
import java.util.Objects;

privileged aspect PressureGage_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long PressureGage.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return PressureGage
     */
    public PressureGage PressureGage.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets lastInspectionDate value
     * 
     * @return Calendar
     */
    public Calendar PressureGage.getLastInspectionDate() {
        return this.lastInspectionDate;
    }
    
    /**
     * Sets lastInspectionDate value
     * 
     * @param lastInspectionDate
     * @return PressureGage
     */
    public PressureGage PressureGage.setLastInspectionDate(Calendar lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
        return this;
    }
    
    /**
     * Gets nextInspectionDate value
     * 
     * @return Calendar
     */
    public Calendar PressureGage.getNextInspectionDate() {
        return this.nextInspectionDate;
    }
    
    /**
     * Sets nextInspectionDate value
     * 
     * @param nextInspectionDate
     * @return PressureGage
     */
    public PressureGage PressureGage.setNextInspectionDate(Calendar nextInspectionDate) {
        this.nextInspectionDate = nextInspectionDate;
        return this;
    }
    
    /**
     * Gets parameter value
     * 
     * @return String
     */
    public String PressureGage.getParameter() {
        return this.parameter;
    }
    
    /**
     * Sets parameter value
     * 
     * @param parameter
     * @return PressureGage
     */
    public PressureGage PressureGage.setParameter(String parameter) {
        this.parameter = parameter;
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
    public boolean PressureGage.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof PressureGage)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((PressureGage) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int PressureGage.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String PressureGage.toString() {
        return "PressureGage {" + 
                "id='" + id + '\'' + 


                ", parameter='" + parameter + '\'' + "}" + super.toString();
    }
    
}
