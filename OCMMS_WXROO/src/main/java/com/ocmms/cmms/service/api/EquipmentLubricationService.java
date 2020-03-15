package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentLubrication;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = EquipmentLubricationService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = EquipmentLubrication.class)
public interface EquipmentLubricationService extends EntityResolver<EquipmentLubrication, Long>, ValidatorService<EquipmentLubrication> {
}
