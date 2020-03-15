package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.eshem.CriticalClassification;

/**
 * = CriticalClassificationRepositoryImpl
 *
 * Implementation of CriticalClassificationRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = CriticalClassificationRepositoryCustom.class)
public class CriticalClassificationRepositoryImpl extends QueryDslRepositorySupportExt<CriticalClassification> implements CriticalClassificationRepositoryCustom{

    /**
     * Default constructor
     */
    CriticalClassificationRepositoryImpl() {
        super(CriticalClassification.class);
    }
}