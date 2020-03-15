package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.ObjectType;

/**
 * = ObjectTypeRepositoryImpl
 *
 * Implementation of ObjectTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ObjectTypeRepositoryCustom.class)
public class ObjectTypeRepositoryImpl extends QueryDslRepositorySupportExt<ObjectType> implements ObjectTypeRepositoryCustom{

    /**
     * Default constructor
     */
    ObjectTypeRepositoryImpl() {
        super(ObjectType.class);
    }
}