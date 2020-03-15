package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = EquipmentService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Equipment.class)
public interface EquipmentService extends EntityResolver<Equipment, Long>, ValidatorService<Equipment> {
}
