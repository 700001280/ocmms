package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureGage;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PressureGageService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PressureGage.class)
public interface PressureGageService extends EntityResolver<PressureGage, Long>, ValidatorService<PressureGage> {
}
