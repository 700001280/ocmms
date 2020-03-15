package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = NotificationUserStatusWithNumberService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = NotificationUserStatusWithNumber.class)
public interface NotificationUserStatusWithNumberService extends EntityResolver<NotificationUserStatusWithNumber, Long>, ValidatorService<NotificationUserStatusWithNumber> {
}
