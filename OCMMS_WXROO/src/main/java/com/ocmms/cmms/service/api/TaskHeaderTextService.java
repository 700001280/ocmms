package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.task.TaskHeaderText;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskHeaderTextService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TaskHeaderText.class)
public interface TaskHeaderTextService extends EntityResolver<TaskHeaderText, Long>, ValidatorService<TaskHeaderText> {
}
