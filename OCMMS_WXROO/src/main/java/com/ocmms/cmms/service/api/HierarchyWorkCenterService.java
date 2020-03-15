package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = HierarchyWorkCenterService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = HierarchyWorkCenter.class)
public interface HierarchyWorkCenterService extends EntityResolver<HierarchyWorkCenter, Long>, ValidatorService<HierarchyWorkCenter> {
}
