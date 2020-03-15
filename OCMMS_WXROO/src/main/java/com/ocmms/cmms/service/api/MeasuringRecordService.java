package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MeasuringRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MeasuringRecord.class)
public interface MeasuringRecordService extends EntityResolver<MeasuringRecord, Long>, ValidatorService<MeasuringRecord> {
}
