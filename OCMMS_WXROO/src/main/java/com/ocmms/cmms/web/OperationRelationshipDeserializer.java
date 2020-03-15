package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.OperationRelationship;
import com.ocmms.cmms.service.api.OperationRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = OperationRelationshipDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = OperationRelationship.class)
public class OperationRelationshipDeserializer extends JsonObjectDeserializer<OperationRelationship> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private OperationRelationshipService operationRelationshipService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param operationRelationshipService
     * @param conversionService
     */
    @Autowired
    public OperationRelationshipDeserializer(@Lazy OperationRelationshipService operationRelationshipService, ConversionService conversionService) {
        this.operationRelationshipService = operationRelationshipService;
        this.conversionService = conversionService;
    }
}
