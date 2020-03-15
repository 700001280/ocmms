package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ServiceCatalogService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ServiceCatalog.class)
public interface ServiceCatalogService extends EntityResolver<ServiceCatalog, Long>, ValidatorService<ServiceCatalog> {
}
