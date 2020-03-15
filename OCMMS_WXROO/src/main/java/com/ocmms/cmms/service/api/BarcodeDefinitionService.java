package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.system.BarcodeDefinition;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = BarcodeDefinitionService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = BarcodeDefinition.class)
public interface BarcodeDefinitionService extends EntityResolver<BarcodeDefinition, Long>, ValidatorService<BarcodeDefinition> {
}
