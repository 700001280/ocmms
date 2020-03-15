package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.PotentialHazard;
import com.ocmms.cmms.service.api.PotentialHazardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PotentialHazardDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PotentialHazard.class)
public class PotentialHazardDeserializer extends JsonObjectDeserializer<PotentialHazard> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PotentialHazardService potentialHazardService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param potentialHazardService
     * @param conversionService
     */
    @Autowired
    public PotentialHazardDeserializer(@Lazy PotentialHazardService potentialHazardService, ConversionService conversionService) {
        this.potentialHazardService = potentialHazardService;
        this.conversionService = conversionService;
    }
}
