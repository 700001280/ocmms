package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pp.configuration.ProductType;

/**
 * = ProductTypeRepositoryImpl
 *
 * Implementation of ProductTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ProductTypeRepositoryCustom.class)
public class ProductTypeRepositoryImpl extends QueryDslRepositorySupportExt<ProductType> implements ProductTypeRepositoryCustom{

    /**
     * Default constructor
     */
    ProductTypeRepositoryImpl() {
        super(ProductType.class);
    }
}