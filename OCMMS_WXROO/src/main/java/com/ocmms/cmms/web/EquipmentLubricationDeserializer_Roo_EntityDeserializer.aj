// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentLubrication;
import com.ocmms.cmms.service.api.EquipmentLubricationService;
import com.ocmms.cmms.web.EquipmentLubricationDeserializer;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;

privileged aspect EquipmentLubricationDeserializer_Roo_EntityDeserializer {
    
    declare @type: EquipmentLubricationDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return EquipmentLubricationService
     */
    public EquipmentLubricationService EquipmentLubricationDeserializer.getEquipmentLubricationService() {
        return equipmentLubricationService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentLubricationService
     */
    public void EquipmentLubricationDeserializer.setEquipmentLubricationService(EquipmentLubricationService equipmentLubricationService) {
        this.equipmentLubricationService = equipmentLubricationService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService EquipmentLubricationDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void EquipmentLubricationDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return EquipmentLubrication
     * @throws IOException
     */
    public EquipmentLubrication EquipmentLubricationDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        EquipmentLubrication equipmentLubrication = equipmentLubricationService.findOne(id);
        if (equipmentLubrication == null) {
            throw new NotFoundException("EquipmentLubrication not found");
        }
        return equipmentLubrication;
    }
    
}
