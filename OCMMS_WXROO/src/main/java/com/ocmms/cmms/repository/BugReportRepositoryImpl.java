package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.system.BugReport;

/**
 * = BugReportRepositoryImpl
 *
 * Implementation of BugReportRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = BugReportRepositoryCustom.class)
public class BugReportRepositoryImpl extends QueryDslRepositorySupportExt<BugReport> implements BugReportRepositoryCustom{

    /**
     * Default constructor
     */
    BugReportRepositoryImpl() {
        super(BugReport.class);
    }
}