package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.workorder.WorkOrderTimeSheet;

/**
 * = WorkOrderTimeSheetRepositoryImpl
 *
 * Implementation of WorkOrderTimeSheetRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkOrderTimeSheetRepositoryCustom.class)
public class WorkOrderTimeSheetRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderTimeSheet> implements WorkOrderTimeSheetRepositoryCustom{

    /**
     * Default constructor
     */
    WorkOrderTimeSheetRepositoryImpl() {
        super(WorkOrderTimeSheet.class);
    }
}