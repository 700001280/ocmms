package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.EquipmentScrappingRecord;

/**
 * = EquipmentScrappingRecordRepositoryImpl
 *
 * Implementation of EquipmentScrappingRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = EquipmentScrappingRecordRepositoryCustom.class)
public class EquipmentScrappingRecordRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentScrappingRecord> implements EquipmentScrappingRecordRepositoryCustom{

    /**
     * Default constructor
     */
    EquipmentScrappingRecordRepositoryImpl() {
        super(EquipmentScrappingRecord.class);
    }
}