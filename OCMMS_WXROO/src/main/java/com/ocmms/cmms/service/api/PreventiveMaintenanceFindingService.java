package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.PreventiveMaintenanceFinding;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PreventiveMaintenanceFindingService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PreventiveMaintenanceFinding.class)
public interface PreventiveMaintenanceFindingService extends EntityResolver<PreventiveMaintenanceFinding, Long>, ValidatorService<PreventiveMaintenanceFinding> {
}
