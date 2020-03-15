package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;

/**
 * = WorkOrderSystemStatusRepositoryImpl
 *
 * Implementation of WorkOrderSystemStatusRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkOrderSystemStatusRepositoryCustom.class)
public class WorkOrderSystemStatusRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderSystemStatus> implements WorkOrderSystemStatusRepositoryCustom{

    /**
     * Default constructor
     */
    WorkOrderSystemStatusRepositoryImpl() {
        super(WorkOrderSystemStatus.class);
    }
}