package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.plan.PlanPeriod;

/**
 * = PlanPeriodRepositoryImpl
 *
 * Implementation of PlanPeriodRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PlanPeriodRepositoryCustom.class)
public class PlanPeriodRepositoryImpl extends QueryDslRepositorySupportExt<PlanPeriod> implements PlanPeriodRepositoryCustom{

    /**
     * Default constructor
     */
    PlanPeriodRepositoryImpl() {
        super(PlanPeriod.class);
    }
}