// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.task;

import com.ocmms.cmms.model.pm.task.TaskOperationHeader;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;

privileged aspect TaskOperationHeader_Roo_Jpa_Entity {
    
    declare @type: TaskOperationHeader: @Entity;
    
    declare @type: TaskOperationHeader: @Table(name = "PM_TASK_OPERATIONHEADER");
    
    declare @type: TaskOperationHeader: @EntityFormat(message = "entity_format_message_pm_task_operationheader");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeader.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskOperationHeader.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
}
