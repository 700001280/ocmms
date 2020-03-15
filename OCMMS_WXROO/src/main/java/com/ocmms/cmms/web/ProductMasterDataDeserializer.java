package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.configuration.ProductMasterData;
import com.ocmms.cmms.service.api.ProductMasterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ProductMasterDataDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ProductMasterData.class)
public class ProductMasterDataDeserializer extends JsonObjectDeserializer<ProductMasterData> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ProductMasterDataService productMasterDataService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param productMasterDataService
     * @param conversionService
     */
    @Autowired
    public ProductMasterDataDeserializer(@Lazy ProductMasterDataService productMasterDataService, ConversionService conversionService) {
        this.productMasterDataService = productMasterDataService;
        this.conversionService = conversionService;
    }
}
