package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.InstockType;
import com.ocmms.cmms.service.api.InstockTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = InstockTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = InstockType.class)
public class InstockTypeDeserializer extends JsonObjectDeserializer<InstockType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private InstockTypeService instockTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param instockTypeService
     * @param conversionService
     */
    @Autowired
    public InstockTypeDeserializer(@Lazy InstockTypeService instockTypeService, ConversionService conversionService) {
        this.instockTypeService = instockTypeService;
        this.conversionService = conversionService;
    }
}
