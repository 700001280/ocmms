package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskOperationHeader;
import com.ocmms.cmms.service.api.TaskOperationHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskOperationHeaderDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskOperationHeader.class)
public class TaskOperationHeaderDeserializer extends JsonObjectDeserializer<TaskOperationHeader> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskOperationHeaderService taskOperationHeaderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskOperationHeaderService
     * @param conversionService
     */
    @Autowired
    public TaskOperationHeaderDeserializer(@Lazy TaskOperationHeaderService taskOperationHeaderService, ConversionService conversionService) {
        this.taskOperationHeaderService = taskOperationHeaderService;
        this.conversionService = conversionService;
    }
}
