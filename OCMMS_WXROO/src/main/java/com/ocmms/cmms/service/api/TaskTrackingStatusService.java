package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.assistance.TaskTrackingStatus;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskTrackingStatusService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TaskTrackingStatus.class)
public interface TaskTrackingStatusService extends EntityResolver<TaskTrackingStatus, Long>, ValidatorService<TaskTrackingStatus> {
}
