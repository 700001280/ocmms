package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.procurement.CatalogType;

/**
 * = CatalogTypeRepositoryImpl
 *
 * Implementation of CatalogTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = CatalogTypeRepositoryCustom.class)
public class CatalogTypeRepositoryImpl extends QueryDslRepositorySupportExt<CatalogType> implements CatalogTypeRepositoryCustom{

    /**
     * Default constructor
     */
    CatalogTypeRepositoryImpl() {
        super(CatalogType.class);
    }
}