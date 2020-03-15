package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = NotificationPriorityService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = NotificationPriority.class)
public interface NotificationPriorityService extends EntityResolver<NotificationPriority, Long>, ValidatorService<NotificationPriority> {
}
