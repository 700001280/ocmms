package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;

/**
 * = PreventiveMaintenanceContentRepositoryImpl
 *
 * Implementation of PreventiveMaintenanceContentRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PreventiveMaintenanceContentRepositoryCustom.class)
public class PreventiveMaintenanceContentRepositoryImpl extends QueryDslRepositorySupportExt<PreventiveMaintenanceContent> implements PreventiveMaintenanceContentRepositoryCustom{

    /**
     * Default constructor
     */
    PreventiveMaintenanceContentRepositoryImpl() {
        super(PreventiveMaintenanceContent.class);
    }
}