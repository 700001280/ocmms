package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.assistance.TaskTrackingType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskTrackingTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TaskTrackingType.class)
public interface TaskTrackingTypeService extends EntityResolver<TaskTrackingType, Long>, ValidatorService<TaskTrackingType> {
}
