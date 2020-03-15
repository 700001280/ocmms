package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.service.api.PreventiveMaintenanceStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PreventiveMaintenanceStandardDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PreventiveMaintenanceStandard.class)
public class PreventiveMaintenanceStandardDeserializer extends JsonObjectDeserializer<PreventiveMaintenanceStandard> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PreventiveMaintenanceStandardService preventiveMaintenanceStandardService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param preventiveMaintenanceStandardService
     * @param conversionService
     */
    @Autowired
    public PreventiveMaintenanceStandardDeserializer(@Lazy PreventiveMaintenanceStandardService preventiveMaintenanceStandardService, ConversionService conversionService) {
        this.preventiveMaintenanceStandardService = preventiveMaintenanceStandardService;
        this.conversionService = conversionService;
    }
}
