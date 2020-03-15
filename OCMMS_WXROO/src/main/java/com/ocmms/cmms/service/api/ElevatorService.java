package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Elevator;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ElevatorService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Elevator.class)
public interface ElevatorService extends EntityResolver<Elevator, Long>, ValidatorService<Elevator> {
}
