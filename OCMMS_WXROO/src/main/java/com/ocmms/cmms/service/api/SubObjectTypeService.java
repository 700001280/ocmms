package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.SubObjectType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = SubObjectTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = SubObjectType.class)
public interface SubObjectTypeService extends EntityResolver<SubObjectType, Long>, ValidatorService<SubObjectType> {
}
