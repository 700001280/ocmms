package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.common.Province;

/**
 * = ProvinceRepositoryImpl
 *
 * Implementation of ProvinceRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ProvinceRepositoryCustom.class)
public class ProvinceRepositoryImpl extends QueryDslRepositorySupportExt<Province> implements ProvinceRepositoryCustom{

    /**
     * Default constructor
     */
    ProvinceRepositoryImpl() {
        super(Province.class);
    }
}