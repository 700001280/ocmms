package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.hrm.Plant;

/**
 * = PlantRepositoryImpl
 *
 * Implementation of PlantRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PlantRepositoryCustom.class)
public class PlantRepositoryImpl extends QueryDslRepositorySupportExt<Plant> implements PlantRepositoryCustom{

    /**
     * Default constructor
     */
    PlantRepositoryImpl() {
        super(Plant.class);
    }
}