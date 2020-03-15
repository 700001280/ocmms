package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = NotificationTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class NotificationTypesItemThymeleafController implements ConcurrencyManager<NotificationType> {
}
