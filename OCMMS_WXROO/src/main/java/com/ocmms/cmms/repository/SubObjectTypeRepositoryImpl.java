package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.SubObjectType;

/**
 * = SubObjectTypeRepositoryImpl
 *
 * Implementation of SubObjectTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = SubObjectTypeRepositoryCustom.class)
public class SubObjectTypeRepositoryImpl extends QueryDslRepositorySupportExt<SubObjectType> implements SubObjectTypeRepositoryCustom{

    /**
     * Default constructor
     */
    SubObjectTypeRepositoryImpl() {
        super(SubObjectType.class);
    }
}