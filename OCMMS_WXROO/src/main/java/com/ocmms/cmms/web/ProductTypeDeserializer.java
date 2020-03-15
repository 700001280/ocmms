package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.configuration.ProductType;
import com.ocmms.cmms.service.api.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ProductTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ProductType.class)
public class ProductTypeDeserializer extends JsonObjectDeserializer<ProductType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ProductTypeService productTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param productTypeService
     * @param conversionService
     */
    @Autowired
    public ProductTypeDeserializer(@Lazy ProductTypeService productTypeService, ConversionService conversionService) {
        this.productTypeService = productTypeService;
        this.conversionService = conversionService;
    }
}
