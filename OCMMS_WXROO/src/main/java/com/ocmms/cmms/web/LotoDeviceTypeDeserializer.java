package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoDeviceType;
import com.ocmms.cmms.service.api.LotoDeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = LotoDeviceTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = LotoDeviceType.class)
public class LotoDeviceTypeDeserializer extends JsonObjectDeserializer<LotoDeviceType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private LotoDeviceTypeService lotoDeviceTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param lotoDeviceTypeService
     * @param conversionService
     */
    @Autowired
    public LotoDeviceTypeDeserializer(@Lazy LotoDeviceTypeService lotoDeviceTypeService, ConversionService conversionService) {
        this.lotoDeviceTypeService = lotoDeviceTypeService;
        this.conversionService = conversionService;
    }
}
