package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringType;

/**
 * = MeasuringTypeRepositoryImpl
 *
 * Implementation of MeasuringTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MeasuringTypeRepositoryCustom.class)
public class MeasuringTypeRepositoryImpl extends QueryDslRepositorySupportExt<MeasuringType> implements MeasuringTypeRepositoryCustom{

    /**
     * Default constructor
     */
    MeasuringTypeRepositoryImpl() {
        super(MeasuringType.class);
    }
}