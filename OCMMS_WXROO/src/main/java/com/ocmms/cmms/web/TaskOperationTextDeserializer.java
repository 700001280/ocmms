package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskOperationText;
import com.ocmms.cmms.service.api.TaskOperationTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskOperationTextDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskOperationText.class)
public class TaskOperationTextDeserializer extends JsonObjectDeserializer<TaskOperationText> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskOperationTextService taskOperationTextService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskOperationTextService
     * @param conversionService
     */
    @Autowired
    public TaskOperationTextDeserializer(@Lazy TaskOperationTextService taskOperationTextService, ConversionService conversionService) {
        this.taskOperationTextService = taskOperationTextService;
        this.conversionService = conversionService;
    }
}
