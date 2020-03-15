package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PlantSectionService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PlantSection.class)
public interface PlantSectionService extends EntityResolver<PlantSection, Long>, ValidatorService<PlantSection> {
}
