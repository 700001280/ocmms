package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PreventiveMaintenanceExecutionService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PreventiveMaintenanceExecution.class)
public interface PreventiveMaintenanceExecutionService extends EntityResolver<PreventiveMaintenanceExecution, Long>, ValidatorService<PreventiveMaintenanceExecution> {
}
