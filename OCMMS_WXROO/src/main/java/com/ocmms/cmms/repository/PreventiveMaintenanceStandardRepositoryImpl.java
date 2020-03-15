package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;

/**
 * = PreventiveMaintenanceStandardRepositoryImpl
 *
 * Implementation of PreventiveMaintenanceStandardRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PreventiveMaintenanceStandardRepositoryCustom.class)
public class PreventiveMaintenanceStandardRepositoryImpl extends QueryDslRepositorySupportExt<PreventiveMaintenanceStandard> implements PreventiveMaintenanceStandardRepositoryCustom{

    /**
     * Default constructor
     */
    PreventiveMaintenanceStandardRepositoryImpl() {
        super(PreventiveMaintenanceStandard.class);
    }
}