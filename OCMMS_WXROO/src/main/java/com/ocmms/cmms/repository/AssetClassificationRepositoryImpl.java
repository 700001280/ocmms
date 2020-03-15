package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.asset.AssetClassification;

/**
 * = AssetClassificationRepositoryImpl
 *
 * Implementation of AssetClassificationRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = AssetClassificationRepositoryCustom.class)
public class AssetClassificationRepositoryImpl extends QueryDslRepositorySupportExt<AssetClassification> implements AssetClassificationRepositoryCustom{

    /**
     * Default constructor
     */
    AssetClassificationRepositoryImpl() {
        super(AssetClassification.class);
    }
}