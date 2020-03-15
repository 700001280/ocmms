package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.PelletizerReplaceRecord;

/**
 * = PelletizerReplaceRecordRepositoryImpl
 *
 * Implementation of PelletizerReplaceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PelletizerReplaceRecordRepositoryCustom.class)
public class PelletizerReplaceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PelletizerReplaceRecord> implements PelletizerReplaceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    PelletizerReplaceRecordRepositoryImpl() {
        super(PelletizerReplaceRecord.class);
    }
}