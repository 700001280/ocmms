package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialCatalogService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialCatalog.class)
public interface MaterialCatalogService extends EntityResolver<MaterialCatalog, Long>, ValidatorService<MaterialCatalog> {
}
