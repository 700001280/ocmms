package com.ocmms.cmms.web;
import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import com.ocmms.cmms.service.api.AssetStatusChangeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = AssetStatusChangeRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = AssetStatusChangeRecord.class)
public class AssetStatusChangeRecordDeserializer extends JsonObjectDeserializer<AssetStatusChangeRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AssetStatusChangeRecordService assetStatusChangeRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param assetStatusChangeRecordService
     * @param conversionService
     */
    @Autowired
    public AssetStatusChangeRecordDeserializer(@Lazy AssetStatusChangeRecordService assetStatusChangeRecordService, ConversionService conversionService) {
        this.assetStatusChangeRecordService = assetStatusChangeRecordService;
        this.conversionService = conversionService;
    }
}
