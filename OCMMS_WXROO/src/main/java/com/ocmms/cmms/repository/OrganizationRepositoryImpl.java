package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.hrm.Organization;

/**
 * = OrganizationRepositoryImpl
 *
 * Implementation of OrganizationRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = OrganizationRepositoryCustom.class)
public class OrganizationRepositoryImpl extends QueryDslRepositorySupportExt<Organization> implements OrganizationRepositoryCustom{

    /**
     * Default constructor
     */
    OrganizationRepositoryImpl() {
        super(Organization.class);
    }
}