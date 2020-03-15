package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.hrm.OrgComInformation;

/**
 * = OrgComInformationRepositoryImpl
 *
 * Implementation of OrgComInformationRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = OrgComInformationRepositoryCustom.class)
public class OrgComInformationRepositoryImpl extends QueryDslRepositorySupportExt<OrgComInformation> implements OrgComInformationRepositoryCustom{

    /**
     * Default constructor
     */
    OrgComInformationRepositoryImpl() {
        super(OrgComInformation.class);
    }
}