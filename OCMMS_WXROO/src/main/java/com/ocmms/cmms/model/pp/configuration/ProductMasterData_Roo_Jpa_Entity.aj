// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pp.configuration;

import com.ocmms.cmms.model.pp.configuration.ProductMasterData;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;

privileged aspect ProductMasterData_Roo_Jpa_Entity {
    
    declare @type: ProductMasterData: @Entity;
    
    declare @type: ProductMasterData: @Table(name = "PP_CONFIGURATION_PRODUCTMASTERDATA");
    
    declare @type: ProductMasterData: @EntityFormat(message = "entity_format_message_pp_configuration_productmasterdata");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProductMasterData.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProductMasterData.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
}
