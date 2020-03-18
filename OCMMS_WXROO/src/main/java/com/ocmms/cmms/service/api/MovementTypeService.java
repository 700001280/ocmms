package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.MovementType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MovementTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MovementType.class)
public interface MovementTypeService extends EntityResolver<MovementType, Long>, ValidatorService<MovementType> {
}
