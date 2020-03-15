package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.common.Region;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = RegionService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Region.class)
public interface RegionService extends EntityResolver<Region, Long>, ValidatorService<Region> {
}
