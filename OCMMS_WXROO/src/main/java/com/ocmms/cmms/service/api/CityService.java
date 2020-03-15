package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.common.City;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = CityService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = City.class)
public interface CityService extends EntityResolver<City, Long>, ValidatorService<City> {
}
