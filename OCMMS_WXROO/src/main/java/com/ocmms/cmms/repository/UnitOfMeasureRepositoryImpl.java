package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.common.UnitOfMeasure;

/**
 * = UnitOfMeasureRepositoryImpl
 *
 * Implementation of UnitOfMeasureRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = UnitOfMeasureRepositoryCustom.class)
public class UnitOfMeasureRepositoryImpl extends QueryDslRepositorySupportExt<UnitOfMeasure> implements UnitOfMeasureRepositoryCustom{

    /**
     * Default constructor
     */
    UnitOfMeasureRepositoryImpl() {
        super(UnitOfMeasure.class);
    }
}