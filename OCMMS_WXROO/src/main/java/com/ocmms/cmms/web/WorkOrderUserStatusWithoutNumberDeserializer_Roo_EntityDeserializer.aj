// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithoutNumber;
import com.ocmms.cmms.service.api.WorkOrderUserStatusWithoutNumberService;
import com.ocmms.cmms.web.WorkOrderUserStatusWithoutNumberDeserializer;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;

privileged aspect WorkOrderUserStatusWithoutNumberDeserializer_Roo_EntityDeserializer {
    
    declare @type: WorkOrderUserStatusWithoutNumberDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderUserStatusWithoutNumberService
     */
    public WorkOrderUserStatusWithoutNumberService WorkOrderUserStatusWithoutNumberDeserializer.getWorkOrderUserStatusWithoutNumberService() {
        return workOrderUserStatusWithoutNumberService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderUserStatusWithoutNumberService
     */
    public void WorkOrderUserStatusWithoutNumberDeserializer.setWorkOrderUserStatusWithoutNumberService(WorkOrderUserStatusWithoutNumberService workOrderUserStatusWithoutNumberService) {
        this.workOrderUserStatusWithoutNumberService = workOrderUserStatusWithoutNumberService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService WorkOrderUserStatusWithoutNumberDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void WorkOrderUserStatusWithoutNumberDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return WorkOrderUserStatusWithoutNumber
     * @throws IOException
     */
    public WorkOrderUserStatusWithoutNumber WorkOrderUserStatusWithoutNumberDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        WorkOrderUserStatusWithoutNumber workOrderUserStatusWithoutNumber = workOrderUserStatusWithoutNumberService.findOne(id);
        if (workOrderUserStatusWithoutNumber == null) {
            throw new NotFoundException("WorkOrderUserStatusWithoutNumber not found");
        }
        return workOrderUserStatusWithoutNumber;
    }
    
}
