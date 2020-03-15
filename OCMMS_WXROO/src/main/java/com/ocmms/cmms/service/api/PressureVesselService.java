package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureVessel;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PressureVesselService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PressureVessel.class)
public interface PressureVesselService extends EntityResolver<PressureVessel, Long>, ValidatorService<PressureVessel> {
}
