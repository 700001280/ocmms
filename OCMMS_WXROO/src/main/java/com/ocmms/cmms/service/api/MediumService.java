package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.measuringpoint.Medium;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MediumService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Medium.class)
public interface MediumService extends EntityResolver<Medium, Long>, ValidatorService<Medium> {
}
