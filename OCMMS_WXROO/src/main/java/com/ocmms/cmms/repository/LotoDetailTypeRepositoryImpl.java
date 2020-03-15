package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.loto.LotoDetailType;

/**
 * = LotoDetailTypeRepositoryImpl
 *
 * Implementation of LotoDetailTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = LotoDetailTypeRepositoryCustom.class)
public class LotoDetailTypeRepositoryImpl extends QueryDslRepositorySupportExt<LotoDetailType> implements LotoDetailTypeRepositoryCustom{

    /**
     * Default constructor
     */
    LotoDetailTypeRepositoryImpl() {
        super(LotoDetailType.class);
    }
}