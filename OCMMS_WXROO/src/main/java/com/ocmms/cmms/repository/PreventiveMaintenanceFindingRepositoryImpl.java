package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.PreventiveMaintenanceFinding;

/**
 * = PreventiveMaintenanceFindingRepositoryImpl
 *
 * Implementation of PreventiveMaintenanceFindingRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PreventiveMaintenanceFindingRepositoryCustom.class)
public class PreventiveMaintenanceFindingRepositoryImpl extends QueryDslRepositorySupportExt<PreventiveMaintenanceFinding> implements PreventiveMaintenanceFindingRepositoryCustom{

    /**
     * Default constructor
     */
    PreventiveMaintenanceFindingRepositoryImpl() {
        super(PreventiveMaintenanceFinding.class);
    }
}