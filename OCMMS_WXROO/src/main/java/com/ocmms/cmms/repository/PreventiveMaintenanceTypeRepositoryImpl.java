package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenanceType;

/**
 * = PreventiveMaintenanceTypeRepositoryImpl
 *
 * Implementation of PreventiveMaintenanceTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PreventiveMaintenanceTypeRepositoryCustom.class)
public class PreventiveMaintenanceTypeRepositoryImpl extends QueryDslRepositorySupportExt<PreventiveMaintenanceType> implements PreventiveMaintenanceTypeRepositoryCustom{

    /**
     * Default constructor
     */
    PreventiveMaintenanceTypeRepositoryImpl() {
        super(PreventiveMaintenanceType.class);
    }
}