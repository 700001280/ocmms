package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.ScrewElement;
import com.ocmms.cmms.service.api.ScrewElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ScrewElementDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ScrewElement.class)
public class ScrewElementDeserializer extends JsonObjectDeserializer<ScrewElement> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ScrewElementService screwElementService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param screwElementService
     * @param conversionService
     */
    @Autowired
    public ScrewElementDeserializer(@Lazy ScrewElementService screwElementService, ConversionService conversionService) {
        this.screwElementService = screwElementService;
        this.conversionService = conversionService;
    }
}
