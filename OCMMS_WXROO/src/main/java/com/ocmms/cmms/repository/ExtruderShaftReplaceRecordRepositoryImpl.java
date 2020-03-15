package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.routine.ExtruderShaftReplaceRecord;

/**
 * = ExtruderShaftReplaceRecordRepositoryImpl
 *
 * Implementation of ExtruderShaftReplaceRecordRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ExtruderShaftReplaceRecordRepositoryCustom.class)
public class ExtruderShaftReplaceRecordRepositoryImpl extends QueryDslRepositorySupportExt<ExtruderShaftReplaceRecord> implements ExtruderShaftReplaceRecordRepositoryCustom{

    /**
     * Default constructor
     */
    ExtruderShaftReplaceRecordRepositoryImpl() {
        super(ExtruderShaftReplaceRecord.class);
    }
}