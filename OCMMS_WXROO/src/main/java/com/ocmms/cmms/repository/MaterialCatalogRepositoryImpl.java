package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;

/**
 * = MaterialCatalogRepositoryImpl
 *
 * Implementation of MaterialCatalogRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialCatalogRepositoryCustom.class)
public class MaterialCatalogRepositoryImpl extends QueryDslRepositorySupportExt<MaterialCatalog> implements MaterialCatalogRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialCatalogRepositoryImpl() {
        super(MaterialCatalog.class);
    }
}