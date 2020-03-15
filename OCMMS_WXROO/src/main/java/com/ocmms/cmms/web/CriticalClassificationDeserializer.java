package com.ocmms.cmms.web;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import com.ocmms.cmms.service.api.CriticalClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = CriticalClassificationDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = CriticalClassification.class)
public class CriticalClassificationDeserializer extends JsonObjectDeserializer<CriticalClassification> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CriticalClassificationService criticalClassificationService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param criticalClassificationService
     * @param conversionService
     */
    @Autowired
    public CriticalClassificationDeserializer(@Lazy CriticalClassificationService criticalClassificationService, ConversionService conversionService) {
        this.criticalClassificationService = criticalClassificationService;
        this.conversionService = conversionService;
    }
}
