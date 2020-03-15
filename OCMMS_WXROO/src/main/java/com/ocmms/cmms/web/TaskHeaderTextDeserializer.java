package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskHeaderText;
import com.ocmms.cmms.service.api.TaskHeaderTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskHeaderTextDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskHeaderText.class)
public class TaskHeaderTextDeserializer extends JsonObjectDeserializer<TaskHeaderText> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskHeaderTextService taskHeaderTextService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskHeaderTextService
     * @param conversionService
     */
    @Autowired
    public TaskHeaderTextDeserializer(@Lazy TaskHeaderTextService taskHeaderTextService, ConversionService conversionService) {
        this.taskHeaderTextService = taskHeaderTextService;
        this.conversionService = conversionService;
    }
}
