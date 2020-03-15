package com.ocmms.cmms.web;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.service.api.CostCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = CostCenterDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = CostCenter.class)
public class CostCenterDeserializer extends JsonObjectDeserializer<CostCenter> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CostCenterService costCenterService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param costCenterService
     * @param conversionService
     */
    @Autowired
    public CostCenterDeserializer(@Lazy CostCenterService costCenterService, ConversionService conversionService) {
        this.costCenterService = costCenterService;
        this.conversionService = conversionService;
    }
}
