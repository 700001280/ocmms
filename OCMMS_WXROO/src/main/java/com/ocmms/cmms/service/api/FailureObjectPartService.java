package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.notification.FailureObjectPart;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = FailureObjectPartService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = FailureObjectPart.class)
public interface FailureObjectPartService extends EntityResolver<FailureObjectPart, Long>, ValidatorService<FailureObjectPart> {
}
