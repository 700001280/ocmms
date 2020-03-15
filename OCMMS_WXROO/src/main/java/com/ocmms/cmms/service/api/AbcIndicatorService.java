package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.AbcIndicator;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = AbcIndicatorService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = AbcIndicator.class)
public interface AbcIndicatorService extends EntityResolver<AbcIndicator, Long>, ValidatorService<AbcIndicator> {
}
