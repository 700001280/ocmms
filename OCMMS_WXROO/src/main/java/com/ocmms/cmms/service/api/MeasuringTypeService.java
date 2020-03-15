package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MeasuringTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MeasuringType.class)
public interface MeasuringTypeService extends EntityResolver<MeasuringType, Long>, ValidatorService<MeasuringType> {
}
