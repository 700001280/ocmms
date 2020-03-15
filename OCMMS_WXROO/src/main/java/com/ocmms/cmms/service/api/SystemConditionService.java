package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = SystemConditionService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = SystemCondition.class)
public interface SystemConditionService extends EntityResolver<SystemCondition, Long>, ValidatorService<SystemCondition> {
}
