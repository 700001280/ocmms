package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MaterialType;
import com.ocmms.cmms.service.api.MaterialTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaterialTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaterialType.class)
public class MaterialTypeDeserializer extends JsonObjectDeserializer<MaterialType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaterialTypeService materialTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param materialTypeService
     * @param conversionService
     */
    @Autowired
    public MaterialTypeDeserializer(@Lazy MaterialTypeService materialTypeService, ConversionService conversionService) {
        this.materialTypeService = materialTypeService;
        this.conversionService = conversionService;
    }
}
