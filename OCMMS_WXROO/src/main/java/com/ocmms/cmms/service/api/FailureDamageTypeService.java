package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.notification.FailureDamageType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = FailureDamageTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = FailureDamageType.class)
public interface FailureDamageTypeService extends EntityResolver<FailureDamageType, Long>, ValidatorService<FailureDamageType> {
}
