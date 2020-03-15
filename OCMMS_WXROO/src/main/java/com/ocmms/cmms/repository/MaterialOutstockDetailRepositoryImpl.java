package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;

/**
 * = MaterialOutstockDetailRepositoryImpl
 *
 * Implementation of MaterialOutstockDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialOutstockDetailRepositoryCustom.class)
public class MaterialOutstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<MaterialOutstockDetail> implements MaterialOutstockDetailRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialOutstockDetailRepositoryImpl() {
        super(MaterialOutstockDetail.class);
    }
}