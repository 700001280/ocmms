package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import com.ocmms.cmms.service.api.OperationalWorkCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = OperationalWorkCenterDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = OperationalWorkCenter.class)
public class OperationalWorkCenterDeserializer extends JsonObjectDeserializer<OperationalWorkCenter> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private OperationalWorkCenterService operationalWorkCenterService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param operationalWorkCenterService
     * @param conversionService
     */
    @Autowired
    public OperationalWorkCenterDeserializer(@Lazy OperationalWorkCenterService operationalWorkCenterService, ConversionService conversionService) {
        this.operationalWorkCenterService = operationalWorkCenterService;
        this.conversionService = conversionService;
    }
}
