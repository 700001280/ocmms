package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.system.BugReport;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = BugReportService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = BugReport.class)
public interface BugReportService extends EntityResolver<BugReport, Long>, ValidatorService<BugReport> {
}
