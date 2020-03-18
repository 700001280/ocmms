package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.PartScrappingOutstockDetail;

/**
 * = PartScrappingOutstockDetailRepositoryImpl
 *
 * Implementation of PartScrappingOutstockDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PartScrappingOutstockDetailRepositoryCustom.class)
public class PartScrappingOutstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<PartScrappingOutstockDetail> implements PartScrappingOutstockDetailRepositoryCustom{

    /**
     * Default constructor
     */
    PartScrappingOutstockDetailRepositoryImpl() {
        super(PartScrappingOutstockDetail.class);
    }
}