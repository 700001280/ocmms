package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.PelletizerMaintenanceRecord;

/**
 * = PelletizerMaintenanceRecordRepositoryImpl
 *
 * Implementation of PelletizerMaintenanceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PelletizerMaintenanceRecordRepositoryCustom.class)
public class PelletizerMaintenanceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PelletizerMaintenanceRecord> implements PelletizerMaintenanceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    PelletizerMaintenanceRecordRepositoryImpl() {
        super(PelletizerMaintenanceRecord.class);
    }
}