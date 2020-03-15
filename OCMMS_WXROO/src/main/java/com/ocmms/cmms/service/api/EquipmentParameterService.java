package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentParameter;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = EquipmentParameterService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = EquipmentParameter.class)
public interface EquipmentParameterService extends EntityResolver<EquipmentParameter, Long>, ValidatorService<EquipmentParameter> {
}
