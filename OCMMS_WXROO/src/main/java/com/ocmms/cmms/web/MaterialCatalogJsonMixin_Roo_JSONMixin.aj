// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.mm.master.InstockType;
import com.ocmms.cmms.model.mm.master.MaterialAttribute;
import com.ocmms.cmms.model.mm.master.MaterialDiscipline;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.model.mm.master.MaterialType;
import com.ocmms.cmms.model.mm.master.MaterialVendorInfo;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;
import com.ocmms.cmms.web.InstockTypeDeserializer;
import com.ocmms.cmms.web.MaterialCatalogJsonMixin;
import com.ocmms.cmms.web.MaterialDisciplineDeserializer;
import com.ocmms.cmms.web.MaterialTypeDeserializer;
import com.ocmms.cmms.web.UnitOfMeasureDeserializer;
import java.util.Set;

privileged aspect MaterialCatalogJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<Document> MaterialCatalogJsonMixin.documents;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<BillOfMaterial> MaterialCatalogJsonMixin.equipmentBoms;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<ImageDocument> MaterialCatalogJsonMixin.images;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<InstockDetail> MaterialCatalogJsonMixin.instockDetails;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<MaterialAttribute> MaterialCatalogJsonMixin.materialAttributes;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<MaterialPlantInfo> MaterialCatalogJsonMixin.materialPlantInfos;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<MaterialProcurementItemDetail> MaterialCatalogJsonMixin.materialProcurementItemDetails;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<MaterialStorageLocationInfo> MaterialCatalogJsonMixin.materialStorageLocationInfos;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<MaterialVendorInfo> MaterialCatalogJsonMixin.materialVendorInfos;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<OutstockDetail> MaterialCatalogJsonMixin.outstockDetails;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MaterialDisciplineDeserializer.class)
    private MaterialDiscipline MaterialCatalogJsonMixin.discipline;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = InstockTypeDeserializer.class)
    private InstockType MaterialCatalogJsonMixin.instockType;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MaterialTypeDeserializer.class)
    private MaterialType MaterialCatalogJsonMixin.materialType;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = UnitOfMeasureDeserializer.class)
    private UnitOfMeasure MaterialCatalogJsonMixin.uom;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<Document> MaterialCatalogJsonMixin.getDocuments() {
        return documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documents
     */
    public void MaterialCatalogJsonMixin.setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<BillOfMaterial> MaterialCatalogJsonMixin.getEquipmentBoms() {
        return equipmentBoms;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentBoms
     */
    public void MaterialCatalogJsonMixin.setEquipmentBoms(Set<BillOfMaterial> equipmentBoms) {
        this.equipmentBoms = equipmentBoms;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<ImageDocument> MaterialCatalogJsonMixin.getImages() {
        return images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param images
     */
    public void MaterialCatalogJsonMixin.setImages(Set<ImageDocument> images) {
        this.images = images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<InstockDetail> MaterialCatalogJsonMixin.getInstockDetails() {
        return instockDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockDetails
     */
    public void MaterialCatalogJsonMixin.setInstockDetails(Set<InstockDetail> instockDetails) {
        this.instockDetails = instockDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<MaterialAttribute> MaterialCatalogJsonMixin.getMaterialAttributes() {
        return materialAttributes;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialAttributes
     */
    public void MaterialCatalogJsonMixin.setMaterialAttributes(Set<MaterialAttribute> materialAttributes) {
        this.materialAttributes = materialAttributes;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<MaterialPlantInfo> MaterialCatalogJsonMixin.getMaterialPlantInfos() {
        return materialPlantInfos;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialPlantInfos
     */
    public void MaterialCatalogJsonMixin.setMaterialPlantInfos(Set<MaterialPlantInfo> materialPlantInfos) {
        this.materialPlantInfos = materialPlantInfos;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<MaterialProcurementItemDetail> MaterialCatalogJsonMixin.getMaterialProcurementItemDetails() {
        return materialProcurementItemDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialProcurementItemDetails
     */
    public void MaterialCatalogJsonMixin.setMaterialProcurementItemDetails(Set<MaterialProcurementItemDetail> materialProcurementItemDetails) {
        this.materialProcurementItemDetails = materialProcurementItemDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<MaterialStorageLocationInfo> MaterialCatalogJsonMixin.getMaterialStorageLocationInfos() {
        return materialStorageLocationInfos;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialStorageLocationInfos
     */
    public void MaterialCatalogJsonMixin.setMaterialStorageLocationInfos(Set<MaterialStorageLocationInfo> materialStorageLocationInfos) {
        this.materialStorageLocationInfos = materialStorageLocationInfos;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<MaterialVendorInfo> MaterialCatalogJsonMixin.getMaterialVendorInfos() {
        return materialVendorInfos;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialVendorInfos
     */
    public void MaterialCatalogJsonMixin.setMaterialVendorInfos(Set<MaterialVendorInfo> materialVendorInfos) {
        this.materialVendorInfos = materialVendorInfos;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<OutstockDetail> MaterialCatalogJsonMixin.getOutstockDetails() {
        return outstockDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param outstockDetails
     */
    public void MaterialCatalogJsonMixin.setOutstockDetails(Set<OutstockDetail> outstockDetails) {
        this.outstockDetails = outstockDetails;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialDiscipline
     */
    public MaterialDiscipline MaterialCatalogJsonMixin.getDiscipline() {
        return discipline;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param discipline
     */
    public void MaterialCatalogJsonMixin.setDiscipline(MaterialDiscipline discipline) {
        this.discipline = discipline;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return InstockType
     */
    public InstockType MaterialCatalogJsonMixin.getInstockType() {
        return instockType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockType
     */
    public void MaterialCatalogJsonMixin.setInstockType(InstockType instockType) {
        this.instockType = instockType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialType
     */
    public MaterialType MaterialCatalogJsonMixin.getMaterialType() {
        return materialType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialType
     */
    public void MaterialCatalogJsonMixin.setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UnitOfMeasure
     */
    public UnitOfMeasure MaterialCatalogJsonMixin.getUom() {
        return uom;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param uom
     */
    public void MaterialCatalogJsonMixin.setUom(UnitOfMeasure uom) {
        this.uom = uom;
    }
    
}
