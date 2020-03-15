package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;

/**
 * = PreventiveMaintenanceExecutionRepositoryImpl
 *
 * Implementation of PreventiveMaintenanceExecutionRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PreventiveMaintenanceExecutionRepositoryCustom.class)
public class PreventiveMaintenanceExecutionRepositoryImpl extends QueryDslRepositorySupportExt<PreventiveMaintenanceExecution> implements PreventiveMaintenanceExecutionRepositoryCustom{

    /**
     * Default constructor
     */
    PreventiveMaintenanceExecutionRepositoryImpl() {
        super(PreventiveMaintenanceExecution.class);
    }
}