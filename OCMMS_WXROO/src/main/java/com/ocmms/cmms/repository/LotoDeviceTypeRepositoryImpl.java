package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.loto.LotoDeviceType;

/**
 * = LotoDeviceTypeRepositoryImpl
 *
 * Implementation of LotoDeviceTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = LotoDeviceTypeRepositoryCustom.class)
public class LotoDeviceTypeRepositoryImpl extends QueryDslRepositorySupportExt<LotoDeviceType> implements LotoDeviceTypeRepositoryCustom{

    /**
     * Default constructor
     */
    LotoDeviceTypeRepositoryImpl() {
        super(LotoDeviceType.class);
    }
}