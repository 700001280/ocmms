package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Hoist;
import com.ocmms.cmms.service.api.HoistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = HoistDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Hoist.class)
public class HoistDeserializer extends JsonObjectDeserializer<Hoist> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private HoistService hoistService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param hoistService
     * @param conversionService
     */
    @Autowired
    public HoistDeserializer(@Lazy HoistService hoistService, ConversionService conversionService) {
        this.hoistService = hoistService;
        this.conversionService = conversionService;
    }
}
