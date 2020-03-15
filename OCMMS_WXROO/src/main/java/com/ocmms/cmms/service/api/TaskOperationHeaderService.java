package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.task.TaskOperationHeader;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskOperationHeaderService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TaskOperationHeader.class)
public interface TaskOperationHeaderService extends EntityResolver<TaskOperationHeader, Long>, ValidatorService<TaskOperationHeader> {
}
