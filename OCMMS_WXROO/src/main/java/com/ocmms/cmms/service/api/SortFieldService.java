package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.SortField;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = SortFieldService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = SortField.class)
public interface SortFieldService extends EntityResolver<SortField, Long>, ValidatorService<SortField> {
}
