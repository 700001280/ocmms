package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pp.configuration.ProductMasterData;

/**
 * = ProductMasterDataRepositoryImpl
 *
 * Implementation of ProductMasterDataRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ProductMasterDataRepositoryCustom.class)
public class ProductMasterDataRepositoryImpl extends QueryDslRepositorySupportExt<ProductMasterData> implements ProductMasterDataRepositoryCustom{

    /**
     * Default constructor
     */
    ProductMasterDataRepositoryImpl() {
        super(ProductMasterData.class);
    }
}