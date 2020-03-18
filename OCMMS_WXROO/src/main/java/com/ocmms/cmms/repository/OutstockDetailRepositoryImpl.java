package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;

/**
 * = OutstockDetailRepositoryImpl
 *
 * Implementation of OutstockDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = OutstockDetailRepositoryCustom.class)
public class OutstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<OutstockDetail> implements OutstockDetailRepositoryCustom{

    /**
     * Default constructor
     */
    OutstockDetailRepositoryImpl() {
        super(OutstockDetail.class);
    }
}