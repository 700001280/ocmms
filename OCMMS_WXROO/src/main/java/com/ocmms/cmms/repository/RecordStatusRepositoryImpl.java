package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.system.RecordStatus;

/**
 * = RecordStatusRepositoryImpl
 *
 * Implementation of RecordStatusRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = RecordStatusRepositoryCustom.class)
public class RecordStatusRepositoryImpl extends QueryDslRepositorySupportExt<RecordStatus> implements RecordStatusRepositoryCustom{

    /**
     * Default constructor
     */
    RecordStatusRepositoryImpl() {
        super(RecordStatus.class);
    }
}