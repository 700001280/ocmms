package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Hoist;

/**
 * = HoistRepositoryImpl
 *
 * Implementation of HoistRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = HoistRepositoryCustom.class)
public class HoistRepositoryImpl extends QueryDslRepositorySupportExt<Hoist> implements HoistRepositoryCustom{

    /**
     * Default constructor
     */
    HoistRepositoryImpl() {
        super(Hoist.class);
    }
}