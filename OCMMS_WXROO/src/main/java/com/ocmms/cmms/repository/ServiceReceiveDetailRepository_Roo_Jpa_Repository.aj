// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import com.ocmms.cmms.repository.ServiceReceiveDetailRepository;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ServiceReceiveDetailRepository_Roo_Jpa_Repository {
    
    declare @type: ServiceReceiveDetailRepository: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceProcurementItemDetail
     * @return Long
     */
    public abstract long ServiceReceiveDetailRepository.countByServiceProcurementItemDetail(ServiceProcurementItemDetail serviceProcurementItemDetail);
    
}
