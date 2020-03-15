package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.procurement.PriorityType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PriorityTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PriorityType.class)
public interface PriorityTypeService extends EntityResolver<PriorityType, Long>, ValidatorService<PriorityType> {
}
