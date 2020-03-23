package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.service.api.MaterialStorageLocationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaterialStorageLocationInfoDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaterialStorageLocationInfo.class)
public class MaterialStorageLocationInfoDeserializer extends JsonObjectDeserializer<MaterialStorageLocationInfo> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaterialStorageLocationInfoService materialStorageLocationInfoService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param materialStorageLocationInfoService
     * @param conversionService
     */
    @Autowired
    public MaterialStorageLocationInfoDeserializer(@Lazy MaterialStorageLocationInfoService materialStorageLocationInfoService, ConversionService conversionService) {
        this.materialStorageLocationInfoService = materialStorageLocationInfoService;
        this.conversionService = conversionService;
    }
}
