package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.workorder.WorkOrderControlkey;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkOrderControlkeyService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkOrderControlkey.class)
public interface WorkOrderControlkeyService extends EntityResolver<WorkOrderControlkey, Long>, ValidatorService<WorkOrderControlkey> {
}
