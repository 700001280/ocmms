package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PartMaintenanceRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PartMaintenanceRecord.class)
public interface PartMaintenanceRecordService extends EntityResolver<PartMaintenanceRecord, Long>, ValidatorService<PartMaintenanceRecord> {
}
