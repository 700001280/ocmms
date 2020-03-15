package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.Province;
import com.ocmms.cmms.service.api.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ProvinceDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Province.class)
public class ProvinceDeserializer extends JsonObjectDeserializer<Province> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ProvinceService provinceService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param provinceService
     * @param conversionService
     */
    @Autowired
    public ProvinceDeserializer(@Lazy ProvinceService provinceService, ConversionService conversionService) {
        this.provinceService = provinceService;
        this.conversionService = conversionService;
    }
}
