package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.master.InstockType;

/**
 * = InstockTypeRepositoryImpl
 *
 * Implementation of InstockTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = InstockTypeRepositoryCustom.class)
public class InstockTypeRepositoryImpl extends QueryDslRepositorySupportExt<InstockType> implements InstockTypeRepositoryCustom{

    /**
     * Default constructor
     */
    InstockTypeRepositoryImpl() {
        super(InstockType.class);
    }
}