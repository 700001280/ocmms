package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.hrm.Organization;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = OrganizationService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Organization.class)
public interface OrganizationService extends EntityResolver<Organization, Long>, ValidatorService<Organization> {
}
