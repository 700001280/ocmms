package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithoutNumber;
import com.ocmms.cmms.service.api.WorkOrderUserStatusWithoutNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkOrderUserStatusWithoutNumberDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkOrderUserStatusWithoutNumber.class)
public class WorkOrderUserStatusWithoutNumberDeserializer extends JsonObjectDeserializer<WorkOrderUserStatusWithoutNumber> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkOrderUserStatusWithoutNumberService workOrderUserStatusWithoutNumberService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workOrderUserStatusWithoutNumberService
     * @param conversionService
     */
    @Autowired
    public WorkOrderUserStatusWithoutNumberDeserializer(@Lazy WorkOrderUserStatusWithoutNumberService workOrderUserStatusWithoutNumberService, ConversionService conversionService) {
        this.workOrderUserStatusWithoutNumberService = workOrderUserStatusWithoutNumberService;
        this.conversionService = conversionService;
    }
}
