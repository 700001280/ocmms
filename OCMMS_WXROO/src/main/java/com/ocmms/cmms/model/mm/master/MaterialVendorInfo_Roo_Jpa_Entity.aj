// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.mm.master;

import com.ocmms.cmms.model.mm.master.MaterialVendorInfo;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;

privileged aspect MaterialVendorInfo_Roo_Jpa_Entity {
    
    declare @type: MaterialVendorInfo: @Entity;
    
    declare @type: MaterialVendorInfo: @Table(name = "MM_MASTER_MATERIALVENDORINFO");
    
    declare @type: MaterialVendorInfo: @EntityFormat(message = "entity_format_message_mm_master_materialvendorinfo");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialVendorInfo.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialVendorInfo.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
}
