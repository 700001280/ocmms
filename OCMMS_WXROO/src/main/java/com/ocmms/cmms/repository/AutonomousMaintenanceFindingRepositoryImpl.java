package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;

/**
 * = AutonomousMaintenanceFindingRepositoryImpl
 *
 * Implementation of AutonomousMaintenanceFindingRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = AutonomousMaintenanceFindingRepositoryCustom.class)
public class AutonomousMaintenanceFindingRepositoryImpl extends QueryDslRepositorySupportExt<AutonomousMaintenanceFinding> implements AutonomousMaintenanceFindingRepositoryCustom{

    /**
     * Default constructor
     */
    AutonomousMaintenanceFindingRepositoryImpl() {
        super(AutonomousMaintenanceFinding.class);
    }
}