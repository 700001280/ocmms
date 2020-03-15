package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.AuthourizationGroup;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = AuthourizationGroupService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = AuthourizationGroup.class)
public interface AuthourizationGroupService extends EntityResolver<AuthourizationGroup, Long>, ValidatorService<AuthourizationGroup> {
}
