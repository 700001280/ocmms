package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.workorder.WorkOrderTimeSheet;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkOrderTimeSheetService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkOrderTimeSheet.class)
public interface WorkOrderTimeSheetService extends EntityResolver<WorkOrderTimeSheet, Long>, ValidatorService<WorkOrderTimeSheet> {
}
