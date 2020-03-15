package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.ocmms.cmms.service.api.WorkOrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkOrderHeaderDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkOrderHeader.class)
public class WorkOrderHeaderDeserializer extends JsonObjectDeserializer<WorkOrderHeader> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkOrderHeaderService workOrderHeaderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workOrderHeaderService
     * @param conversionService
     */
    @Autowired
    public WorkOrderHeaderDeserializer(@Lazy WorkOrderHeaderService workOrderHeaderService, ConversionService conversionService) {
        this.workOrderHeaderService = workOrderHeaderService;
        this.conversionService = conversionService;
    }
}
