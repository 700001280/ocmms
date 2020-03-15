package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.service.api.MaterialOutstockDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaterialOutstockDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaterialOutstockDetail.class)
public class MaterialOutstockDetailDeserializer extends JsonObjectDeserializer<MaterialOutstockDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaterialOutstockDetailService materialOutstockDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param materialOutstockDetailService
     * @param conversionService
     */
    @Autowired
    public MaterialOutstockDetailDeserializer(@Lazy MaterialOutstockDetailService materialOutstockDetailService, ConversionService conversionService) {
        this.materialOutstockDetailService = materialOutstockDetailService;
        this.conversionService = conversionService;
    }
}
