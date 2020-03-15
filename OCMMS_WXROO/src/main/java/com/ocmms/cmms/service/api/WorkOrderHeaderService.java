package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkOrderHeaderService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkOrderHeader.class)
public interface WorkOrderHeaderService extends EntityResolver<WorkOrderHeader, Long>, ValidatorService<WorkOrderHeader> {
}
