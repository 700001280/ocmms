package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.SortField;
import com.ocmms.cmms.service.api.SortFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = SortFieldDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = SortField.class)
public class SortFieldDeserializer extends JsonObjectDeserializer<SortField> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SortFieldService sortFieldService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param sortFieldService
     * @param conversionService
     */
    @Autowired
    public SortFieldDeserializer(@Lazy SortFieldService sortFieldService, ConversionService conversionService) {
        this.sortFieldService = sortFieldService;
        this.conversionService = conversionService;
    }
}
