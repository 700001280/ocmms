package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Hoist;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = HoistService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Hoist.class)
public interface HoistService extends EntityResolver<Hoist, Long>, ValidatorService<Hoist> {
}
