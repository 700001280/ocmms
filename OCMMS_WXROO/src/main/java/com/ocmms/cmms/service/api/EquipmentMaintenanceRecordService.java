package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = EquipmentMaintenanceRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = EquipmentMaintenanceRecord.class)
public interface EquipmentMaintenanceRecordService extends EntityResolver<EquipmentMaintenanceRecord, Long>, ValidatorService<EquipmentMaintenanceRecord> {
}
