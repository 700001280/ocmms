// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.technicalobject.regulatory;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureGage;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;

privileged aspect PressureGage_Roo_Jpa_Entity {
    
    declare @type: PressureGage: @Entity;
    
    declare @type: PressureGage: @Table(name = "PM_REGULATORY_PRESSUREGAGE");
    
    declare @type: PressureGage: @EntityFormat(message = "entity_format_message_pm_regulatory_pressuregage");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PressureGage.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PressureGage.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
}
