package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = EquipmentReplaceRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = EquipmentReplaceRecord.class)
public interface EquipmentReplaceRecordService extends EntityResolver<EquipmentReplaceRecord, Long>, ValidatorService<EquipmentReplaceRecord> {
}
