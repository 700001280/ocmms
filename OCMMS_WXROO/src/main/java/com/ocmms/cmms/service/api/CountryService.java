package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.common.Country;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = CountryService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Country.class)
public interface CountryService extends EntityResolver<Country, Long>, ValidatorService<Country> {
}
