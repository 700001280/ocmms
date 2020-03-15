package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.loto.LotoInfo;

/**
 * = LotoInfoRepositoryImpl
 *
 * Implementation of LotoInfoRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = LotoInfoRepositoryCustom.class)
public class LotoInfoRepositoryImpl extends QueryDslRepositorySupportExt<LotoInfo> implements LotoInfoRepositoryCustom{

    /**
     * Default constructor
     */
    LotoInfoRepositoryImpl() {
        super(LotoInfo.class);
    }
}