package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.notification.NotificationItem;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = NotificationItemService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = NotificationItem.class)
public interface NotificationItemService extends EntityResolver<NotificationItem, Long>, ValidatorService<NotificationItem> {
}
