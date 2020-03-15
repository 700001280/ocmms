package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;
import com.ocmms.cmms.service.api.PreventiveMaintenancePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PreventiveMaintenancePlanDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PreventiveMaintenancePlan.class)
public class PreventiveMaintenancePlanDeserializer extends JsonObjectDeserializer<PreventiveMaintenancePlan> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PreventiveMaintenancePlanService preventiveMaintenancePlanService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param preventiveMaintenancePlanService
     * @param conversionService
     */
    @Autowired
    public PreventiveMaintenancePlanDeserializer(@Lazy PreventiveMaintenancePlanService preventiveMaintenancePlanService, ConversionService conversionService) {
        this.preventiveMaintenancePlanService = preventiveMaintenancePlanService;
        this.conversionService = conversionService;
    }
}
