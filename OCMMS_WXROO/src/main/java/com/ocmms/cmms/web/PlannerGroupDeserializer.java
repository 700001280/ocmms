package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.service.api.PlannerGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PlannerGroupDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PlannerGroup.class)
public class PlannerGroupDeserializer extends JsonObjectDeserializer<PlannerGroup> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PlannerGroupService plannerGroupService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param plannerGroupService
     * @param conversionService
     */
    @Autowired
    public PlannerGroupDeserializer(@Lazy PlannerGroupService plannerGroupService, ConversionService conversionService) {
        this.plannerGroupService = plannerGroupService;
        this.conversionService = conversionService;
    }
}
