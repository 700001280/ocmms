package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.service.api.PlantSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PlantSectionDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PlantSection.class)
public class PlantSectionDeserializer extends JsonObjectDeserializer<PlantSection> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PlantSectionService plantSectionService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param plantSectionService
     * @param conversionService
     */
    @Autowired
    public PlantSectionDeserializer(@Lazy PlantSectionService plantSectionService, ConversionService conversionService) {
        this.plantSectionService = plantSectionService;
        this.conversionService = conversionService;
    }
}
