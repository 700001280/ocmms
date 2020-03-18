package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import com.ocmms.cmms.service.api.OutstockDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = OutstockDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = OutstockDetail.class)
public class OutstockDetailDeserializer extends JsonObjectDeserializer<OutstockDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private OutstockDetailService outstockDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param outstockDetailService
     * @param conversionService
     */
    @Autowired
    public OutstockDetailDeserializer(@Lazy OutstockDetailService outstockDetailService, ConversionService conversionService) {
        this.outstockDetailService = outstockDetailService;
        this.conversionService = conversionService;
    }
}
