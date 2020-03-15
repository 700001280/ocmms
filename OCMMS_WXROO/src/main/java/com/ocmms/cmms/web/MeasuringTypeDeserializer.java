package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringType;
import com.ocmms.cmms.service.api.MeasuringTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MeasuringTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MeasuringType.class)
public class MeasuringTypeDeserializer extends JsonObjectDeserializer<MeasuringType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MeasuringTypeService measuringTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param measuringTypeService
     * @param conversionService
     */
    @Autowired
    public MeasuringTypeDeserializer(@Lazy MeasuringTypeService measuringTypeService, ConversionService conversionService) {
        this.measuringTypeService = measuringTypeService;
        this.conversionService = conversionService;
    }
}
