package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PlanItem;
import com.ocmms.cmms.service.api.PlanItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PlanItemDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PlanItem.class)
public class PlanItemDeserializer extends JsonObjectDeserializer<PlanItem> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PlanItemService planItemService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param planItemService
     * @param conversionService
     */
    @Autowired
    public PlanItemDeserializer(@Lazy PlanItemService planItemService, ConversionService conversionService) {
        this.planItemService = planItemService;
        this.conversionService = conversionService;
    }
}
