package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.AuthourizationGroup;

/**
 * = AuthourizationGroupRepositoryImpl
 *
 * Implementation of AuthourizationGroupRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = AuthourizationGroupRepositoryCustom.class)
public class AuthourizationGroupRepositoryImpl extends QueryDslRepositorySupportExt<AuthourizationGroup> implements AuthourizationGroupRepositoryCustom{

    /**
     * Default constructor
     */
    AuthourizationGroupRepositoryImpl() {
        super(AuthourizationGroup.class);
    }
}