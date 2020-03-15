package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkOrderTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkOrderType.class)
public interface WorkOrderTypeService extends EntityResolver<WorkOrderType, Long>, ValidatorService<WorkOrderType> {
}
