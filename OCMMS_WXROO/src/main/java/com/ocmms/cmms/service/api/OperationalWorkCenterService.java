package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = OperationalWorkCenterService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = OperationalWorkCenter.class)
public interface OperationalWorkCenterService extends EntityResolver<OperationalWorkCenter, Long>, ValidatorService<OperationalWorkCenter> {
}
