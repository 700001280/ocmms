package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.loto.IsolationMethod;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = IsolationMethodService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = IsolationMethod.class)
public interface IsolationMethodService extends EntityResolver<IsolationMethod, Long>, ValidatorService<IsolationMethod> {
}
