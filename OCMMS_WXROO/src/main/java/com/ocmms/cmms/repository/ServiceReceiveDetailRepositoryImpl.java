package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;

/**
 * = ServiceReceiveDetailRepositoryImpl
 *
 * Implementation of ServiceReceiveDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ServiceReceiveDetailRepositoryCustom.class)
public class ServiceReceiveDetailRepositoryImpl extends QueryDslRepositorySupportExt<ServiceReceiveDetail> implements ServiceReceiveDetailRepositoryCustom{

    /**
     * Default constructor
     */
    ServiceReceiveDetailRepositoryImpl() {
        super(ServiceReceiveDetail.class);
    }
}