package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskHeader;
import com.ocmms.cmms.service.api.TaskHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskHeaderDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskHeader.class)
public class TaskHeaderDeserializer extends JsonObjectDeserializer<TaskHeader> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskHeaderService taskHeaderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskHeaderService
     * @param conversionService
     */
    @Autowired
    public TaskHeaderDeserializer(@Lazy TaskHeaderService taskHeaderService, ConversionService conversionService) {
        this.taskHeaderService = taskHeaderService;
        this.conversionService = conversionService;
    }
}
