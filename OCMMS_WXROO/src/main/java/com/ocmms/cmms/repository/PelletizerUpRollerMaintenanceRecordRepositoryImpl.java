package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerMaintenanceRecord;

/**
 * = PelletizerUpRollerMaintenanceRecordRepositoryImpl
 *
 * Implementation of PelletizerUpRollerMaintenanceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PelletizerUpRollerMaintenanceRecordRepositoryCustom.class)
public class PelletizerUpRollerMaintenanceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PelletizerUpRollerMaintenanceRecord> implements PelletizerUpRollerMaintenanceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    PelletizerUpRollerMaintenanceRecordRepositoryImpl() {
        super(PelletizerUpRollerMaintenanceRecord.class);
    }
}