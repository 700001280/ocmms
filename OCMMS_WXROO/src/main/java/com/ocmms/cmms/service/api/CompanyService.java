package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.hrm.Company;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = CompanyService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Company.class)
public interface CompanyService extends EntityResolver<Company, Long>, ValidatorService<Company> {
}
