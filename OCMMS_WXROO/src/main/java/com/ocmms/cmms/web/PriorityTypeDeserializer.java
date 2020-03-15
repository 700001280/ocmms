package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.PriorityType;
import com.ocmms.cmms.service.api.PriorityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PriorityTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PriorityType.class)
public class PriorityTypeDeserializer extends JsonObjectDeserializer<PriorityType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PriorityTypeService priorityTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param priorityTypeService
     * @param conversionService
     */
    @Autowired
    public PriorityTypeDeserializer(@Lazy PriorityTypeService priorityTypeService, ConversionService conversionService) {
        this.priorityTypeService = priorityTypeService;
        this.conversionService = conversionService;
    }
}
