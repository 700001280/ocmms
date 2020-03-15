package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import com.ocmms.cmms.service.api.PreventiveMaintenanceContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PreventiveMaintenanceContentDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PreventiveMaintenanceContent.class)
public class PreventiveMaintenanceContentDeserializer extends JsonObjectDeserializer<PreventiveMaintenanceContent> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PreventiveMaintenanceContentService preventiveMaintenanceContentService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param preventiveMaintenanceContentService
     * @param conversionService
     */
    @Autowired
    public PreventiveMaintenanceContentDeserializer(@Lazy PreventiveMaintenanceContentService preventiveMaintenanceContentService, ConversionService conversionService) {
        this.preventiveMaintenanceContentService = preventiveMaintenanceContentService;
        this.conversionService = conversionService;
    }
}
