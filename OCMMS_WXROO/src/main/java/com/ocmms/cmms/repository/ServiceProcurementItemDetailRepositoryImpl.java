package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;

/**
 * = ServiceProcurementItemDetailRepositoryImpl
 *
 * Implementation of ServiceProcurementItemDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ServiceProcurementItemDetailRepositoryCustom.class)
public class ServiceProcurementItemDetailRepositoryImpl extends QueryDslRepositorySupportExt<ServiceProcurementItemDetail> implements ServiceProcurementItemDetailRepositoryCustom{

    /**
     * Default constructor
     */
    ServiceProcurementItemDetailRepositoryImpl() {
        super(ServiceProcurementItemDetail.class);
    }
}