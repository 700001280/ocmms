package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.TaskTrackingType;
import com.ocmms.cmms.service.api.TaskTrackingTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskTrackingTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskTrackingType.class)
public class TaskTrackingTypeDeserializer extends JsonObjectDeserializer<TaskTrackingType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskTrackingTypeService taskTrackingTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskTrackingTypeService
     * @param conversionService
     */
    @Autowired
    public TaskTrackingTypeDeserializer(@Lazy TaskTrackingTypeService taskTrackingTypeService, ConversionService conversionService) {
        this.taskTrackingTypeService = taskTrackingTypeService;
        this.conversionService = conversionService;
    }
}
