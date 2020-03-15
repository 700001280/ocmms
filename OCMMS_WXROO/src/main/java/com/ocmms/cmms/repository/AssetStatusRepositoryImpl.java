package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.asset.AssetStatus;

/**
 * = AssetStatusRepositoryImpl
 *
 * Implementation of AssetStatusRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = AssetStatusRepositoryCustom.class)
public class AssetStatusRepositoryImpl extends QueryDslRepositorySupportExt<AssetStatus> implements AssetStatusRepositoryCustom{

    /**
     * Default constructor
     */
    AssetStatusRepositoryImpl() {
        super(AssetStatus.class);
    }
}