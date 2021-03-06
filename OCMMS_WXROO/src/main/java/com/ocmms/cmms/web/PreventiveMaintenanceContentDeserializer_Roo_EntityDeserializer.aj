// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import com.ocmms.cmms.service.api.PreventiveMaintenanceContentService;
import com.ocmms.cmms.web.PreventiveMaintenanceContentDeserializer;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;

privileged aspect PreventiveMaintenanceContentDeserializer_Roo_EntityDeserializer {
    
    declare @type: PreventiveMaintenanceContentDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return PreventiveMaintenanceContentService
     */
    public PreventiveMaintenanceContentService PreventiveMaintenanceContentDeserializer.getPreventiveMaintenanceContentService() {
        return preventiveMaintenanceContentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContentService
     */
    public void PreventiveMaintenanceContentDeserializer.setPreventiveMaintenanceContentService(PreventiveMaintenanceContentService preventiveMaintenanceContentService) {
        this.preventiveMaintenanceContentService = preventiveMaintenanceContentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService PreventiveMaintenanceContentDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void PreventiveMaintenanceContentDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return PreventiveMaintenanceContent
     * @throws IOException
     */
    public PreventiveMaintenanceContent PreventiveMaintenanceContentDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        PreventiveMaintenanceContent preventiveMaintenanceContent = preventiveMaintenanceContentService.findOne(id);
        if (preventiveMaintenanceContent == null) {
            throw new NotFoundException("PreventiveMaintenanceContent not found");
        }
        return preventiveMaintenanceContent;
    }
    
}
