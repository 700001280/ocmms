package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = FailureMaintenanceReportRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = FailureMaintenanceReport.class)
public interface FailureMaintenanceReportRepository extends DetachableJpaRepository<FailureMaintenanceReport, Long>, FailureMaintenanceReportRepositoryCustom {
}
