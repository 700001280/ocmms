package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureGage;

/**
 * = PressureGageRepositoryImpl
 *
 * Implementation of PressureGageRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PressureGageRepositoryCustom.class)
public class PressureGageRepositoryImpl extends QueryDslRepositorySupportExt<PressureGage> implements PressureGageRepositoryCustom{

    /**
     * Default constructor
     */
    PressureGageRepositoryImpl() {
        super(PressureGage.class);
    }
}