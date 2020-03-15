package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.loto.LotoIssueReport;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = LotoIssueReportRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = LotoIssueReport.class)
public interface LotoIssueReportRepository extends DetachableJpaRepository<LotoIssueReport, Long>, LotoIssueReportRepositoryCustom {
}
