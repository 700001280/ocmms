package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.notification.FailureDamageCause;

/**
 * = FailureDamageCauseRepositoryImpl
 *
 * Implementation of FailureDamageCauseRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = FailureDamageCauseRepositoryCustom.class)
public class FailureDamageCauseRepositoryImpl extends QueryDslRepositorySupportExt<FailureDamageCause> implements FailureDamageCauseRepositoryCustom{

    /**
     * Default constructor
     */
    FailureDamageCauseRepositoryImpl() {
        super(FailureDamageCause.class);
    }
}