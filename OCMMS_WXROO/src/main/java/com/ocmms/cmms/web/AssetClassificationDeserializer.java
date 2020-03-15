package com.ocmms.cmms.web;
import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.service.api.AssetClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = AssetClassificationDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = AssetClassification.class)
public class AssetClassificationDeserializer extends JsonObjectDeserializer<AssetClassification> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AssetClassificationService assetClassificationService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param assetClassificationService
     * @param conversionService
     */
    @Autowired
    public AssetClassificationDeserializer(@Lazy AssetClassificationService assetClassificationService, ConversionService conversionService) {
        this.assetClassificationService = assetClassificationService;
        this.conversionService = conversionService;
    }
}
