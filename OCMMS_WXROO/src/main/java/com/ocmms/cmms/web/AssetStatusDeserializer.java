package com.ocmms.cmms.web;
import com.ocmms.cmms.model.asset.AssetStatus;
import com.ocmms.cmms.service.api.AssetStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = AssetStatusDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = AssetStatus.class)
public class AssetStatusDeserializer extends JsonObjectDeserializer<AssetStatus> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AssetStatusService assetStatusService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param assetStatusService
     * @param conversionService
     */
    @Autowired
    public AssetStatusDeserializer(@Lazy AssetStatusService assetStatusService, ConversionService conversionService) {
        this.assetStatusService = assetStatusService;
        this.conversionService = conversionService;
    }
}
