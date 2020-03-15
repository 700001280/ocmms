package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;

/**
 * = AssetInventoryRecordRepositoryImpl
 *
 * Implementation of AssetInventoryRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = AssetInventoryRecordRepositoryCustom.class)
public class AssetInventoryRecordRepositoryImpl extends QueryDslRepositorySupportExt<AssetInventoryRecord> implements AssetInventoryRecordRepositoryCustom{

    /**
     * Default constructor
     */
    AssetInventoryRecordRepositoryImpl() {
        super(AssetInventoryRecord.class);
    }
}