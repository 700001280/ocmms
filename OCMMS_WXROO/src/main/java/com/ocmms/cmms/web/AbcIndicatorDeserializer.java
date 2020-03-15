package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.AbcIndicator;
import com.ocmms.cmms.service.api.AbcIndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = AbcIndicatorDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = AbcIndicator.class)
public class AbcIndicatorDeserializer extends JsonObjectDeserializer<AbcIndicator> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AbcIndicatorService abcIndicatorService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param abcIndicatorService
     * @param conversionService
     */
    @Autowired
    public AbcIndicatorDeserializer(@Lazy AbcIndicatorService abcIndicatorService, ConversionService conversionService) {
        this.abcIndicatorService = abcIndicatorService;
        this.conversionService = conversionService;
    }
}
