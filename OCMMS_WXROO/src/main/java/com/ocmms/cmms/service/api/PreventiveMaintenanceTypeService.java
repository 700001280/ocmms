package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenanceType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PreventiveMaintenanceTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PreventiveMaintenanceType.class)
public interface PreventiveMaintenanceTypeService extends EntityResolver<PreventiveMaintenanceType, Long>, ValidatorService<PreventiveMaintenanceType> {
}
