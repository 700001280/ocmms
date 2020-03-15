package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.task.TaskOperationMaterial;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskOperationMaterialService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TaskOperationMaterial.class)
public interface TaskOperationMaterialService extends EntityResolver<TaskOperationMaterial, Long>, ValidatorService<TaskOperationMaterial> {
}
