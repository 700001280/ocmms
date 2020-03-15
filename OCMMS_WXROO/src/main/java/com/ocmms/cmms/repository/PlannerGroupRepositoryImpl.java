package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;

/**
 * = PlannerGroupRepositoryImpl
 *
 * Implementation of PlannerGroupRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PlannerGroupRepositoryCustom.class)
public class PlannerGroupRepositoryImpl extends QueryDslRepositorySupportExt<PlannerGroup> implements PlannerGroupRepositoryCustom{

    /**
     * Default constructor
     */
    PlannerGroupRepositoryImpl() {
        super(PlannerGroup.class);
    }
}