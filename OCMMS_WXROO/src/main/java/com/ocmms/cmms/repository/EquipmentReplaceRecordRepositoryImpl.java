package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;

/**
 * = EquipmentReplaceRecordRepositoryImpl
 *
 * Implementation of EquipmentReplaceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = EquipmentReplaceRecordRepositoryCustom.class)
public class EquipmentReplaceRecordRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentReplaceRecord> implements EquipmentReplaceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    EquipmentReplaceRecordRepositoryImpl() {
        super(EquipmentReplaceRecord.class);
    }
}