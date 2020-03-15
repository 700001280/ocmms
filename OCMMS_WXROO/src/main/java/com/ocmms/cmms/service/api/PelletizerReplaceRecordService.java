package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.PelletizerReplaceRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PelletizerReplaceRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PelletizerReplaceRecord.class)
public interface PelletizerReplaceRecordService extends EntityResolver<PelletizerReplaceRecord, Long>, ValidatorService<PelletizerReplaceRecord> {
}
