package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.MachineWorkCenter;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MachineWorkCenterService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MachineWorkCenter.class)
public interface MachineWorkCenterService extends EntityResolver<MachineWorkCenter, Long>, ValidatorService<MachineWorkCenter> {
}
