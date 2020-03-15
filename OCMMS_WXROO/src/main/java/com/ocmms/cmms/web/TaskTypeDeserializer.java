package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskType;
import com.ocmms.cmms.service.api.TaskTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskType.class)
public class TaskTypeDeserializer extends JsonObjectDeserializer<TaskType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskTypeService taskTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskTypeService
     * @param conversionService
     */
    @Autowired
    public TaskTypeDeserializer(@Lazy TaskTypeService taskTypeService, ConversionService conversionService) {
        this.taskTypeService = taskTypeService;
        this.conversionService = conversionService;
    }
}
