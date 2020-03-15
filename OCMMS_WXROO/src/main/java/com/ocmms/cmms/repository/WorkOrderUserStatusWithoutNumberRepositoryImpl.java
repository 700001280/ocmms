package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithoutNumber;

/**
 * = WorkOrderUserStatusWithoutNumberRepositoryImpl
 *
 * Implementation of WorkOrderUserStatusWithoutNumberRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkOrderUserStatusWithoutNumberRepositoryCustom.class)
public class WorkOrderUserStatusWithoutNumberRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderUserStatusWithoutNumber> implements WorkOrderUserStatusWithoutNumberRepositoryCustom{

    /**
     * Default constructor
     */
    WorkOrderUserStatusWithoutNumberRepositoryImpl() {
        super(WorkOrderUserStatusWithoutNumber.class);
    }
}