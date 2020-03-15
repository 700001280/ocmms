package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MaterialAttribute;
import com.ocmms.cmms.service.api.MaterialAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaterialAttributeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaterialAttribute.class)
public class MaterialAttributeDeserializer extends JsonObjectDeserializer<MaterialAttribute> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaterialAttributeService materialAttributeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param materialAttributeService
     * @param conversionService
     */
    @Autowired
    public MaterialAttributeDeserializer(@Lazy MaterialAttributeService materialAttributeService, ConversionService conversionService) {
        this.materialAttributeService = materialAttributeService;
        this.conversionService = conversionService;
    }
}
