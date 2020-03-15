package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.AbcIndicator;

/**
 * = AbcIndicatorRepositoryImpl
 *
 * Implementation of AbcIndicatorRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = AbcIndicatorRepositoryCustom.class)
public class AbcIndicatorRepositoryImpl extends QueryDslRepositorySupportExt<AbcIndicator> implements AbcIndicatorRepositoryCustom{

    /**
     * Default constructor
     */
    AbcIndicatorRepositoryImpl() {
        super(AbcIndicator.class);
    }
}