package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = AutonomousMaintenanceFindingService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = AutonomousMaintenanceFinding.class)
public interface AutonomousMaintenanceFindingService extends EntityResolver<AutonomousMaintenanceFinding, Long>, ValidatorService<AutonomousMaintenanceFinding> {
}
