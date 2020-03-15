package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.PelletizerCutterReplaceRecord;

/**
 * = PelletizerCutterReplaceRecordRepositoryImpl
 *
 * Implementation of PelletizerCutterReplaceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PelletizerCutterReplaceRecordRepositoryCustom.class)
public class PelletizerCutterReplaceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PelletizerCutterReplaceRecord> implements PelletizerCutterReplaceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    PelletizerCutterReplaceRecordRepositoryImpl() {
        super(PelletizerCutterReplaceRecord.class);
    }
}