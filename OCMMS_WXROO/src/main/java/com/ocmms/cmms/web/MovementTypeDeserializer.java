package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.MovementType;
import com.ocmms.cmms.service.api.MovementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MovementTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MovementType.class)
public class MovementTypeDeserializer extends JsonObjectDeserializer<MovementType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MovementTypeService movementTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param movementTypeService
     * @param conversionService
     */
    @Autowired
    public MovementTypeDeserializer(@Lazy MovementTypeService movementTypeService, ConversionService conversionService) {
        this.movementTypeService = movementTypeService;
        this.conversionService = conversionService;
    }
}
