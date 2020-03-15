package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.service.api.WorkLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkLogDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkLog.class)
public class WorkLogDeserializer extends JsonObjectDeserializer<WorkLog> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkLogService workLogService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workLogService
     * @param conversionService
     */
    @Autowired
    public WorkLogDeserializer(@Lazy WorkLogService workLogService, ConversionService conversionService) {
        this.workLogService = workLogService;
        this.conversionService = conversionService;
    }
}
