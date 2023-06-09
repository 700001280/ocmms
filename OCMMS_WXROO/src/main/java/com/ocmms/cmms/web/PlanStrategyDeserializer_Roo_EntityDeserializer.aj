// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.ocmms.cmms.model.pm.plan.PlanStrategy;
import com.ocmms.cmms.service.api.PlanStrategyService;
import com.ocmms.cmms.web.PlanStrategyDeserializer;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;

privileged aspect PlanStrategyDeserializer_Roo_EntityDeserializer {
    
    declare @type: PlanStrategyDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return PlanStrategyService
     */
    public PlanStrategyService PlanStrategyDeserializer.getPlanStrategyService() {
        return planStrategyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param planStrategyService
     */
    public void PlanStrategyDeserializer.setPlanStrategyService(PlanStrategyService planStrategyService) {
        this.planStrategyService = planStrategyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService PlanStrategyDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void PlanStrategyDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return PlanStrategy
     * @throws IOException
     */
    public PlanStrategy PlanStrategyDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        PlanStrategy planStrategy = planStrategyService.findOne(id);
        if (planStrategy == null) {
            throw new NotFoundException("PlanStrategy not found");
        }
        return planStrategy;
    }
    
}
