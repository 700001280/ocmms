package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.loto.LotoIssueReport;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = LotoIssueReportService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = LotoIssueReport.class)
public interface LotoIssueReportService extends EntityResolver<LotoIssueReport, Long>, ValidatorService<LotoIssueReport> {
}
