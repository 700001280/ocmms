package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.TaskTrackingPriority;
import com.ocmms.cmms.service.api.TaskTrackingPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskTrackingPriorityDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskTrackingPriority.class)
public class TaskTrackingPriorityDeserializer extends JsonObjectDeserializer<TaskTrackingPriority> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskTrackingPriorityService taskTrackingPriorityService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskTrackingPriorityService
     * @param conversionService
     */
    @Autowired
    public TaskTrackingPriorityDeserializer(@Lazy TaskTrackingPriorityService taskTrackingPriorityService, ConversionService conversionService) {
        this.taskTrackingPriorityService = taskTrackingPriorityService;
        this.conversionService = conversionService;
    }
}
