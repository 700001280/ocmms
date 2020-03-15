package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenanceType;
import com.ocmms.cmms.service.api.PreventiveMaintenanceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PreventiveMaintenanceTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PreventiveMaintenanceType.class)
public class PreventiveMaintenanceTypeDeserializer extends JsonObjectDeserializer<PreventiveMaintenanceType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PreventiveMaintenanceTypeService preventiveMaintenanceTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param preventiveMaintenanceTypeService
     * @param conversionService
     */
    @Autowired
    public PreventiveMaintenanceTypeDeserializer(@Lazy PreventiveMaintenanceTypeService preventiveMaintenanceTypeService, ConversionService conversionService) {
        this.preventiveMaintenanceTypeService = preventiveMaintenanceTypeService;
        this.conversionService = conversionService;
    }
}
