package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.task.TaskOperationText;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskOperationTextService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TaskOperationText.class)
public interface TaskOperationTextService extends EntityResolver<TaskOperationText, Long>, ValidatorService<TaskOperationText> {
}
