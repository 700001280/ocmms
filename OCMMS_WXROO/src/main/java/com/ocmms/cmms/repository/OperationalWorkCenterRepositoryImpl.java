package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;

/**
 * = OperationalWorkCenterRepositoryImpl
 *
 * Implementation of OperationalWorkCenterRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = OperationalWorkCenterRepositoryCustom.class)
public class OperationalWorkCenterRepositoryImpl extends QueryDslRepositorySupportExt<OperationalWorkCenter> implements OperationalWorkCenterRepositoryCustom{

    /**
     * Default constructor
     */
    OperationalWorkCenterRepositoryImpl() {
        super(OperationalWorkCenter.class);
    }
}