package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.InstockDetail;

/**
 * = InstockDetailRepositoryImpl
 *
 * Implementation of InstockDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = InstockDetailRepositoryCustom.class)
public class InstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<InstockDetail> implements InstockDetailRepositoryCustom{

    /**
     * Default constructor
     */
    InstockDetailRepositoryImpl() {
        super(InstockDetail.class);
    }
}