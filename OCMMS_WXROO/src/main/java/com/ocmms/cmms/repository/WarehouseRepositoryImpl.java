package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.Warehouse;

/**
 * = WarehouseRepositoryImpl
 *
 * Implementation of WarehouseRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WarehouseRepositoryCustom.class)
public class WarehouseRepositoryImpl extends QueryDslRepositorySupportExt<Warehouse> implements WarehouseRepositoryCustom{

    /**
     * Default constructor
     */
    WarehouseRepositoryImpl() {
        super(Warehouse.class);
    }
}