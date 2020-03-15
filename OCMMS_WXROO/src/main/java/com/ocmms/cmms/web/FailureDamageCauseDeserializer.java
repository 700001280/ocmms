package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.FailureDamageCause;
import com.ocmms.cmms.service.api.FailureDamageCauseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = FailureDamageCauseDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = FailureDamageCause.class)
public class FailureDamageCauseDeserializer extends JsonObjectDeserializer<FailureDamageCause> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private FailureDamageCauseService failureDamageCauseService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param failureDamageCauseService
     * @param conversionService
     */
    @Autowired
    public FailureDamageCauseDeserializer(@Lazy FailureDamageCauseService failureDamageCauseService, ConversionService conversionService) {
        this.failureDamageCauseService = failureDamageCauseService;
        this.conversionService = conversionService;
    }
}
