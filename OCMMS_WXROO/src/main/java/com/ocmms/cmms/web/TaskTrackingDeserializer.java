package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.service.api.TaskTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskTrackingDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskTracking.class)
public class TaskTrackingDeserializer extends JsonObjectDeserializer<TaskTracking> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskTrackingService taskTrackingService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskTrackingService
     * @param conversionService
     */
    @Autowired
    public TaskTrackingDeserializer(@Lazy TaskTrackingService taskTrackingService, ConversionService conversionService) {
        this.taskTrackingService = taskTrackingService;
        this.conversionService = conversionService;
    }
}
