package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.master.MaterialType;

/**
 * = MaterialTypeRepositoryImpl
 *
 * Implementation of MaterialTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialTypeRepositoryCustom.class)
public class MaterialTypeRepositoryImpl extends QueryDslRepositorySupportExt<MaterialType> implements MaterialTypeRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialTypeRepositoryImpl() {
        super(MaterialType.class);
    }
}