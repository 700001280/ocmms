package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerMaintenanceRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PelletizerUpRollerMaintenanceRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PelletizerUpRollerMaintenanceRecord.class)
public interface PelletizerUpRollerMaintenanceRecordService extends EntityResolver<PelletizerUpRollerMaintenanceRecord, Long>, ValidatorService<PelletizerUpRollerMaintenanceRecord> {
}
