package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;

/**
 * = PreventiveMaintenancePlanRepositoryImpl
 *
 * Implementation of PreventiveMaintenancePlanRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PreventiveMaintenancePlanRepositoryCustom.class)
public class PreventiveMaintenancePlanRepositoryImpl extends QueryDslRepositorySupportExt<PreventiveMaintenancePlan> implements PreventiveMaintenancePlanRepositoryCustom{

    /**
     * Default constructor
     */
    PreventiveMaintenancePlanRepositoryImpl() {
        super(PreventiveMaintenancePlan.class);
    }
}