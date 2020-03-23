package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;

/**
 * = MaterialStorageLocationInfoRepositoryImpl
 *
 * Implementation of MaterialStorageLocationInfoRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialStorageLocationInfoRepositoryCustom.class)
public class MaterialStorageLocationInfoRepositoryImpl extends QueryDslRepositorySupportExt<MaterialStorageLocationInfo> implements MaterialStorageLocationInfoRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialStorageLocationInfoRepositoryImpl() {
        super(MaterialStorageLocationInfo.class);
    }
}