package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.measuringpoint.Medium;
import com.ocmms.cmms.service.api.MediumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MediumDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Medium.class)
public class MediumDeserializer extends JsonObjectDeserializer<Medium> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MediumService mediumService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param mediumService
     * @param conversionService
     */
    @Autowired
    public MediumDeserializer(@Lazy MediumService mediumService, ConversionService conversionService) {
        this.mediumService = mediumService;
        this.conversionService = conversionService;
    }
}
