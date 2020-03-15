package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.hrm.OrganizationCatalog;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = OrganizationCatalogService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = OrganizationCatalog.class)
public interface OrganizationCatalogService extends EntityResolver<OrganizationCatalog, Long>, ValidatorService<OrganizationCatalog> {
}
