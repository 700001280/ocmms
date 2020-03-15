package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;

/**
 * = PartMaintenanceRecordRepositoryImpl
 *
 * Implementation of PartMaintenanceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PartMaintenanceRecordRepositoryCustom.class)
public class PartMaintenanceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PartMaintenanceRecord> implements PartMaintenanceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    PartMaintenanceRecordRepositoryImpl() {
        super(PartMaintenanceRecord.class);
    }
}