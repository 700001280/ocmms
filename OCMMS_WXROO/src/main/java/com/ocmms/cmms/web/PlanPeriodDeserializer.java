package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PlanPeriod;
import com.ocmms.cmms.service.api.PlanPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PlanPeriodDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PlanPeriod.class)
public class PlanPeriodDeserializer extends JsonObjectDeserializer<PlanPeriod> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PlanPeriodService planPeriodService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param planPeriodService
     * @param conversionService
     */
    @Autowired
    public PlanPeriodDeserializer(@Lazy PlanPeriodService planPeriodService, ConversionService conversionService) {
        this.planPeriodService = planPeriodService;
        this.conversionService = conversionService;
    }
}
