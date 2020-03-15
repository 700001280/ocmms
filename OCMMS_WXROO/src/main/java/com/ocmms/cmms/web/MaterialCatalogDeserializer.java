package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.service.api.MaterialCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaterialCatalogDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaterialCatalog.class)
public class MaterialCatalogDeserializer extends JsonObjectDeserializer<MaterialCatalog> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaterialCatalogService materialCatalogService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param materialCatalogService
     * @param conversionService
     */
    @Autowired
    public MaterialCatalogDeserializer(@Lazy MaterialCatalogService materialCatalogService, ConversionService conversionService) {
        this.materialCatalogService = materialCatalogService;
        this.conversionService = conversionService;
    }
}
