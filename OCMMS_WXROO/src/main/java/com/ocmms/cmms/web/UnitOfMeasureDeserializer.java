package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.service.api.UnitOfMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = UnitOfMeasureDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = UnitOfMeasure.class)
public class UnitOfMeasureDeserializer extends JsonObjectDeserializer<UnitOfMeasure> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private UnitOfMeasureService unitOfMeasureService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param unitOfMeasureService
     * @param conversionService
     */
    @Autowired
    public UnitOfMeasureDeserializer(@Lazy UnitOfMeasureService unitOfMeasureService, ConversionService conversionService) {
        this.unitOfMeasureService = unitOfMeasureService;
        this.conversionService = conversionService;
    }
}
