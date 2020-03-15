package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.PelletizerCutterReplaceRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PelletizerCutterReplaceRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PelletizerCutterReplaceRecord.class)
public interface PelletizerCutterReplaceRecordService extends EntityResolver<PelletizerCutterReplaceRecord, Long>, ValidatorService<PelletizerCutterReplaceRecord> {
}
