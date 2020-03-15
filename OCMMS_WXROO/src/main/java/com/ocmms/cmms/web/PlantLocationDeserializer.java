package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.service.api.PlantLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PlantLocationDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PlantLocation.class)
public class PlantLocationDeserializer extends JsonObjectDeserializer<PlantLocation> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PlantLocationService plantLocationService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param plantLocationService
     * @param conversionService
     */
    @Autowired
    public PlantLocationDeserializer(@Lazy PlantLocationService plantLocationService, ConversionService conversionService) {
        this.plantLocationService = plantLocationService;
        this.conversionService = conversionService;
    }
}
