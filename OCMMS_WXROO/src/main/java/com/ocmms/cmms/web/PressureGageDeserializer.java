package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureGage;
import com.ocmms.cmms.service.api.PressureGageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PressureGageDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PressureGage.class)
public class PressureGageDeserializer extends JsonObjectDeserializer<PressureGage> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PressureGageService pressureGageService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param pressureGageService
     * @param conversionService
     */
    @Autowired
    public PressureGageDeserializer(@Lazy PressureGageService pressureGageService, ConversionService conversionService) {
        this.pressureGageService = pressureGageService;
        this.conversionService = conversionService;
    }
}
