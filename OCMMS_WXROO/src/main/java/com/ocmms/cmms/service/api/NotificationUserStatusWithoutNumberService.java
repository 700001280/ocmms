package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithoutNumber;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = NotificationUserStatusWithoutNumberService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = NotificationUserStatusWithoutNumber.class)
public interface NotificationUserStatusWithoutNumberService extends EntityResolver<NotificationUserStatusWithoutNumber, Long>, ValidatorService<NotificationUserStatusWithoutNumber> {
}
