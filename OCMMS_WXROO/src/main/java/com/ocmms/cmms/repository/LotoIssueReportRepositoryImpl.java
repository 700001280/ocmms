package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.loto.LotoIssueReport;

/**
 * = LotoIssueReportRepositoryImpl
 *
 * Implementation of LotoIssueReportRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = LotoIssueReportRepositoryCustom.class)
public class LotoIssueReportRepositoryImpl extends QueryDslRepositorySupportExt<LotoIssueReport> implements LotoIssueReportRepositoryCustom{

    /**
     * Default constructor
     */
    LotoIssueReportRepositoryImpl() {
        super(LotoIssueReport.class);
    }
}