package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderTimeSheet;
import com.ocmms.cmms.service.api.WorkOrderTimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkOrderTimeSheetDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkOrderTimeSheet.class)
public class WorkOrderTimeSheetDeserializer extends JsonObjectDeserializer<WorkOrderTimeSheet> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkOrderTimeSheetService workOrderTimeSheetService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workOrderTimeSheetService
     * @param conversionService
     */
    @Autowired
    public WorkOrderTimeSheetDeserializer(@Lazy WorkOrderTimeSheetService workOrderTimeSheetService, ConversionService conversionService) {
        this.workOrderTimeSheetService = workOrderTimeSheetService;
        this.conversionService = conversionService;
    }
}
