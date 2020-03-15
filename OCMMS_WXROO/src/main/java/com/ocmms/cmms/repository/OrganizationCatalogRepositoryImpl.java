package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.hrm.OrganizationCatalog;

/**
 * = OrganizationCatalogRepositoryImpl
 *
 * Implementation of OrganizationCatalogRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = OrganizationCatalogRepositoryCustom.class)
public class OrganizationCatalogRepositoryImpl extends QueryDslRepositorySupportExt<OrganizationCatalog> implements OrganizationCatalogRepositoryCustom{

    /**
     * Default constructor
     */
    OrganizationCatalogRepositoryImpl() {
        super(OrganizationCatalog.class);
    }
}