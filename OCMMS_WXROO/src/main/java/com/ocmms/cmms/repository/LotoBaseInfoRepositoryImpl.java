package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.loto.LotoBaseInfo;

/**
 * = LotoBaseInfoRepositoryImpl
 *
 * Implementation of LotoBaseInfoRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = LotoBaseInfoRepositoryCustom.class)
public class LotoBaseInfoRepositoryImpl extends QueryDslRepositorySupportExt<LotoBaseInfo> implements LotoBaseInfoRepositoryCustom{

    /**
     * Default constructor
     */
    LotoBaseInfoRepositoryImpl() {
        super(LotoBaseInfo.class);
    }
}