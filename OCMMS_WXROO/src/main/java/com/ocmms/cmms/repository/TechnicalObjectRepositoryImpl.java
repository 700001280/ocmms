package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

/**
 * = TechnicalObjectRepositoryImpl
 *
 * Implementation of TechnicalObjectRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TechnicalObjectRepositoryCustom.class)
public class TechnicalObjectRepositoryImpl extends QueryDslRepositorySupportExt<TechnicalObject> implements TechnicalObjectRepositoryCustom{

    /**
     * Default constructor
     */
    TechnicalObjectRepositoryImpl() {
        super(TechnicalObject.class);
    }
}