package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.system.RecordStatus;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = RecordStatusService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = RecordStatus.class)
public interface RecordStatusService extends EntityResolver<RecordStatus, Long>, ValidatorService<RecordStatus> {
}
