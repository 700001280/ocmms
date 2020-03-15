package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.StorageLocation;

/**
 * = StorageLocationRepositoryImpl
 *
 * Implementation of StorageLocationRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = StorageLocationRepositoryCustom.class)
public class StorageLocationRepositoryImpl extends QueryDslRepositorySupportExt<StorageLocation> implements StorageLocationRepositoryCustom{

    /**
     * Default constructor
     */
    StorageLocationRepositoryImpl() {
        super(StorageLocation.class);
    }
}