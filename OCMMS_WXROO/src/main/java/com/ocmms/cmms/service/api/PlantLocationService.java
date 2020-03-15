package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PlantLocationService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PlantLocation.class)
public interface PlantLocationService extends EntityResolver<PlantLocation, Long>, ValidatorService<PlantLocation> {
}
