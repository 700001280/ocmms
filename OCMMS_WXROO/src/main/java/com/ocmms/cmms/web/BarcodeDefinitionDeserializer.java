package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.BarcodeDefinition;
import com.ocmms.cmms.service.api.BarcodeDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = BarcodeDefinitionDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = BarcodeDefinition.class)
public class BarcodeDefinitionDeserializer extends JsonObjectDeserializer<BarcodeDefinition> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private BarcodeDefinitionService barcodeDefinitionService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param barcodeDefinitionService
     * @param conversionService
     */
    @Autowired
    public BarcodeDefinitionDeserializer(@Lazy BarcodeDefinitionService barcodeDefinitionService, ConversionService conversionService) {
        this.barcodeDefinitionService = barcodeDefinitionService;
        this.conversionService = conversionService;
    }
}
