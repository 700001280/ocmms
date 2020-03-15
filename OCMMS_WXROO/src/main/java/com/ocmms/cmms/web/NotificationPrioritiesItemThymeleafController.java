package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = NotificationPrioritiesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationPriority.class, type = ControllerType.ITEM)
@RooThymeleaf
public class NotificationPrioritiesItemThymeleafController implements ConcurrencyManager<NotificationPriority> {
}
