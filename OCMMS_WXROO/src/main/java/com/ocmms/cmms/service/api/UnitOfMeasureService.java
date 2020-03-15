package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = UnitOfMeasureService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = UnitOfMeasure.class)
public interface UnitOfMeasureService extends EntityResolver<UnitOfMeasure, Long>, ValidatorService<UnitOfMeasure> {
}
