package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkOrderUserStatusWithNumberService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkOrderUserStatusWithNumber.class)
public interface WorkOrderUserStatusWithNumberService extends EntityResolver<WorkOrderUserStatusWithNumber, Long>, ValidatorService<WorkOrderUserStatusWithNumber> {
}
