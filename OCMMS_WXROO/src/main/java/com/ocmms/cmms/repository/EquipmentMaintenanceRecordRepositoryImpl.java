package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;

/**
 * = EquipmentMaintenanceRecordRepositoryImpl
 *
 * Implementation of EquipmentMaintenanceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = EquipmentMaintenanceRecordRepositoryCustom.class)
public class EquipmentMaintenanceRecordRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentMaintenanceRecord> implements EquipmentMaintenanceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    EquipmentMaintenanceRecordRepositoryImpl() {
        super(EquipmentMaintenanceRecord.class);
    }
}