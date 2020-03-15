package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PlanStrategy;
import com.ocmms.cmms.service.api.PlanStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PlanStrategyDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PlanStrategy.class)
public class PlanStrategyDeserializer extends JsonObjectDeserializer<PlanStrategy> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PlanStrategyService planStrategyService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param planStrategyService
     * @param conversionService
     */
    @Autowired
    public PlanStrategyDeserializer(@Lazy PlanStrategyService planStrategyService, ConversionService conversionService) {
        this.planStrategyService = planStrategyService;
        this.conversionService = conversionService;
    }
}
