package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.PelletizerMaintenanceRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PelletizerMaintenanceRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PelletizerMaintenanceRecord.class)
public interface PelletizerMaintenanceRecordService extends EntityResolver<PelletizerMaintenanceRecord, Long>, ValidatorService<PelletizerMaintenanceRecord> {
}
