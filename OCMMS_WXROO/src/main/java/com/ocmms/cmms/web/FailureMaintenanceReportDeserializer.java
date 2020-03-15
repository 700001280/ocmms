package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;
import com.ocmms.cmms.service.api.FailureMaintenanceReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = FailureMaintenanceReportDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = FailureMaintenanceReport.class)
public class FailureMaintenanceReportDeserializer extends JsonObjectDeserializer<FailureMaintenanceReport> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private FailureMaintenanceReportService failureMaintenanceReportService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param failureMaintenanceReportService
     * @param conversionService
     */
    @Autowired
    public FailureMaintenanceReportDeserializer(@Lazy FailureMaintenanceReportService failureMaintenanceReportService, ConversionService conversionService) {
        this.failureMaintenanceReportService = failureMaintenanceReportService;
        this.conversionService = conversionService;
    }
}
