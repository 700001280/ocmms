package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = FailureMaintenanceReportService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = FailureMaintenanceReport.class)
public interface FailureMaintenanceReportService extends EntityResolver<FailureMaintenanceReport, Long>, ValidatorService<FailureMaintenanceReport> {
}
