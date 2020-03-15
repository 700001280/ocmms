package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Elevator;

/**
 * = ElevatorRepositoryImpl
 *
 * Implementation of ElevatorRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ElevatorRepositoryCustom.class)
public class ElevatorRepositoryImpl extends QueryDslRepositorySupportExt<Elevator> implements ElevatorRepositoryCustom{

    /**
     * Default constructor
     */
    ElevatorRepositoryImpl() {
        super(Elevator.class);
    }
}