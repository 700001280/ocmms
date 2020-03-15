package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Plant;
import com.ocmms.cmms.service.api.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PlantDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Plant.class)
public class PlantDeserializer extends JsonObjectDeserializer<Plant> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PlantService plantService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param plantService
     * @param conversionService
     */
    @Autowired
    public PlantDeserializer(@Lazy PlantService plantService, ConversionService conversionService) {
        this.plantService = plantService;
        this.conversionService = conversionService;
    }
}
