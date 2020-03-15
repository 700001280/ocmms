package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.PartReplaceRecord;

/**
 * = PartReplaceRecordRepositoryImpl
 *
 * Implementation of PartReplaceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PartReplaceRecordRepositoryCustom.class)
public class PartReplaceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PartReplaceRecord> implements PartReplaceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    PartReplaceRecordRepositoryImpl() {
        super(PartReplaceRecord.class);
    }
}