package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.TaskTrackingStatus;
import com.ocmms.cmms.service.api.TaskTrackingStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskTrackingStatusDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskTrackingStatus.class)
public class TaskTrackingStatusDeserializer extends JsonObjectDeserializer<TaskTrackingStatus> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskTrackingStatusService taskTrackingStatusService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskTrackingStatusService
     * @param conversionService
     */
    @Autowired
    public TaskTrackingStatusDeserializer(@Lazy TaskTrackingStatusService taskTrackingStatusService, ConversionService conversionService) {
        this.taskTrackingStatusService = taskTrackingStatusService;
        this.conversionService = conversionService;
    }
}
