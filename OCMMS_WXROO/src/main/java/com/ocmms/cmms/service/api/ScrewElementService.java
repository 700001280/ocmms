package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.master.ScrewElement;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ScrewElementService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ScrewElement.class)
public interface ScrewElementService extends EntityResolver<ScrewElement, Long>, ValidatorService<ScrewElement> {
}
