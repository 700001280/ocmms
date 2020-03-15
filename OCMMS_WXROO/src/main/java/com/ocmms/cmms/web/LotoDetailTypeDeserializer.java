package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoDetailType;
import com.ocmms.cmms.service.api.LotoDetailTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = LotoDetailTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = LotoDetailType.class)
public class LotoDetailTypeDeserializer extends JsonObjectDeserializer<LotoDetailType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private LotoDetailTypeService lotoDetailTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param lotoDetailTypeService
     * @param conversionService
     */
    @Autowired
    public LotoDetailTypeDeserializer(@Lazy LotoDetailTypeService lotoDetailTypeService, ConversionService conversionService) {
        this.lotoDetailTypeService = lotoDetailTypeService;
        this.conversionService = conversionService;
    }
}
