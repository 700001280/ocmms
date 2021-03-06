// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.technicalobject;

import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

privileged aspect BillOfMaterial_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long BillOfMaterial.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets technicalObjects value
     * 
     * @return Set
     */
    public Set<TechnicalObject> BillOfMaterial.getTechnicalObjects() {
        return this.technicalObjects;
    }
    
    /**
     * Sets technicalObjects value
     * 
     * @param technicalObjects
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setTechnicalObjects(Set<TechnicalObject> technicalObjects) {
        this.technicalObjects = technicalObjects;
        return this;
    }
    
    /**
     * Gets bomComponent value
     * 
     * @return MaterialCatalog
     */
    public MaterialCatalog BillOfMaterial.getBomComponent() {
        return this.bomComponent;
    }
    
    /**
     * Sets bomComponent value
     * 
     * @param bomComponent
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setBomComponent(MaterialCatalog bomComponent) {
        this.bomComponent = bomComponent;
        return this;
    }
    
    /**
     * Gets setSize value
     * 
     * @return BigDecimal
     */
    public BigDecimal BillOfMaterial.getSetSize() {
        return this.setSize;
    }
    
    /**
     * Sets setSize value
     * 
     * @param setSize
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setSetSize(BigDecimal setSize) {
        this.setSize = setSize;
        return this;
    }
    
    /**
     * Gets safestock value
     * 
     * @return BigDecimal
     */
    public BigDecimal BillOfMaterial.getSafestock() {
        return this.safestock;
    }
    
    /**
     * Sets safestock value
     * 
     * @param safestock
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setSafestock(BigDecimal safestock) {
        this.safestock = safestock;
        return this;
    }
    
    /**
     * Gets unit value
     * 
     * @return UnitOfMeasure
     */
    public UnitOfMeasure BillOfMaterial.getUnit() {
        return this.unit;
    }
    
    /**
     * Sets unit value
     * 
     * @param unit
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setUnit(UnitOfMeasure unit) {
        this.unit = unit;
        return this;
    }
    
    /**
     * Gets drawingNumber value
     * 
     * @return String
     */
    public String BillOfMaterial.getDrawingNumber() {
        return this.drawingNumber;
    }
    
    /**
     * Sets drawingNumber value
     * 
     * @param drawingNumber
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setDrawingNumber(String drawingNumber) {
        this.drawingNumber = drawingNumber;
        return this;
    }
    
    /**
     * Gets techPositionNumber value
     * 
     * @return String
     */
    public String BillOfMaterial.getTechPositionNumber() {
        return this.techPositionNumber;
    }
    
    /**
     * Sets techPositionNumber value
     * 
     * @param techPositionNumber
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setTechPositionNumber(String techPositionNumber) {
        this.techPositionNumber = techPositionNumber;
        return this;
    }
    
    /**
     * Gets parameter value
     * 
     * @return String
     */
    public String BillOfMaterial.getParameter() {
        return this.parameter;
    }
    
    /**
     * Sets parameter value
     * 
     * @param parameter
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }
    
    /**
     * Gets positionNumber value
     * 
     * @return String
     */
    public String BillOfMaterial.getPositionNumber() {
        return this.positionNumber;
    }
    
    /**
     * Sets positionNumber value
     * 
     * @param positionNumber
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
        return this;
    }
    
    /**
     * Gets needStock value
     * 
     * @return Boolean
     */
    public Boolean BillOfMaterial.getNeedStock() {
        return this.needStock;
    }
    
    /**
     * Sets needStock value
     * 
     * @param needStock
     * @return BillOfMaterial
     */
    public BillOfMaterial BillOfMaterial.setNeedStock(Boolean needStock) {
        this.needStock = needStock;
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
    public boolean BillOfMaterial.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof BillOfMaterial)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((BillOfMaterial) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int BillOfMaterial.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String BillOfMaterial.toString() {
        return "BillOfMaterial {" + 
                "id='" + id + '\'' + 
                ", setSize='" + setSize + '\'' + 
                ", safestock='" + safestock + '\'' + 
                ", drawingNumber='" + drawingNumber + '\'' + 
                ", techPositionNumber='" + techPositionNumber + '\'' + 
                ", parameter='" + parameter + '\'' + 
                ", positionNumber='" + positionNumber + '\'' + 
                ", needStock='" + needStock + '\'' + "}" + super.toString();
    }
    
}
