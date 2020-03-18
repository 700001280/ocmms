package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.PartScrappingOutstockDetail;
import com.ocmms.cmms.service.api.PartScrappingOutstockDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PartScrappingOutstockDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PartScrappingOutstockDetail.class)
public class PartScrappingOutstockDetailDeserializer extends JsonObjectDeserializer<PartScrappingOutstockDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PartScrappingOutstockDetailService partScrappingOutstockDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param partScrappingOutstockDetailService
     * @param conversionService
     */
    @Autowired
    public PartScrappingOutstockDetailDeserializer(@Lazy PartScrappingOutstockDetailService partScrappingOutstockDetailService, ConversionService conversionService) {
        this.partScrappingOutstockDetailService = partScrappingOutstockDetailService;
        this.conversionService = conversionService;
    }
}
