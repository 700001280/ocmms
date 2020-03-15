package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.assistance.WorkLog;

/**
 * = WorkLogRepositoryImpl
 *
 * Implementation of WorkLogRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkLogRepositoryCustom.class)
public class WorkLogRepositoryImpl extends QueryDslRepositorySupportExt<WorkLog> implements WorkLogRepositoryCustom{

    /**
     * Default constructor
     */
    WorkLogRepositoryImpl() {
        super(WorkLog.class);
    }
}