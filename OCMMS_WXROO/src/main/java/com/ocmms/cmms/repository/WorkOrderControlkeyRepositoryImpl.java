package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.workorder.WorkOrderControlkey;

/**
 * = WorkOrderControlkeyRepositoryImpl
 *
 * Implementation of WorkOrderControlkeyRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkOrderControlkeyRepositoryCustom.class)
public class WorkOrderControlkeyRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderControlkey> implements WorkOrderControlkeyRepositoryCustom{

    /**
     * Default constructor
     */
    WorkOrderControlkeyRepositoryImpl() {
        super(WorkOrderControlkey.class);
    }
}