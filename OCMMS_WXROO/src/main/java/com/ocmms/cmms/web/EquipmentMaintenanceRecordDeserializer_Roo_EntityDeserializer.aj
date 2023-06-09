// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.service.api.EquipmentMaintenanceRecordService;
import com.ocmms.cmms.web.EquipmentMaintenanceRecordDeserializer;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;

privileged aspect EquipmentMaintenanceRecordDeserializer_Roo_EntityDeserializer {
    
    declare @type: EquipmentMaintenanceRecordDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return EquipmentMaintenanceRecordService
     */
    public EquipmentMaintenanceRecordService EquipmentMaintenanceRecordDeserializer.getEquipmentMaintenanceRecordService() {
        return equipmentMaintenanceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecordService
     */
    public void EquipmentMaintenanceRecordDeserializer.setEquipmentMaintenanceRecordService(EquipmentMaintenanceRecordService equipmentMaintenanceRecordService) {
        this.equipmentMaintenanceRecordService = equipmentMaintenanceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService EquipmentMaintenanceRecordDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void EquipmentMaintenanceRecordDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return EquipmentMaintenanceRecord
     * @throws IOException
     */
    public EquipmentMaintenanceRecord EquipmentMaintenanceRecordDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        EquipmentMaintenanceRecord equipmentMaintenanceRecord = equipmentMaintenanceRecordService.findOne(id);
        if (equipmentMaintenanceRecord == null) {
            throw new NotFoundException("EquipmentMaintenanceRecord not found");
        }
        return equipmentMaintenanceRecord;
    }
    
}
