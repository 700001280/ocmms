package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.loto.PotentialHazard;

/**
 * = PotentialHazardRepositoryImpl
 *
 * Implementation of PotentialHazardRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PotentialHazardRepositoryCustom.class)
public class PotentialHazardRepositoryImpl extends QueryDslRepositorySupportExt<PotentialHazard> implements PotentialHazardRepositoryCustom{

    /**
     * Default constructor
     */
    PotentialHazardRepositoryImpl() {
        super(PotentialHazard.class);
    }
}