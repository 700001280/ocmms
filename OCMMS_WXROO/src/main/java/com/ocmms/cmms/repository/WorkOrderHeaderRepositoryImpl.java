package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;

/**
 * = WorkOrderHeaderRepositoryImpl
 *
 * Implementation of WorkOrderHeaderRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkOrderHeaderRepositoryCustom.class)
public class WorkOrderHeaderRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderHeader> implements WorkOrderHeaderRepositoryCustom{

    /**
     * Default constructor
     */
    WorkOrderHeaderRepositoryImpl() {
        super(WorkOrderHeader.class);
    }
}