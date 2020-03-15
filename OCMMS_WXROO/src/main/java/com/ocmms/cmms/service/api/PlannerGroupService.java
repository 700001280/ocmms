package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PlannerGroupService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PlannerGroup.class)
public interface PlannerGroupService extends EntityResolver<PlannerGroup, Long>, ValidatorService<PlannerGroup> {
}
