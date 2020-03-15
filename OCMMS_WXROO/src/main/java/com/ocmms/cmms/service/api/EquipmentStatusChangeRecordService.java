package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatusChangeRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = EquipmentStatusChangeRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = EquipmentStatusChangeRecord.class)
public interface EquipmentStatusChangeRecordService extends EntityResolver<EquipmentStatusChangeRecord, Long>, ValidatorService<EquipmentStatusChangeRecord> {
}
