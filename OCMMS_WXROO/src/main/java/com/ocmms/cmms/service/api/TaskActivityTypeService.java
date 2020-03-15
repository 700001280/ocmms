package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.task.TaskActivityType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskActivityTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TaskActivityType.class)
public interface TaskActivityTypeService extends EntityResolver<TaskActivityType, Long>, ValidatorService<TaskActivityType> {
}
