package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.PlantSection;

/**
 * = PlantSectionRepositoryImpl
 *
 * Implementation of PlantSectionRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PlantSectionRepositoryCustom.class)
public class PlantSectionRepositoryImpl extends QueryDslRepositorySupportExt<PlantSection> implements PlantSectionRepositoryCustom{

    /**
     * Default constructor
     */
    PlantSectionRepositoryImpl() {
        super(PlantSection.class);
    }
}