package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskActivityType;
import com.ocmms.cmms.service.api.TaskActivityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskActivityTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskActivityType.class)
public class TaskActivityTypeDeserializer extends JsonObjectDeserializer<TaskActivityType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskActivityTypeService taskActivityTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskActivityTypeService
     * @param conversionService
     */
    @Autowired
    public TaskActivityTypeDeserializer(@Lazy TaskActivityTypeService taskActivityTypeService, ConversionService conversionService) {
        this.taskActivityTypeService = taskActivityTypeService;
        this.conversionService = conversionService;
    }
}
