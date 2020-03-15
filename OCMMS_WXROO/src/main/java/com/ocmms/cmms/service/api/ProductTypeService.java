package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pp.configuration.ProductType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProductTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ProductType.class)
public interface ProductTypeService extends EntityResolver<ProductType, Long>, ValidatorService<ProductType> {
}
