package com.ocmms.cmms.web;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.service.api.AssetInventoryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = AssetInventoryRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = AssetInventoryRecord.class)
public class AssetInventoryRecordDeserializer extends JsonObjectDeserializer<AssetInventoryRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AssetInventoryRecordService assetInventoryRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param assetInventoryRecordService
     * @param conversionService
     */
    @Autowired
    public AssetInventoryRecordDeserializer(@Lazy AssetInventoryRecordService assetInventoryRecordService, ConversionService conversionService) {
        this.assetInventoryRecordService = assetInventoryRecordService;
        this.conversionService = conversionService;
    }
}
