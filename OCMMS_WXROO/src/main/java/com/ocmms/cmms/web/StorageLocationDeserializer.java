package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.service.api.StorageLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = StorageLocationDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = StorageLocation.class)
public class StorageLocationDeserializer extends JsonObjectDeserializer<StorageLocation> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private StorageLocationService storageLocationService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param storageLocationService
     * @param conversionService
     */
    @Autowired
    public StorageLocationDeserializer(@Lazy StorageLocationService storageLocationService, ConversionService conversionService) {
        this.storageLocationService = storageLocationService;
        this.conversionService = conversionService;
    }
}
