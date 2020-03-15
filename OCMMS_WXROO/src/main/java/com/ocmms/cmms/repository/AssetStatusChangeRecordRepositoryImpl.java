package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;

/**
 * = AssetStatusChangeRecordRepositoryImpl
 *
 * Implementation of AssetStatusChangeRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = AssetStatusChangeRecordRepositoryCustom.class)
public class AssetStatusChangeRecordRepositoryImpl extends QueryDslRepositorySupportExt<AssetStatusChangeRecord> implements AssetStatusChangeRecordRepositoryCustom{

    /**
     * Default constructor
     */
    AssetStatusChangeRecordRepositoryImpl() {
        super(AssetStatusChangeRecord.class);
    }
}