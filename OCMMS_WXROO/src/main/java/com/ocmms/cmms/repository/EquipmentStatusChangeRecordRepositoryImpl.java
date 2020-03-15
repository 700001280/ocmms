package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatusChangeRecord;

/**
 * = EquipmentStatusChangeRecordRepositoryImpl
 *
 * Implementation of EquipmentStatusChangeRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = EquipmentStatusChangeRecordRepositoryCustom.class)
public class EquipmentStatusChangeRecordRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentStatusChangeRecord> implements EquipmentStatusChangeRecordRepositoryCustom{

    /**
     * Default constructor
     */
    EquipmentStatusChangeRecordRepositoryImpl() {
        super(EquipmentStatusChangeRecord.class);
    }
}