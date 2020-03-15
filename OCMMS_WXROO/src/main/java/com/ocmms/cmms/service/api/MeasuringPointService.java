package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MeasuringPointService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MeasuringPoint.class)
public interface MeasuringPointService extends EntityResolver<MeasuringPoint, Long>, ValidatorService<MeasuringPoint> {
}
