// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.mm.procurement;

import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.util.Assert;

privileged aspect ServiceProcurementItemDetail_Roo_Jpa_Entity {
    
    declare @type: ServiceProcurementItemDetail: @Entity;
    
    declare @type: ServiceProcurementItemDetail: @Table(name = "MM_PROCUREMENT_ SERVICEITEMDETAIL");
    
    declare @type: ServiceProcurementItemDetail: @EntityFormat(message = "entity_format_message_mm_procurement_serviceitemdetail");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ServiceProcurementItemDetail.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ServiceProcurementItemDetail.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetailsToAdd
     */
    public void ServiceProcurementItemDetail.addToServiceReceiveDetails(Iterable<ServiceReceiveDetail> serviceReceiveDetailsToAdd) {
        Assert.notNull(serviceReceiveDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (ServiceReceiveDetail item : serviceReceiveDetailsToAdd) {
            this.serviceReceiveDetails.add(item);
            item.setServiceProcurementItemDetail(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetailsToRemove
     */
    public void ServiceProcurementItemDetail.removeFromServiceReceiveDetails(Iterable<ServiceReceiveDetail> serviceReceiveDetailsToRemove) {
        Assert.notNull(serviceReceiveDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (ServiceReceiveDetail item : serviceReceiveDetailsToRemove) {
            this.serviceReceiveDetails.remove(item);
            item.setServiceProcurementItemDetail(null);
        }
    }
    
}
