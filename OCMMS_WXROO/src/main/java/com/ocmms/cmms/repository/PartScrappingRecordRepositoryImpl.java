package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;

/**
 * = PartScrappingRecordRepositoryImpl
 *
 * Implementation of PartScrappingRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PartScrappingRecordRepositoryCustom.class)
public class PartScrappingRecordRepositoryImpl extends QueryDslRepositorySupportExt<PartScrappingRecord> implements PartScrappingRecordRepositoryCustom{

    /**
     * Default constructor
     */
    PartScrappingRecordRepositoryImpl() {
        super(PartScrappingRecord.class);
    }
}