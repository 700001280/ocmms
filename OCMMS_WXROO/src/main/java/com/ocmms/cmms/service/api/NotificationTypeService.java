package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.notification.NotificationType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = NotificationTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = NotificationType.class)
public interface NotificationTypeService extends EntityResolver<NotificationType, Long>, ValidatorService<NotificationType> {
}
