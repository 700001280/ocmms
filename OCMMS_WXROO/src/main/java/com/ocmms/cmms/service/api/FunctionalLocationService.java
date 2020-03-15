package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = FunctionalLocationService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = FunctionalLocation.class)
public interface FunctionalLocationService extends EntityResolver<FunctionalLocation, Long>, ValidatorService<FunctionalLocation> {
}
