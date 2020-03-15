package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringRecord;

/**
 * = MeasuringRecordRepositoryImpl
 *
 * Implementation of MeasuringRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MeasuringRecordRepositoryCustom.class)
public class MeasuringRecordRepositoryImpl extends QueryDslRepositorySupportExt<MeasuringRecord> implements MeasuringRecordRepositoryCustom{

    /**
     * Default constructor
     */
    MeasuringRecordRepositoryImpl() {
        super(MeasuringRecord.class);
    }
}