package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.master.MaterialAttribute;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialAttributeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialAttribute.class)
public interface MaterialAttributeService extends EntityResolver<MaterialAttribute, Long>, ValidatorService<MaterialAttribute> {
}
