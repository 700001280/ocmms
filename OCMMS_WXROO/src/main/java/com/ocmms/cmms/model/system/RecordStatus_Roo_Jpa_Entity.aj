// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.system;

import com.ocmms.cmms.model.system.RecordStatus;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;

privileged aspect RecordStatus_Roo_Jpa_Entity {
    
    declare @type: RecordStatus: @Entity;
    
    declare @type: RecordStatus: @Table(name = "SYSTEM_RECORDSTATUS");
    
    declare @type: RecordStatus: @EntityFormat(message = "entity_format_message_system_recordstatus");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String RecordStatus.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String RecordStatus.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
}
