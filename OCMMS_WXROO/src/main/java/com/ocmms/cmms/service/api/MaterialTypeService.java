package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.master.MaterialType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialType.class)
public interface MaterialTypeService extends EntityResolver<MaterialType, Long>, ValidatorService<MaterialType> {
}
