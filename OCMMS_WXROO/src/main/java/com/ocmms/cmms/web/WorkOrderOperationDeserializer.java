package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;
import com.ocmms.cmms.service.api.WorkOrderOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkOrderOperationDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkOrderOperation.class)
public class WorkOrderOperationDeserializer extends JsonObjectDeserializer<WorkOrderOperation> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkOrderOperationService workOrderOperationService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workOrderOperationService
     * @param conversionService
     */
    @Autowired
    public WorkOrderOperationDeserializer(@Lazy WorkOrderOperationService workOrderOperationService, ConversionService conversionService) {
        this.workOrderOperationService = workOrderOperationService;
        this.conversionService = conversionService;
    }
}
