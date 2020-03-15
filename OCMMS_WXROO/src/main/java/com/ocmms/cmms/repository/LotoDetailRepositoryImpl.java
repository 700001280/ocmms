package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.loto.LotoDetail;

/**
 * = LotoDetailRepositoryImpl
 *
 * Implementation of LotoDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = LotoDetailRepositoryCustom.class)
public class LotoDetailRepositoryImpl extends QueryDslRepositorySupportExt<LotoDetail> implements LotoDetailRepositoryCustom{

    /**
     * Default constructor
     */
    LotoDetailRepositoryImpl() {
        super(LotoDetail.class);
    }
}