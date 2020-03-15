package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.assistance.WorkLog;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkLogService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkLog.class)
public interface WorkLogService extends EntityResolver<WorkLog, Long>, ValidatorService<WorkLog> {
}
