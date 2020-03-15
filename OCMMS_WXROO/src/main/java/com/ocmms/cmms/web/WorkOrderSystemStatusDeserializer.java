package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;
import com.ocmms.cmms.service.api.WorkOrderSystemStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkOrderSystemStatusDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkOrderSystemStatus.class)
public class WorkOrderSystemStatusDeserializer extends JsonObjectDeserializer<WorkOrderSystemStatus> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkOrderSystemStatusService workOrderSystemStatusService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workOrderSystemStatusService
     * @param conversionService
     */
    @Autowired
    public WorkOrderSystemStatusDeserializer(@Lazy WorkOrderSystemStatusService workOrderSystemStatusService, ConversionService conversionService) {
        this.workOrderSystemStatusService = workOrderSystemStatusService;
        this.conversionService = conversionService;
    }
}
