package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderControlkey;
import com.ocmms.cmms.service.api.WorkOrderControlkeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkOrderControlkeyDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkOrderControlkey.class)
public class WorkOrderControlkeyDeserializer extends JsonObjectDeserializer<WorkOrderControlkey> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkOrderControlkeyService workOrderControlkeyService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workOrderControlkeyService
     * @param conversionService
     */
    @Autowired
    public WorkOrderControlkeyDeserializer(@Lazy WorkOrderControlkeyService workOrderControlkeyService, ConversionService conversionService) {
        this.workOrderControlkeyService = workOrderControlkeyService;
        this.conversionService = conversionService;
    }
}
