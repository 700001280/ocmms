package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.master.MaterialAttribute;

/**
 * = MaterialAttributeRepositoryImpl
 *
 * Implementation of MaterialAttributeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialAttributeRepositoryCustom.class)
public class MaterialAttributeRepositoryImpl extends QueryDslRepositorySupportExt<MaterialAttribute> implements MaterialAttributeRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialAttributeRepositoryImpl() {
        super(MaterialAttribute.class);
    }
}