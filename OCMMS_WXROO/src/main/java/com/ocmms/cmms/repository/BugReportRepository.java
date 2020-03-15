package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.system.BugReport;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = BugReportRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = BugReport.class)
public interface BugReportRepository extends DetachableJpaRepository<BugReport, Long>, BugReportRepositoryCustom {
}
