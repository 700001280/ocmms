package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;

/**
 * = MeasuringPointRepositoryImpl
 *
 * Implementation of MeasuringPointRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MeasuringPointRepositoryCustom.class)
public class MeasuringPointRepositoryImpl extends QueryDslRepositorySupportExt<MeasuringPoint> implements MeasuringPointRepositoryCustom{

    /**
     * Default constructor
     */
    MeasuringPointRepositoryImpl() {
        super(MeasuringPoint.class);
    }
}