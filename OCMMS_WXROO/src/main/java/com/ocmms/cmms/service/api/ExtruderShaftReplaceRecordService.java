package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.ExtruderShaftReplaceRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ExtruderShaftReplaceRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ExtruderShaftReplaceRecord.class)
public interface ExtruderShaftReplaceRecordService extends EntityResolver<ExtruderShaftReplaceRecord, Long>, ValidatorService<ExtruderShaftReplaceRecord> {
}
