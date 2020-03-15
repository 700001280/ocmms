package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.service.api.LotoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = LotoInfoDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = LotoInfo.class)
public class LotoInfoDeserializer extends JsonObjectDeserializer<LotoInfo> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private LotoInfoService lotoInfoService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param lotoInfoService
     * @param conversionService
     */
    @Autowired
    public LotoInfoDeserializer(@Lazy LotoInfoService lotoInfoService, ConversionService conversionService) {
        this.lotoInfoService = lotoInfoService;
        this.conversionService = conversionService;
    }
}
