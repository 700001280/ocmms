package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.StorageType;
import com.ocmms.cmms.service.api.StorageTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = StorageTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = StorageType.class)
public class StorageTypeDeserializer extends JsonObjectDeserializer<StorageType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private StorageTypeService storageTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param storageTypeService
     * @param conversionService
     */
    @Autowired
    public StorageTypeDeserializer(@Lazy StorageTypeService storageTypeService, ConversionService conversionService) {
        this.storageTypeService = storageTypeService;
        this.conversionService = conversionService;
    }
}
