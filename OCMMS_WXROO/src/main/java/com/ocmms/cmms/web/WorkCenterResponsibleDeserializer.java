package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.ocmms.cmms.service.api.WorkCenterResponsibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkCenterResponsibleDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkCenterResponsible.class)
public class WorkCenterResponsibleDeserializer extends JsonObjectDeserializer<WorkCenterResponsible> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkCenterResponsibleService workCenterResponsibleService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workCenterResponsibleService
     * @param conversionService
     */
    @Autowired
    public WorkCenterResponsibleDeserializer(@Lazy WorkCenterResponsibleService workCenterResponsibleService, ConversionService conversionService) {
        this.workCenterResponsibleService = workCenterResponsibleService;
        this.conversionService = conversionService;
    }
}
