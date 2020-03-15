package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.system.BarcodeDefinition;

/**
 * = BarcodeDefinitionRepositoryImpl
 *
 * Implementation of BarcodeDefinitionRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = BarcodeDefinitionRepositoryCustom.class)
public class BarcodeDefinitionRepositoryImpl extends QueryDslRepositorySupportExt<BarcodeDefinition> implements BarcodeDefinitionRepositoryCustom{

    /**
     * Default constructor
     */
    BarcodeDefinitionRepositoryImpl() {
        super(BarcodeDefinition.class);
    }
}