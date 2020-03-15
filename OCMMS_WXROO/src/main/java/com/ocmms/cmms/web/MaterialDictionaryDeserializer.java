package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.mdrm.MaterialDictionary;
import com.ocmms.cmms.service.api.MaterialDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaterialDictionaryDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaterialDictionary.class)
public class MaterialDictionaryDeserializer extends JsonObjectDeserializer<MaterialDictionary> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaterialDictionaryService materialDictionaryService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param materialDictionaryService
     * @param conversionService
     */
    @Autowired
    public MaterialDictionaryDeserializer(@Lazy MaterialDictionaryService materialDictionaryService, ConversionService conversionService) {
        this.materialDictionaryService = materialDictionaryService;
        this.conversionService = conversionService;
    }
}
