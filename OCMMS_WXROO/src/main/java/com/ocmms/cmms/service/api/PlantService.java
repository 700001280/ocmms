package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.hrm.Plant;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PlantService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Plant.class)
public interface PlantService extends EntityResolver<Plant, Long>, ValidatorService<Plant> {
}
