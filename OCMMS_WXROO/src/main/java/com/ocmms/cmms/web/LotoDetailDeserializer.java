package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoDetail;
import com.ocmms.cmms.service.api.LotoDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = LotoDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = LotoDetail.class)
public class LotoDetailDeserializer extends JsonObjectDeserializer<LotoDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private LotoDetailService lotoDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param lotoDetailService
     * @param conversionService
     */
    @Autowired
    public LotoDetailDeserializer(@Lazy LotoDetailService lotoDetailService, ConversionService conversionService) {
        this.lotoDetailService = lotoDetailService;
        this.conversionService = conversionService;
    }
}
