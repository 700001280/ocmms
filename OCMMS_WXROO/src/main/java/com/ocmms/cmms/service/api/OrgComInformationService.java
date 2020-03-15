package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.hrm.OrgComInformation;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = OrgComInformationService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = OrgComInformation.class)
public interface OrgComInformationService extends EntityResolver<OrgComInformation, Long>, ValidatorService<OrgComInformation> {
}
