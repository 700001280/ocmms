package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.SubObjectType;
import com.ocmms.cmms.service.api.SubObjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = SubObjectTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = SubObjectType.class)
public class SubObjectTypeDeserializer extends JsonObjectDeserializer<SubObjectType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SubObjectTypeService subObjectTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param subObjectTypeService
     * @param conversionService
     */
    @Autowired
    public SubObjectTypeDeserializer(@Lazy SubObjectTypeService subObjectTypeService, ConversionService conversionService) {
        this.subObjectTypeService = subObjectTypeService;
        this.conversionService = conversionService;
    }
}
