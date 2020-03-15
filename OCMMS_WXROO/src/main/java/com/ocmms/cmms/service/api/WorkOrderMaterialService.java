package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkOrderMaterialService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkOrderMaterial.class)
public interface WorkOrderMaterialService extends EntityResolver<WorkOrderMaterial, Long>, ValidatorService<WorkOrderMaterial> {
}
