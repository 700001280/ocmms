package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.plan.PlanStrategy;

/**
 * = PlanStrategyRepositoryImpl
 *
 * Implementation of PlanStrategyRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PlanStrategyRepositoryCustom.class)
public class PlanStrategyRepositoryImpl extends QueryDslRepositorySupportExt<PlanStrategy> implements PlanStrategyRepositoryCustom{

    /**
     * Default constructor
     */
    PlanStrategyRepositoryImpl() {
        super(PlanStrategy.class);
    }
}