package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.assistance.WorkLogType;

/**
 * = WorkLogTypeRepositoryImpl
 *
 * Implementation of WorkLogTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkLogTypeRepositoryCustom.class)
public class WorkLogTypeRepositoryImpl extends QueryDslRepositorySupportExt<WorkLogType> implements WorkLogTypeRepositoryCustom{

    /**
     * Default constructor
     */
    WorkLogTypeRepositoryImpl() {
        super(WorkLogType.class);
    }
}