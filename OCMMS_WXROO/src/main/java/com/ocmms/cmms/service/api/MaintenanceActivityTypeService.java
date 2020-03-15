package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaintenanceActivityTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaintenanceActivityType.class)
public interface MaintenanceActivityTypeService extends EntityResolver<MaintenanceActivityType, Long>, ValidatorService<MaintenanceActivityType> {
}
