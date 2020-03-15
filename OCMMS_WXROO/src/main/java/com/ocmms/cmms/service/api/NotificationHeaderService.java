package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = NotificationHeaderService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = NotificationHeader.class)
public interface NotificationHeaderService extends EntityResolver<NotificationHeader, Long>, ValidatorService<NotificationHeader> {
}
