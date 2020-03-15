package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import com.ocmms.cmms.service.api.SystemConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = SystemConditionDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = SystemCondition.class)
public class SystemConditionDeserializer extends JsonObjectDeserializer<SystemCondition> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SystemConditionService systemConditionService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param systemConditionService
     * @param conversionService
     */
    @Autowired
    public SystemConditionDeserializer(@Lazy SystemConditionService systemConditionService, ConversionService conversionService) {
        this.systemConditionService = systemConditionService;
        this.conversionService = conversionService;
    }
}
