// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.pp.configuration.ProductType;
import com.ocmms.cmms.model.pp.configuration.ShaftType;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.ProductMasterDataJsonMixin;
import com.ocmms.cmms.web.ProductTypeDeserializer;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.ShaftTypeDeserializer;

privileged aspect ProductMasterDataJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = ProductTypeDeserializer.class)
    private ProductType ProductMasterDataJsonMixin.productType;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus ProductMasterDataJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = ShaftTypeDeserializer.class)
    private ShaftType ProductMasterDataJsonMixin.shaftType;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ProductType
     */
    public ProductType ProductMasterDataJsonMixin.getProductType() {
        return productType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param productType
     */
    public void ProductMasterDataJsonMixin.setProductType(ProductType productType) {
        this.productType = productType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus ProductMasterDataJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void ProductMasterDataJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ShaftType
     */
    public ShaftType ProductMasterDataJsonMixin.getShaftType() {
        return shaftType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shaftType
     */
    public void ProductMasterDataJsonMixin.setShaftType(ShaftType shaftType) {
        this.shaftType = shaftType;
    }
    
}
