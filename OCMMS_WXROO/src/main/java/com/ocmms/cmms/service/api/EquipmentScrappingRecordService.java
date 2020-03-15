package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.EquipmentScrappingRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = EquipmentScrappingRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = EquipmentScrappingRecord.class)
public interface EquipmentScrappingRecordService extends EntityResolver<EquipmentScrappingRecord, Long>, ValidatorService<EquipmentScrappingRecord> {
}
