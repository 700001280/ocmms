package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PreventiveMaintenanceStandardService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PreventiveMaintenanceStandard.class)
public interface PreventiveMaintenanceStandardService extends EntityResolver<PreventiveMaintenanceStandard, Long>, ValidatorService<PreventiveMaintenanceStandard> {
}
