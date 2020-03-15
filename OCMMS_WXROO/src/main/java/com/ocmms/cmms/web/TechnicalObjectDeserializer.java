package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.service.api.TechnicalObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TechnicalObjectDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TechnicalObject.class)
public class TechnicalObjectDeserializer extends JsonObjectDeserializer<TechnicalObject> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TechnicalObjectService technicalObjectService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param technicalObjectService
     * @param conversionService
     */
    @Autowired
    public TechnicalObjectDeserializer(@Lazy TechnicalObjectService technicalObjectService, ConversionService conversionService) {
        this.technicalObjectService = technicalObjectService;
        this.conversionService = conversionService;
    }
}
