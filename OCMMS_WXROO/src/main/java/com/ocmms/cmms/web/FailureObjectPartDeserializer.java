package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.FailureObjectPart;
import com.ocmms.cmms.service.api.FailureObjectPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = FailureObjectPartDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = FailureObjectPart.class)
public class FailureObjectPartDeserializer extends JsonObjectDeserializer<FailureObjectPart> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private FailureObjectPartService failureObjectPartService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param failureObjectPartService
     * @param conversionService
     */
    @Autowired
    public FailureObjectPartDeserializer(@Lazy FailureObjectPartService failureObjectPartService, ConversionService conversionService) {
        this.failureObjectPartService = failureObjectPartService;
        this.conversionService = conversionService;
    }
}
