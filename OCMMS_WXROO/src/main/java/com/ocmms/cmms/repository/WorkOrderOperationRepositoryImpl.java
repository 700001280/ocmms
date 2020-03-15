package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;

/**
 * = WorkOrderOperationRepositoryImpl
 *
 * Implementation of WorkOrderOperationRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkOrderOperationRepositoryCustom.class)
public class WorkOrderOperationRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderOperation> implements WorkOrderOperationRepositoryCustom{

    /**
     * Default constructor
     */
    WorkOrderOperationRepositoryImpl() {
        super(WorkOrderOperation.class);
    }
}