package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.StorageType;

/**
 * = StorageTypeRepositoryImpl
 *
 * Implementation of StorageTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = StorageTypeRepositoryCustom.class)
public class StorageTypeRepositoryImpl extends QueryDslRepositorySupportExt<StorageType> implements StorageTypeRepositoryCustom{

    /**
     * Default constructor
     */
    StorageTypeRepositoryImpl() {
        super(StorageType.class);
    }
}