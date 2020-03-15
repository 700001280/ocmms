package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.service.api.InstockDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = InstockDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = InstockDetail.class)
public class InstockDetailDeserializer extends JsonObjectDeserializer<InstockDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private InstockDetailService instockDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param instockDetailService
     * @param conversionService
     */
    @Autowired
    public InstockDetailDeserializer(@Lazy InstockDetailService instockDetailService, ConversionService conversionService) {
        this.instockDetailService = instockDetailService;
        this.conversionService = conversionService;
    }
}
