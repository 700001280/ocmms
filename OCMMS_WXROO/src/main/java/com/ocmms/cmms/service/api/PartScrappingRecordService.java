package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PartScrappingRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PartScrappingRecord.class)
public interface PartScrappingRecordService extends EntityResolver<PartScrappingRecord, Long>, ValidatorService<PartScrappingRecord> {
}
