package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.configuration.ShaftType;
import com.ocmms.cmms.service.api.ShaftTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ShaftTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ShaftType.class)
public class ShaftTypeDeserializer extends JsonObjectDeserializer<ShaftType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ShaftTypeService shaftTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param shaftTypeService
     * @param conversionService
     */
    @Autowired
    public ShaftTypeDeserializer(@Lazy ShaftTypeService shaftTypeService, ConversionService conversionService) {
        this.shaftTypeService = shaftTypeService;
        this.conversionService = conversionService;
    }
}
