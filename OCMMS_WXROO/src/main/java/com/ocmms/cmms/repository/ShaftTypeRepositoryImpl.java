package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pp.configuration.ShaftType;

/**
 * = ShaftTypeRepositoryImpl
 *
 * Implementation of ShaftTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ShaftTypeRepositoryCustom.class)
public class ShaftTypeRepositoryImpl extends QueryDslRepositorySupportExt<ShaftType> implements ShaftTypeRepositoryCustom{

    /**
     * Default constructor
     */
    ShaftTypeRepositoryImpl() {
        super(ShaftType.class);
    }
}