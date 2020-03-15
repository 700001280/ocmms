package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.PelletizerCutterMaintenanceRecord;

/**
 * = PelletizerCutterMaintenanceRecordRepositoryImpl
 *
 * Implementation of PelletizerCutterMaintenanceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PelletizerCutterMaintenanceRecordRepositoryCustom.class)
public class PelletizerCutterMaintenanceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PelletizerCutterMaintenanceRecord> implements PelletizerCutterMaintenanceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    PelletizerCutterMaintenanceRecordRepositoryImpl() {
        super(PelletizerCutterMaintenanceRecord.class);
    }
}