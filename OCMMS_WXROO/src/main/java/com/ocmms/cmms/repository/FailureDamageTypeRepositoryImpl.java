package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.notification.FailureDamageType;

/**
 * = FailureDamageTypeRepositoryImpl
 *
 * Implementation of FailureDamageTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = FailureDamageTypeRepositoryCustom.class)
public class FailureDamageTypeRepositoryImpl extends QueryDslRepositorySupportExt<FailureDamageType> implements FailureDamageTypeRepositoryCustom{

    /**
     * Default constructor
     */
    FailureDamageTypeRepositoryImpl() {
        super(FailureDamageType.class);
    }
}