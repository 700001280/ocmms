package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;

/**
 * = WorkCenterResponsibleRepositoryImpl
 *
 * Implementation of WorkCenterResponsibleRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkCenterResponsibleRepositoryCustom.class)
public class WorkCenterResponsibleRepositoryImpl extends QueryDslRepositorySupportExt<WorkCenterResponsible> implements WorkCenterResponsibleRepositoryCustom{

    /**
     * Default constructor
     */
    WorkCenterResponsibleRepositoryImpl() {
        super(WorkCenterResponsible.class);
    }
}