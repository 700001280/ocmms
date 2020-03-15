package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;

/**
 * = MainWorkCenterRepositoryImpl
 *
 * Implementation of MainWorkCenterRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MainWorkCenterRepositoryCustom.class)
public class MainWorkCenterRepositoryImpl extends QueryDslRepositorySupportExt<MainWorkCenter> implements MainWorkCenterRepositoryCustom{

    /**
     * Default constructor
     */
    MainWorkCenterRepositoryImpl() {
        super(MainWorkCenter.class);
    }
}