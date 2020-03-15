package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.WorkLogType;
import com.ocmms.cmms.service.api.WorkLogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WorkLogTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = WorkLogType.class)
public class WorkLogTypeDeserializer extends JsonObjectDeserializer<WorkLogType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WorkLogTypeService workLogTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param workLogTypeService
     * @param conversionService
     */
    @Autowired
    public WorkLogTypeDeserializer(@Lazy WorkLogTypeService workLogTypeService, ConversionService conversionService) {
        this.workLogTypeService = workLogTypeService;
        this.conversionService = conversionService;
    }
}
