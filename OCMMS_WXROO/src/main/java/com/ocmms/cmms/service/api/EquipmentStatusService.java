package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatus;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = EquipmentStatusService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = EquipmentStatus.class)
public interface EquipmentStatusService extends EntityResolver<EquipmentStatus, Long>, ValidatorService<EquipmentStatus> {
}
