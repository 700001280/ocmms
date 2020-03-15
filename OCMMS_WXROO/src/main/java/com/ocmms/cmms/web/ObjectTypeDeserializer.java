package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import com.ocmms.cmms.service.api.ObjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ObjectTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ObjectType.class)
public class ObjectTypeDeserializer extends JsonObjectDeserializer<ObjectType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ObjectTypeService objectTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param objectTypeService
     * @param conversionService
     */
    @Autowired
    public ObjectTypeDeserializer(@Lazy ObjectTypeService objectTypeService, ConversionService conversionService) {
        this.objectTypeService = objectTypeService;
        this.conversionService = conversionService;
    }
}
