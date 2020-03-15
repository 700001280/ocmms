package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.FailureDamageType;
import com.ocmms.cmms.service.api.FailureDamageTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = FailureDamageTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = FailureDamageType.class)
public class FailureDamageTypeDeserializer extends JsonObjectDeserializer<FailureDamageType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private FailureDamageTypeService failureDamageTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param failureDamageTypeService
     * @param conversionService
     */
    @Autowired
    public FailureDamageTypeDeserializer(@Lazy FailureDamageTypeService failureDamageTypeService, ConversionService conversionService) {
        this.failureDamageTypeService = failureDamageTypeService;
        this.conversionService = conversionService;
    }
}
