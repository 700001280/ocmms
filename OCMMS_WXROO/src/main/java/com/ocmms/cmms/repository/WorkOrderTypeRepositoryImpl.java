package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;

/**
 * = WorkOrderTypeRepositoryImpl
 *
 * Implementation of WorkOrderTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkOrderTypeRepositoryCustom.class)
public class WorkOrderTypeRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderType> implements WorkOrderTypeRepositoryCustom{

    /**
     * Default constructor
     */
    WorkOrderTypeRepositoryImpl() {
        super(WorkOrderType.class);
    }
}