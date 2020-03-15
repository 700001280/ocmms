package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.service.api.MaterialInstockDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaterialInstockDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaterialInstockDetail.class)
public class MaterialInstockDetailDeserializer extends JsonObjectDeserializer<MaterialInstockDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaterialInstockDetailService materialInstockDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param materialInstockDetailService
     * @param conversionService
     */
    @Autowired
    public MaterialInstockDetailDeserializer(@Lazy MaterialInstockDetailService materialInstockDetailService, ConversionService conversionService) {
        this.materialInstockDetailService = materialInstockDetailService;
        this.conversionService = conversionService;
    }
}
