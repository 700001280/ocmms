// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.mm.master;

import com.ocmms.cmms.model.mm.master.MROCatalog;
import io.springlets.format.EntityFormat;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

privileged aspect MROCatalog_Roo_Jpa_Entity {
    
    declare @type: MROCatalog: @Entity;
    
    declare @type: MROCatalog: @Table(name = "MM_MASTER_MROCATALOG");
    
    declare @type: MROCatalog: @Inheritance(strategy = InheritanceType.SINGLE_TABLE);
    
    declare @type: MROCatalog: @DiscriminatorColumn;
    
    declare @type: MROCatalog: @EntityFormat(message = "entity_format_message_mm_master_mrocatalog");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MROCatalog.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MROCatalog.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
}
