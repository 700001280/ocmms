package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PreventiveMaintenanceFinding;
import com.ocmms.cmms.service.api.PreventiveMaintenanceFindingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PreventiveMaintenanceFindingDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PreventiveMaintenanceFinding.class)
public class PreventiveMaintenanceFindingDeserializer extends JsonObjectDeserializer<PreventiveMaintenanceFinding> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PreventiveMaintenanceFindingService preventiveMaintenanceFindingService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param preventiveMaintenanceFindingService
     * @param conversionService
     */
    @Autowired
    public PreventiveMaintenanceFindingDeserializer(@Lazy PreventiveMaintenanceFindingService preventiveMaintenanceFindingService, ConversionService conversionService) {
        this.preventiveMaintenanceFindingService = preventiveMaintenanceFindingService;
        this.conversionService = conversionService;
    }
}
