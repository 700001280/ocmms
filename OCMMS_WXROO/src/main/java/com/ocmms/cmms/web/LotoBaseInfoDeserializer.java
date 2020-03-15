package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoBaseInfo;
import com.ocmms.cmms.service.api.LotoBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = LotoBaseInfoDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = LotoBaseInfo.class)
public class LotoBaseInfoDeserializer extends JsonObjectDeserializer<LotoBaseInfo> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private LotoBaseInfoService lotoBaseInfoService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param lotoBaseInfoService
     * @param conversionService
     */
    @Autowired
    public LotoBaseInfoDeserializer(@Lazy LotoBaseInfoService lotoBaseInfoService, ConversionService conversionService) {
        this.lotoBaseInfoService = lotoBaseInfoService;
        this.conversionService = conversionService;
    }
}
