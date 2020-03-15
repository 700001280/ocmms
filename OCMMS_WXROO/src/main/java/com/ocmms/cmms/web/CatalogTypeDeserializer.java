package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.CatalogType;
import com.ocmms.cmms.service.api.CatalogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = CatalogTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = CatalogType.class)
public class CatalogTypeDeserializer extends JsonObjectDeserializer<CatalogType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CatalogTypeService catalogTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param catalogTypeService
     * @param conversionService
     */
    @Autowired
    public CatalogTypeDeserializer(@Lazy CatalogTypeService catalogTypeService, ConversionService conversionService) {
        this.catalogTypeService = catalogTypeService;
        this.conversionService = conversionService;
    }
}
