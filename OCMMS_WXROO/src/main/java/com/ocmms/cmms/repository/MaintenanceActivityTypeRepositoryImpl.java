package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;

/**
 * = MaintenanceActivityTypeRepositoryImpl
 *
 * Implementation of MaintenanceActivityTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaintenanceActivityTypeRepositoryCustom.class)
public class MaintenanceActivityTypeRepositoryImpl extends QueryDslRepositorySupportExt<MaintenanceActivityType> implements MaintenanceActivityTypeRepositoryCustom{

    /**
     * Default constructor
     */
    MaintenanceActivityTypeRepositoryImpl() {
        super(MaintenanceActivityType.class);
    }
}