package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.measuringpoint.Medium;

/**
 * = MediumRepositoryImpl
 *
 * Implementation of MediumRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MediumRepositoryCustom.class)
public class MediumRepositoryImpl extends QueryDslRepositorySupportExt<Medium> implements MediumRepositoryCustom{

    /**
     * Default constructor
     */
    MediumRepositoryImpl() {
        super(Medium.class);
    }
}