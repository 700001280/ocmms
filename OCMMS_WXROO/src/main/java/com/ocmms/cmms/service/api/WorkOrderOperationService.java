package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkOrderOperationService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkOrderOperation.class)
public interface WorkOrderOperationService extends EntityResolver<WorkOrderOperation, Long>, ValidatorService<WorkOrderOperation> {
}
