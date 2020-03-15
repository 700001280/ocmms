package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = CriticalClassificationService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = CriticalClassification.class)
public interface CriticalClassificationService extends EntityResolver<CriticalClassification, Long>, ValidatorService<CriticalClassification> {
}
