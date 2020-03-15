package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationSystemStatus;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = NotificationSystemStatusesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationSystemStatus.class, type = ControllerType.ITEM)
@RooThymeleaf
public class NotificationSystemStatusesItemThymeleafController implements ConcurrencyManager<NotificationSystemStatus> {
}
