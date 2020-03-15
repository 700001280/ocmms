package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.PartReplaceRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PartReplaceRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PartReplaceRecord.class)
public interface PartReplaceRecordService extends EntityResolver<PartReplaceRecord, Long>, ValidatorService<PartReplaceRecord> {
}
