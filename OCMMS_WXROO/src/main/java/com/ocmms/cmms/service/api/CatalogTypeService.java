package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.procurement.CatalogType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = CatalogTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = CatalogType.class)
public interface CatalogTypeService extends EntityResolver<CatalogType, Long>, ValidatorService<CatalogType> {
}
