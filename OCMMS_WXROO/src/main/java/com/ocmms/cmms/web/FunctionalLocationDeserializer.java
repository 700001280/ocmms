package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;
import com.ocmms.cmms.service.api.FunctionalLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = FunctionalLocationDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = FunctionalLocation.class)
public class FunctionalLocationDeserializer extends JsonObjectDeserializer<FunctionalLocation> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private FunctionalLocationService functionalLocationService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param functionalLocationService
     * @param conversionService
     */
    @Autowired
    public FunctionalLocationDeserializer(@Lazy FunctionalLocationService functionalLocationService, ConversionService conversionService) {
        this.functionalLocationService = functionalLocationService;
        this.conversionService = conversionService;
    }
}
