package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.assistance.TaskTrackingPriority;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskTrackingPriorityService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TaskTrackingPriority.class)
public interface TaskTrackingPriorityService extends EntityResolver<TaskTrackingPriority, Long>, ValidatorService<TaskTrackingPriority> {
}
