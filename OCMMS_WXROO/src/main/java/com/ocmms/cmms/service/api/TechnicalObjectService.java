package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TechnicalObjectService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TechnicalObject.class)
public interface TechnicalObjectService extends EntityResolver<TechnicalObject, Long>, ValidatorService<TechnicalObject> {
}
