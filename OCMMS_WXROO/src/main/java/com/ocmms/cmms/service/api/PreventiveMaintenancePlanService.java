package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PreventiveMaintenancePlanService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PreventiveMaintenancePlan.class)
public interface PreventiveMaintenancePlanService extends EntityResolver<PreventiveMaintenancePlan, Long>, ValidatorService<PreventiveMaintenancePlan> {
}
