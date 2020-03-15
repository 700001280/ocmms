package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.plan.PlanItem;

/**
 * = PlanItemRepositoryImpl
 *
 * Implementation of PlanItemRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PlanItemRepositoryCustom.class)
public class PlanItemRepositoryImpl extends QueryDslRepositorySupportExt<PlanItem> implements PlanItemRepositoryCustom{

    /**
     * Default constructor
     */
    PlanItemRepositoryImpl() {
        super(PlanItem.class);
    }
}