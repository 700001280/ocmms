// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.ocmms.cmms.model.loto.LotoDeviceType;
import com.ocmms.cmms.service.api.LotoDeviceTypeService;
import com.ocmms.cmms.web.LotoDeviceTypeDeserializer;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;

privileged aspect LotoDeviceTypeDeserializer_Roo_EntityDeserializer {
    
    declare @type: LotoDeviceTypeDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return LotoDeviceTypeService
     */
    public LotoDeviceTypeService LotoDeviceTypeDeserializer.getLotoDeviceTypeService() {
        return lotoDeviceTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoDeviceTypeService
     */
    public void LotoDeviceTypeDeserializer.setLotoDeviceTypeService(LotoDeviceTypeService lotoDeviceTypeService) {
        this.lotoDeviceTypeService = lotoDeviceTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService LotoDeviceTypeDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void LotoDeviceTypeDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return LotoDeviceType
     * @throws IOException
     */
    public LotoDeviceType LotoDeviceTypeDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        LotoDeviceType lotoDeviceType = lotoDeviceTypeService.findOne(id);
        if (lotoDeviceType == null) {
            throw new NotFoundException("LotoDeviceType not found");
        }
        return lotoDeviceType;
    }
    
}
