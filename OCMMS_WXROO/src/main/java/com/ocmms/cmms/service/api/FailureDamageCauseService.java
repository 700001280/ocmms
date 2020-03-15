package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.notification.FailureDamageCause;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = FailureDamageCauseService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = FailureDamageCause.class)
public interface FailureDamageCauseService extends EntityResolver<FailureDamageCause, Long>, ValidatorService<FailureDamageCause> {
}
