package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.master.ScrewElement;

/**
 * = ScrewElementRepositoryImpl
 *
 * Implementation of ScrewElementRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ScrewElementRepositoryCustom.class)
public class ScrewElementRepositoryImpl extends QueryDslRepositorySupportExt<ScrewElement> implements ScrewElementRepositoryCustom{

    /**
     * Default constructor
     */
    ScrewElementRepositoryImpl() {
        super(ScrewElement.class);
    }
}