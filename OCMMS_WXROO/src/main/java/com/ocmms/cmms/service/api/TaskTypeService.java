package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.task.TaskType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TaskType.class)
public interface TaskTypeService extends EntityResolver<TaskType, Long>, ValidatorService<TaskType> {
}
