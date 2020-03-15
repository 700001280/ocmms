package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.BugReport;
import com.ocmms.cmms.service.api.BugReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = BugReportDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = BugReport.class)
public class BugReportDeserializer extends JsonObjectDeserializer<BugReport> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private BugReportService bugReportService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param bugReportService
     * @param conversionService
     */
    @Autowired
    public BugReportDeserializer(@Lazy BugReportService bugReportService, ConversionService conversionService) {
        this.bugReportService = bugReportService;
        this.conversionService = conversionService;
    }
}
