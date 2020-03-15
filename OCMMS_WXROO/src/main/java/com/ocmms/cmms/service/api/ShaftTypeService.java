package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pp.configuration.ShaftType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ShaftTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ShaftType.class)
public interface ShaftTypeService extends EntityResolver<ShaftType, Long>, ValidatorService<ShaftType> {
}
