// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.technicalobject;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatusChangeRecord;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;

privileged aspect EquipmentStatusChangeRecord_Roo_Jpa_Entity {
    
    declare @type: EquipmentStatusChangeRecord: @Entity;
    
    declare @type: EquipmentStatusChangeRecord: @Table(name = "PM_TECHNICALOBJECT_EQUIPMENTSTATUSCHANGERECORD");
    
    declare @type: EquipmentStatusChangeRecord: @EntityFormat(message = "entity_format_message_pm_technicalobject_equipmentstatuschangerecord");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EquipmentStatusChangeRecord.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EquipmentStatusChangeRecord.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
}
