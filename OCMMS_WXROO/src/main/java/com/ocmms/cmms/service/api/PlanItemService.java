package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.plan.PlanItem;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PlanItemService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PlanItem.class)
public interface PlanItemService extends EntityResolver<PlanItem, Long>, ValidatorService<PlanItem> {
}
