package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerReplaceRecord;

/**
 * = PelletizerUpRollerReplaceRecordRepositoryImpl
 *
 * Implementation of PelletizerUpRollerReplaceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PelletizerUpRollerReplaceRecordRepositoryCustom.class)
public class PelletizerUpRollerReplaceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PelletizerUpRollerReplaceRecord> implements PelletizerUpRollerReplaceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    PelletizerUpRollerReplaceRecordRepositoryImpl() {
        super(PelletizerUpRollerReplaceRecord.class);
    }
}