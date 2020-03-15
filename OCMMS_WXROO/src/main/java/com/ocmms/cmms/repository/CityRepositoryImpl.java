package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.common.City;

/**
 * = CityRepositoryImpl
 *
 * Implementation of CityRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = CityRepositoryCustom.class)
public class CityRepositoryImpl extends QueryDslRepositorySupportExt<City> implements CityRepositoryCustom{

    /**
     * Default constructor
     */
    CityRepositoryImpl() {
        super(City.class);
    }
}