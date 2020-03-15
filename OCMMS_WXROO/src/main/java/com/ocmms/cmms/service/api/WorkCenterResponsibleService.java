package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WorkCenterResponsibleService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = WorkCenterResponsible.class)
public interface WorkCenterResponsibleService extends EntityResolver<WorkCenterResponsible, Long>, ValidatorService<WorkCenterResponsible> {
}
