package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.assistance.TaskTracking;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskTrackingService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TaskTracking.class)
public interface TaskTrackingService extends EntityResolver<TaskTracking, Long>, ValidatorService<TaskTracking> {
}
