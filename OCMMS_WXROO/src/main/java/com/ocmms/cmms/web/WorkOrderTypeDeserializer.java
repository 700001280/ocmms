package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import com.ocmms.cmms.service.api.WorkOrderTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkOrderTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkOrderType.class)
public class WorkOrderTypeDeserializer extends JsonObjectDeserializer<WorkOrderType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkOrderTypeService workOrderTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workOrderTypeService
     * @param conversionService
     */
    @Autowired
    public WorkOrderTypeDeserializer(@Lazy WorkOrderTypeService workOrderTypeService, ConversionService conversionService) {
        this.workOrderTypeService = workOrderTypeService;
        this.conversionService = conversionService;
    }
}
