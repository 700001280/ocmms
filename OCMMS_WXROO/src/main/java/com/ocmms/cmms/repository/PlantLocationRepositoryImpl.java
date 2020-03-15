package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;

/**
 * = PlantLocationRepositoryImpl
 *
 * Implementation of PlantLocationRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PlantLocationRepositoryCustom.class)
public class PlantLocationRepositoryImpl extends QueryDslRepositorySupportExt<PlantLocation> implements PlantLocationRepositoryCustom{

    /**
     * Default constructor
     */
    PlantLocationRepositoryImpl() {
        super(PlantLocation.class);
    }
}