package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureVessel;

/**
 * = PressureVesselRepositoryImpl
 *
 * Implementation of PressureVesselRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PressureVesselRepositoryCustom.class)
public class PressureVesselRepositoryImpl extends QueryDslRepositorySupportExt<PressureVessel> implements PressureVesselRepositoryCustom{

    /**
     * Default constructor
     */
    PressureVesselRepositoryImpl() {
        super(PressureVessel.class);
    }
}