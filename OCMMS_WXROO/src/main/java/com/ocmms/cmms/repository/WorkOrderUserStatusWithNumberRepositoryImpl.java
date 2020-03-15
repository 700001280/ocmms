package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;

/**
 * = WorkOrderUserStatusWithNumberRepositoryImpl
 *
 * Implementation of WorkOrderUserStatusWithNumberRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkOrderUserStatusWithNumberRepositoryCustom.class)
public class WorkOrderUserStatusWithNumberRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderUserStatusWithNumber> implements WorkOrderUserStatusWithNumberRepositoryCustom{

    /**
     * Default constructor
     */
    WorkOrderUserStatusWithNumberRepositoryImpl() {
        super(WorkOrderUserStatusWithNumber.class);
    }
}