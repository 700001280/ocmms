package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkOrderSystemStatusService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkOrderSystemStatus.class)
public interface WorkOrderSystemStatusService extends EntityResolver<WorkOrderSystemStatus, Long>, ValidatorService<WorkOrderSystemStatus> {
}
