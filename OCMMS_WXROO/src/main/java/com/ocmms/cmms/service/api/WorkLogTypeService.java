package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.assistance.WorkLogType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkLogTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkLogType.class)
public interface WorkLogTypeService extends EntityResolver<WorkLogType, Long>, ValidatorService<WorkLogType> {
}
