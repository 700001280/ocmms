package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ObjectTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ObjectType.class)
public interface ObjectTypeService extends EntityResolver<ObjectType, Long>, ValidatorService<ObjectType> {
}
