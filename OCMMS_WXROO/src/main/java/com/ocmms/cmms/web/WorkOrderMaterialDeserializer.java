package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import com.ocmms.cmms.service.api.WorkOrderMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkOrderMaterialDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkOrderMaterial.class)
public class WorkOrderMaterialDeserializer extends JsonObjectDeserializer<WorkOrderMaterial> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkOrderMaterialService workOrderMaterialService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workOrderMaterialService
     * @param conversionService
     */
    @Autowired
    public WorkOrderMaterialDeserializer(@Lazy WorkOrderMaterialService workOrderMaterialService, ConversionService conversionService) {
        this.workOrderMaterialService = workOrderMaterialService;
        this.conversionService = conversionService;
    }
}
