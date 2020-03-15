package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;
import com.ocmms.cmms.service.api.WorkOrderUserStatusWithNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkOrderUserStatusWithNumberDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkOrderUserStatusWithNumber.class)
public class WorkOrderUserStatusWithNumberDeserializer extends JsonObjectDeserializer<WorkOrderUserStatusWithNumber> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkOrderUserStatusWithNumberService workOrderUserStatusWithNumberService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workOrderUserStatusWithNumberService
     * @param conversionService
     */
    @Autowired
    public WorkOrderUserStatusWithNumberDeserializer(@Lazy WorkOrderUserStatusWithNumberService workOrderUserStatusWithNumberService, ConversionService conversionService) {
        this.workOrderUserStatusWithNumberService = workOrderUserStatusWithNumberService;
        this.conversionService = conversionService;
    }
}
