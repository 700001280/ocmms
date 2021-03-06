// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.service.api.StorageLocationService;
import com.ocmms.cmms.web.StorageLocationDeserializer;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;

privileged aspect StorageLocationDeserializer_Roo_EntityDeserializer {
    
    declare @type: StorageLocationDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return StorageLocationService
     */
    public StorageLocationService StorageLocationDeserializer.getStorageLocationService() {
        return storageLocationService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storageLocationService
     */
    public void StorageLocationDeserializer.setStorageLocationService(StorageLocationService storageLocationService) {
        this.storageLocationService = storageLocationService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService StorageLocationDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void StorageLocationDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return StorageLocation
     * @throws IOException
     */
    public StorageLocation StorageLocationDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        StorageLocation storageLocation = storageLocationService.findOne(id);
        if (storageLocation == null) {
            throw new NotFoundException("StorageLocation not found");
        }
        return storageLocation;
    }
    
}
