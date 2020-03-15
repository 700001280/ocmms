package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.plan.PlanStrategy;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PlanStrategyService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PlanStrategy.class)
public interface PlanStrategyService extends EntityResolver<PlanStrategy, Long>, ValidatorService<PlanStrategy> {
}
