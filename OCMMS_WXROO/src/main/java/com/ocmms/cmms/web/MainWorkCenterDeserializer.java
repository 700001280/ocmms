package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.service.api.MainWorkCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MainWorkCenterDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MainWorkCenter.class)
public class MainWorkCenterDeserializer extends JsonObjectDeserializer<MainWorkCenter> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MainWorkCenterService mainWorkCenterService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param mainWorkCenterService
     * @param conversionService
     */
    @Autowired
    public MainWorkCenterDeserializer(@Lazy MainWorkCenterService mainWorkCenterService, ConversionService conversionService) {
        this.mainWorkCenterService = mainWorkCenterService;
        this.conversionService = conversionService;
    }
}
