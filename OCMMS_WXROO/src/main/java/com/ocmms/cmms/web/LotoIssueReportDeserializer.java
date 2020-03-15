package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoIssueReport;
import com.ocmms.cmms.service.api.LotoIssueReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = LotoIssueReportDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = LotoIssueReport.class)
public class LotoIssueReportDeserializer extends JsonObjectDeserializer<LotoIssueReport> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private LotoIssueReportService lotoIssueReportService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param lotoIssueReportService
     * @param conversionService
     */
    @Autowired
    public LotoIssueReportDeserializer(@Lazy LotoIssueReportService lotoIssueReportService, ConversionService conversionService) {
        this.lotoIssueReportService = lotoIssueReportService;
        this.conversionService = conversionService;
    }
}
