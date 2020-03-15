package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;

/**
 * = ServiceCatalogRepositoryImpl
 *
 * Implementation of ServiceCatalogRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ServiceCatalogRepositoryCustom.class)
public class ServiceCatalogRepositoryImpl extends QueryDslRepositorySupportExt<ServiceCatalog> implements ServiceCatalogRepositoryCustom{

    /**
     * Default constructor
     */
    ServiceCatalogRepositoryImpl() {
        super(ServiceCatalog.class);
    }
}