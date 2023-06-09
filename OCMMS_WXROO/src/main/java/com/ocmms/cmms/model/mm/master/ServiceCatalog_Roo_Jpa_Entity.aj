// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.mm.master;

import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.util.Assert;

privileged aspect ServiceCatalog_Roo_Jpa_Entity {
    
    declare @type: ServiceCatalog: @Entity;
    
    declare @type: ServiceCatalog: @Table(name = "MM_SERVICECATALOG");
    
    declare @type: ServiceCatalog: @EntityFormat(message = "entity_format_message_mm_master_servicecatalog");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ServiceCatalog.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ServiceCatalog.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceProcurementItemDetailsToAdd
     */
    public void ServiceCatalog.addToServiceProcurementItemDetails(Iterable<ServiceProcurementItemDetail> serviceProcurementItemDetailsToAdd) {
        Assert.notNull(serviceProcurementItemDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (ServiceProcurementItemDetail item : serviceProcurementItemDetailsToAdd) {
            this.serviceProcurementItemDetails.add(item);
            item.setServiceCatalog(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceProcurementItemDetailsToRemove
     */
    public void ServiceCatalog.removeFromServiceProcurementItemDetails(Iterable<ServiceProcurementItemDetail> serviceProcurementItemDetailsToRemove) {
        Assert.notNull(serviceProcurementItemDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (ServiceProcurementItemDetail item : serviceProcurementItemDetailsToRemove) {
            this.serviceProcurementItemDetails.remove(item);
            item.setServiceCatalog(null);
        }
    }
    
}
