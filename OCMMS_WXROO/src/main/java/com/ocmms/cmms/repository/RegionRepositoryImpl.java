package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.common.Region;

/**
 * = RegionRepositoryImpl
 *
 * Implementation of RegionRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = RegionRepositoryCustom.class)
public class RegionRepositoryImpl extends QueryDslRepositorySupportExt<Region> implements RegionRepositoryCustom{

    /**
     * Default constructor
     */
    RegionRepositoryImpl() {
        super(Region.class);
    }
}