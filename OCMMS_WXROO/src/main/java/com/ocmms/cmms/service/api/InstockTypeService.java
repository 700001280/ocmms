package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.master.InstockType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = InstockTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = InstockType.class)
public interface InstockTypeService extends EntityResolver<InstockType, Long>, ValidatorService<InstockType> {
}
