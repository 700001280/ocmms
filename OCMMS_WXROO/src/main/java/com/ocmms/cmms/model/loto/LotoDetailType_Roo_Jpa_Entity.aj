// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.loto;

import com.ocmms.cmms.model.loto.LotoDetailType;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;

privileged aspect LotoDetailType_Roo_Jpa_Entity {
    
    declare @type: LotoDetailType: @Entity;
    
    declare @type: LotoDetailType: @Table(name = "LOTO_LOTODETAILTYPE");
    
    declare @type: LotoDetailType: @EntityFormat(message = "entity_format_message_loto_lotodetailtype");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LotoDetailType.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LotoDetailType.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
}
