package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MainWorkCenterService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MainWorkCenter.class)
public interface MainWorkCenterService extends EntityResolver<MainWorkCenter, Long>, ValidatorService<MainWorkCenter> {
}
