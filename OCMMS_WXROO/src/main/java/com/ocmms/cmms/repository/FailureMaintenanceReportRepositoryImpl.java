package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;

/**
 * = FailureMaintenanceReportRepositoryImpl
 *
 * Implementation of FailureMaintenanceReportRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = FailureMaintenanceReportRepositoryCustom.class)
public class FailureMaintenanceReportRepositoryImpl extends QueryDslRepositorySupportExt<FailureMaintenanceReport> implements FailureMaintenanceReportRepositoryCustom{

    /**
     * Default constructor
     */
    FailureMaintenanceReportRepositoryImpl() {
        super(FailureMaintenanceReport.class);
    }
}